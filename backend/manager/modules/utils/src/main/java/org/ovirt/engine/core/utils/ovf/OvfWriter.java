package org.ovirt.engine.core.utils.ovf;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.ovirt.engine.core.common.businessentities.UsbPolicy;
import org.ovirt.engine.core.common.businessentities.VM;
import org.ovirt.engine.core.common.businessentities.VmBase;
import org.ovirt.engine.core.common.businessentities.VmDevice;
import org.ovirt.engine.core.common.businessentities.VmDeviceGeneralType;
import org.ovirt.engine.core.common.businessentities.VmInit;
import org.ovirt.engine.core.common.businessentities.VmPayload;
import org.ovirt.engine.core.common.businessentities.network.VmNetworkInterface;
import org.ovirt.engine.core.common.businessentities.storage.DiskImage;
import org.ovirt.engine.core.common.config.Config;
import org.ovirt.engine.core.common.config.ConfigValues;
import org.ovirt.engine.core.common.utils.VmDeviceCommonUtils;
import org.ovirt.engine.core.common.utils.VmDeviceType;
import org.ovirt.engine.core.compat.Guid;
import org.ovirt.engine.core.compat.Version;
import org.ovirt.engine.core.utils.VmInitUtils;
import org.ovirt.engine.core.utils.customprop.DevicePropertiesUtils;
import org.ovirt.engine.core.utils.ovf.xml.XmlDocument;
import org.ovirt.engine.core.utils.ovf.xml.XmlTextWriter;

public abstract class OvfWriter implements IOvfBuilder {
    protected int _instanceId;
    protected List<DiskImage> _images;
    protected XmlTextWriter _writer;
    protected XmlDocument _document;
    protected VM _vm;
    protected VmBase vmBase;
    private Version version;
    private int diskCounter;
    /** map disk alias to backward compatible disk alias */
    private Map<String, String> diskAliasesMap;

    public OvfWriter(VmBase vmBase, List<DiskImage> images, Version version) {
        _document = new XmlDocument();
        _images = images;
        _writer = new XmlTextWriter();
        this.vmBase = vmBase;
        this.version = version;
        if (version.compareTo(Version.v3_1) < 0) {
            diskAliasesMap = new HashMap<>();
        }
        writeHeader();
    }

    private void writeHeader() {
        _instanceId = 0;
        _writer.writeStartDocument(false);

        _writer.setPrefix(OVF_PREFIX, OVF_URI);
        _writer.setPrefix(RASD_PREFIX, RASD_URI);
        _writer.setPrefix(VSSD_PREFIX, VSSD_URI);
        _writer.setPrefix(XSI_PREFIX, XSI_URI);

        _writer.writeStartElement(OVF_URI, "Envelope");
        _writer.writeNamespace(OVF_PREFIX, OVF_URI);
        _writer.writeNamespace(RASD_PREFIX, RASD_URI);
        _writer.writeNamespace(VSSD_PREFIX, VSSD_URI);
        _writer.writeNamespace(XSI_PREFIX, XSI_URI);

        // Setting the OVF version according to ENGINE (in 2.2 , version was set to "0.9")
        _writer.writeAttributeString(OVF_URI, "version", Config.<String>getValue(ConfigValues.VdcVersion));
    }

    protected long bytesToGigabyte(long bytes) {
        return bytes / 1024 / 1024 / 1024;
    }

    @Override
    public void buildReference() {
        _writer.writeStartElement("References");
        for (DiskImage image : _images) {
            _writer.writeStartElement("File");
            _writer.writeAttributeString(OVF_URI, "href", OvfParser.createImageFile(image));
            _writer.writeAttributeString(OVF_URI, "id", image.getImageId().toString());
            _writer.writeAttributeString(OVF_URI, "size", String.valueOf(image.getSize()));
            _writer.writeAttributeString(OVF_URI, "description", StringUtils.defaultString(image.getDescription()));
            _writer.writeAttributeString(OVF_URI, "disk_storage_type", image.getDiskStorageType().name());
            _writer.writeAttributeString(OVF_URI, "cinder_volume_type", StringUtils.defaultString(image.getCinderVolumeType()));
            _writer.writeEndElement();

        }
        for (VmNetworkInterface iface : vmBase.getInterfaces()) {
            _writer.writeStartElement("Nic");
            _writer.writeAttributeString(OVF_URI, "id", iface.getId().toString());
            _writer.writeEndElement();
        }
        _writer.writeEndElement();
    }

    protected void writeVmInit() {
        if (vmBase.getVmInit() != null) {
            VmInit vmInit = vmBase.getVmInit();
            _writer.writeStartElement("VmInit");
            if (vmInit.getHostname() != null) {
                _writer.writeAttributeString(OVF_URI, "hostname", vmInit.getHostname());
            }
            if (vmInit.getDomain() != null) {
                _writer.writeAttributeString(OVF_URI, "domain", vmInit.getDomain());
            }
            if (vmInit.getTimeZone() != null) {
                _writer.writeAttributeString(OVF_URI, "timeZone", vmInit.getTimeZone());
            }
            if (vmInit.getAuthorizedKeys() != null) {
                _writer.writeAttributeString(OVF_URI, "authorizedKeys", vmInit.getAuthorizedKeys());
            }
            if (vmInit.getRegenerateKeys() != null) {
                _writer.writeAttributeString(OVF_URI, "regenerateKeys", vmInit.getRegenerateKeys().toString());
            }
            if (vmInit.getDnsSearch() != null) {
                _writer.writeAttributeString(OVF_URI, "dnsSearch", vmInit.getDnsSearch());
            }
            if (vmInit.getDnsServers() != null) {
                _writer.writeAttributeString(OVF_URI, "dnsServers", vmInit.getDnsServers());
            }
            if (vmInit.getNetworks() != null) {
                _writer.writeAttributeString(OVF_URI, "networks", VmInitUtils.networkListToJson(vmInit.getNetworks()));
            }
            if (vmInit.getWinKey() != null) {
                _writer.writeAttributeString(OVF_URI, "winKey", vmInit.getWinKey());
            }
            if (vmInit.getRootPassword() != null) {
                _writer.writeAttributeString(OVF_URI, "rootPassword", vmInit.getRootPassword());
            }
            if (vmInit.getCustomScript() != null) {
                _writer.writeAttributeString(OVF_URI, "customScript", vmInit.getCustomScript());
            }
            _writer.writeEndElement();
        }
    }

    @Override
    public void buildNetwork() {
        _writer.writeStartElement("Section");
        _writer.writeAttributeString(XSI_URI, "type", OVF_PREFIX + ":NetworkSection_Type");
        _writer.writeStartElement("Info");
        _writer.writeRaw("List of networks");
        _writer.writeEndElement();
        _writer.writeStartElement("Network");
        _writer.writeAttributeString(OVF_URI, "name", "Network 1");
        _writer.writeEndElement();
        _writer.writeEndElement();
    }

    @Override
    public void buildDisk() {
        _writer.writeStartElement("Section");
        _writer.writeAttributeString(XSI_URI, "type", OVF_PREFIX + ":DiskSection_Type");
        _writer.writeStartElement("Info");
        _writer.writeRaw("List of Virtual Disks");
        _writer.writeEndElement();
        for (DiskImage image : _images) {
            _writer.writeStartElement("Disk");
            _writer.writeAttributeString(OVF_URI, "diskId", image.getImageId().toString());
            _writer.writeAttributeString(OVF_URI, "size", String.valueOf(bytesToGigabyte(image.getSize())));
            _writer.writeAttributeString(OVF_URI,
                    "actual_size",
                    String.valueOf(bytesToGigabyte(image.getActualSizeInBytes())));
            _writer.writeAttributeString(OVF_URI, "vm_snapshot_id", (image.getVmSnapshotId() != null) ? image
                    .getVmSnapshotId().toString() : "");

            if (image.getParentId().equals(Guid.Empty)) {
                _writer.writeAttributeString(OVF_URI, "parentRef", "");
            } else {
                int i = 0;
                while (_images.get(i).getImageId().equals(image.getParentId()))
                    i++;
                List<DiskImage> res = _images.subList(i, _images.size() - 1);

                if (res.size() > 0) {
                    _writer.writeAttributeString(OVF_URI, "parentRef", OvfParser.createImageFile(res.get(0)));
                } else {
                    _writer.writeAttributeString(OVF_URI, "parentRef", "");
                }
            }

            _writer.writeAttributeString(OVF_URI, "fileRef", OvfParser.createImageFile(image));

            String format = "";
            switch (image.getVolumeFormat()) {
            case RAW:
                format = "http://www.vmware.com/specifications/vmdk.html#sparse";
                break;

            case COW:
                format = "http://www.gnome.org/~markmc/qcow-image-format.html";
                break;

            case Unassigned:
                break;

            default:
                break;
            }
            _writer.writeAttributeString(OVF_URI, "format", format);
            _writer.writeAttributeString(OVF_URI, "volume-format", image.getVolumeFormat().toString());
            _writer.writeAttributeString(OVF_URI, "volume-type", image.getVolumeType().toString());
            _writer.writeAttributeString(OVF_URI, "disk-interface", image.getDiskInterface().toString());
            _writer.writeAttributeString(OVF_URI, "boot", String.valueOf(image.isBoot()));
            if (image.getDiskAlias() != null) {
                _writer.writeAttributeString(OVF_URI, "disk-alias", image.getDiskAlias());
            }
            if (image.getDiskDescription() != null) {
                _writer.writeAttributeString(OVF_URI, "disk-description", image.getDiskDescription());
            }
            _writer.writeAttributeString(OVF_URI, "wipe-after-delete",
                    String.valueOf(image.isWipeAfterDelete()));
            _writer.writeEndElement();
        }
        _writer.writeEndElement();
    }

    @Override
    public void buildVirtualSystem() {
        // General Vm
        _writer.writeStartElement("Content");
        _writer.writeAttributeString(OVF_URI, "id", "out");
        _writer.writeAttributeString(XSI_URI, "type", OVF_PREFIX + ":VirtualSystem_Type");

        // General Data
        writeGeneralData();

        // Application List
        writeAppList();

        // Content Items
        writeContentItems();

        _writer.writeEndElement(); // End Content tag
    }

    protected void writeGeneralData() {
        if (vmBase.getDescription() != null) {
            _writer.writeStartElement(OvfProperties.DESCRIPTION);
            _writer.writeRaw(vmBase.getDescription());
            _writer.writeEndElement();
        }

        if (vmBase.getComment() != null) {
            _writer.writeStartElement(OvfProperties.COMMENT);
            _writer.writeRaw(vmBase.getComment());
            _writer.writeEndElement();
        }

        if (!vmInitEnabled() && vmBase.getVmInit() != null && vmBase.getVmInit().getDomain() != null) {
            _writer.writeStartElement(OvfProperties.DOMAIN);
            _writer.writeRaw(vmBase.getVmInit().getDomain());
            _writer.writeEndElement();
        }

        _writer.writeStartElement(OvfProperties.CREATION_DATE);
        _writer.writeRaw(OvfParser.localDateToUtcDateString(vmBase.getCreationDate()));
        _writer.writeEndElement();

        _writer.writeStartElement(OvfProperties.EXPORT_DATE);
        _writer.writeRaw(OvfParser.localDateToUtcDateString(new Date()));
        _writer.writeEndElement();

        _writer.writeStartElement(OvfProperties.DELETE_PROTECTED);
        _writer.writeRaw(String.valueOf(vmBase.isDeleteProtected()));
        _writer.writeEndElement();

        if (vmBase.getSsoMethod() != null) {
            _writer.writeStartElement(OvfProperties.SSO_METHOD);
            _writer.writeRaw(vmBase.getSsoMethod().toString());
            _writer.writeEndElement();
        }

        _writer.writeStartElement(OvfProperties.IS_SMARTCARD_ENABLED);
        _writer.writeRaw(String.valueOf(vmBase.isSmartcardEnabled()));
        _writer.writeEndElement();

        if (vmBase.getNumOfIoThreads() != 0) {
            _writer.writeStartElement(OvfProperties.NUM_OF_IOTHREADS);
            _writer.writeRaw(String.valueOf(vmBase.getNumOfIoThreads()));
            _writer.writeEndElement();
        }

        _writer.writeStartElement(OvfProperties.TIMEZONE);
        _writer.writeRaw(vmBase.getTimeZone());
        _writer.writeEndElement();

        _writer.writeStartElement(OvfProperties.DEFAULT_BOOT_SEQUENCE);
        _writer.writeRaw(String.valueOf(vmBase.getDefaultBootSequence().getValue()));
        _writer.writeEndElement();

        if (!StringUtils.isBlank(vmBase.getInitrdUrl())) {
            _writer.writeStartElement(OvfProperties.INITRD_URL);
            _writer.writeRaw(vmBase.getInitrdUrl());
            _writer.writeEndElement();
        }
        if (!StringUtils.isBlank(vmBase.getKernelUrl())) {
            _writer.writeStartElement(OvfProperties.KERNEL_URL);
            _writer.writeRaw(vmBase.getKernelUrl());
            _writer.writeEndElement();
        }
        if (!StringUtils.isBlank(vmBase.getKernelParams())) {
            _writer.writeStartElement(OvfProperties.KERNEL_PARAMS);
            _writer.writeRaw(vmBase.getKernelParams());
            _writer.writeEndElement();
        }

        _writer.writeStartElement(OvfProperties.GENERATION);
        _writer.writeRaw(String.valueOf(vmBase.getDbGeneration()));
        _writer.writeEndElement();

        _writer.writeStartElement(OvfProperties.VM_TYPE);
        _writer.writeRaw(String.valueOf(vmBase.getVmType().getValue()));
        _writer.writeEndElement();

        if (vmBase.getTunnelMigration() != null) {
            _writer.writeStartElement(OvfProperties.TUNNEL_MIGRATION);
            _writer.writeRaw(String.valueOf(vmBase.getTunnelMigration()));
            _writer.writeEndElement();
        }

        if (vmBase.getVncKeyboardLayout() != null) {
            _writer.writeStartElement(OvfProperties.VNC_KEYBOARD_LAYOUT);
            _writer.writeRaw(vmBase.getVncKeyboardLayout());
            _writer.writeEndElement();
        }

        _writer.writeStartElement(OvfProperties.MIN_ALLOCATED_MEMORY);
        _writer.writeRaw(String.valueOf(vmBase.getMinAllocatedMem()));
        _writer.writeEndElement();

        _writer.writeStartElement(OvfProperties.IS_STATELESS);
        _writer.writeRaw(String.valueOf(vmBase.isStateless()));
        _writer.writeEndElement();

        _writer.writeStartElement(OvfProperties.IS_RUN_AND_PAUSE);
        _writer.writeRaw(String.valueOf(vmBase.isRunAndPause()));
        _writer.writeEndElement();

        _writer.writeStartElement(OvfProperties.AUTO_STARTUP);
        _writer.writeRaw(String.valueOf(vmBase.isAutoStartup()));
        _writer.writeEndElement();

        _writer.writeStartElement(OvfProperties.PRIORITY);
        _writer.writeRaw(String.valueOf(vmBase.getPriority()));
        _writer.writeEndElement();

        if (vmBase.getCreatedByUserId() != null) {
            _writer.writeStartElement(OvfProperties.CREATED_BY_USER_ID);
            _writer.writeRaw(String.valueOf(vmBase.getCreatedByUserId()));
            _writer.writeEndElement();
        }

        if (vmBase.getMigrationDowntime() != null) {
            _writer.writeStartElement(OvfProperties.MIGRATION_DOWNTIME);
            _writer.writeRaw(String.valueOf(vmBase.getMigrationDowntime()));
            _writer.writeEndElement();
        }
        writeVmInit();

        if (vmBase.getMigrationSupport() != null) {
            _writer.writeStartElement(OvfProperties.MIGRATION_SUPPORT);
            _writer.writeRaw(String.valueOf(vmBase.getMigrationSupport().getValue()));
            _writer.writeEndElement();
        }

        // TODO dedicated to multiple hosts - are we breaking any standard here?
        if (vmBase.getDedicatedVmForVdsList().size() > 0) {
            for (Guid hostId : vmBase.getDedicatedVmForVdsList()) {
                _writer.writeStartElement(OvfProperties.DEDICATED_VM_FOR_VDS);
                _writer.writeRaw(String.valueOf(hostId));
                _writer.writeEndElement();
            }
        }

        if (vmBase.getSerialNumberPolicy() != null) {
            _writer.writeStartElement(OvfProperties.SERIAL_NUMBER_POLICY);
            _writer.writeRaw(String.valueOf(vmBase.getSerialNumberPolicy().getValue()));
            _writer.writeEndElement();
        }

        if (vmBase.getCustomSerialNumber() != null) {
            _writer.writeStartElement(OvfProperties.CUSTOM_SERIAL_NUMBER);
            _writer.writeRaw(vmBase.getCustomSerialNumber());
            _writer.writeEndElement();
        }

        _writer.writeStartElement(OvfProperties.IS_BOOT_MENU_ENABLED);
        _writer.writeRaw(String.valueOf(vmBase.isBootMenuEnabled()));
        _writer.writeEndElement();

        _writer.writeStartElement(OvfProperties.IS_SPICE_FILE_TRANSFER_ENABLED);
        _writer.writeRaw(String.valueOf(vmBase.isSpiceFileTransferEnabled()));
        _writer.writeEndElement();

        _writer.writeStartElement(OvfProperties.IS_SPICE_COPY_PASTE_ENABLED);
        _writer.writeRaw(String.valueOf(vmBase.isSpiceCopyPasteEnabled()));
        _writer.writeEndElement();

        if (vmBase.getAutoConverge() != null) {
            _writer.writeStartElement(OvfProperties.IS_AUTO_CONVERGE);
            _writer.writeRaw(String.valueOf(vmBase.getAutoConverge()));
            _writer.writeEndElement();
        }

        if (vmBase.getMigrateCompressed() != null) {
            _writer.writeStartElement(OvfProperties.IS_MIGRATE_COMPRESSED);
            _writer.writeRaw(String.valueOf(vmBase.getMigrateCompressed()));
            _writer.writeEndElement();
        }

        _writer.writeStartElement(OvfProperties.CUSTOM_EMULATED_MACHINE);
        _writer.writeRaw(vmBase.getCustomEmulatedMachine());
        _writer.writeEndElement();

        _writer.writeStartElement(OvfProperties.CUSTOM_CPU_NAME);
        _writer.writeRaw(vmBase.getCustomCpuName());
        _writer.writeEndElement();

        _writer.writeStartElement(OvfProperties.PREDEFINED_PROPERTIES);
        _writer.writeRaw(vmBase.getPredefinedProperties());
        _writer.writeEndElement();

        _writer.writeStartElement(OvfProperties.USER_DEFINED_PROPERTIES);
        _writer.writeRaw(vmBase.getUserDefinedProperties());
        _writer.writeEndElement();
    }

    protected abstract void writeAppList();

    protected abstract void writeContentItems();

    protected void writeManagedDeviceInfo(VmBase vmBase, XmlTextWriter writer, Guid deviceId) {
        VmDevice vmDevice = vmBase.getManagedDeviceMap().get(deviceId);
        if (deviceId != null && vmDevice != null && vmDevice.getAddress() != null) {
            writeVmDeviceInfo(vmDevice);
        }
    }

    protected void writeOtherDevices(VmBase vmBase, XmlTextWriter write) {
        List<VmDevice> devices = vmBase.getUnmanagedDeviceList();

        Collection<VmDevice> managedDevices = vmBase.getManagedDeviceMap().values();
        for (VmDevice device : managedDevices) {
            if (VmDeviceCommonUtils.isSpecialDevice(device.getDevice(), device.getType())) {
                devices.add(device);
            }
        }

        for (VmDevice vmDevice : devices) {
            _writer.writeStartElement("Item");
            _writer.writeStartElement(RASD_URI, "ResourceType");
            _writer.writeRaw(OvfHardware.OTHER);
            _writer.writeEndElement();
            _writer.writeStartElement(RASD_URI, "InstanceId");
            _writer.writeRaw(vmDevice.getId().getDeviceId().toString());
            _writer.writeEndElement();
            writeVmDeviceInfo(vmDevice);
            _writer.writeEndElement(); // item
        }
    }

    protected void writeMonitors(VmBase vmBase) {
        Collection<VmDevice> devices = vmBase.getManagedDeviceMap().values();
        int numOfMonitors = vmBase.getNumOfMonitors();
        int i = 0;
        for (VmDevice vmDevice : devices) {
            if (vmDevice.getType() == VmDeviceGeneralType.VIDEO) {
                _writer.writeStartElement("Item");
                _writer.writeStartElement(RASD_URI, "Caption");
                _writer.writeRaw("Graphical Controller");
                _writer.writeEndElement();
                _writer.writeStartElement(RASD_URI, "InstanceId");
                _writer.writeRaw(vmDevice.getId().getDeviceId().toString());
                _writer.writeEndElement();
                _writer.writeStartElement(RASD_URI, "ResourceType");
                _writer.writeRaw(OvfHardware.Monitor);
                _writer.writeEndElement();
                _writer.writeStartElement(RASD_URI, "VirtualQuantity");
                // we should write number of monitors for each entry for backward compatibility
                _writer.writeRaw(String.valueOf(numOfMonitors));
                _writer.writeEndElement();
                _writer.writeStartElement(RASD_URI, "SinglePciQxl");
                _writer.writeRaw(String.valueOf(vmBase.getSingleQxlPci()));
                _writer.writeEndElement();
                writeVmDeviceInfo(vmDevice);
                _writer.writeEndElement(); // item
                if (i++ == numOfMonitors) {
                    break;
                }
            }
        }
    }

    protected void writeGraphics(VmBase vmBase) {
        Collection<VmDevice> devices = vmBase.getManagedDeviceMap().values();
        for (VmDevice vmDevice : devices) {
            if (vmDevice.getType() == VmDeviceGeneralType.GRAPHICS) {
                _writer.writeStartElement("Item");
                _writer.writeStartElement(RASD_URI, "Caption");
                _writer.writeRaw("Graphical Framebuffer");
                _writer.writeEndElement();
                _writer.writeStartElement(RASD_URI, "InstanceId");
                _writer.writeRaw(vmDevice.getId().getDeviceId().toString());
                _writer.writeEndElement();
                _writer.writeStartElement(RASD_URI, "ResourceType");
                _writer.writeRaw(OvfHardware.Graphics);
                _writer.writeEndElement();
                writeVmDeviceInfo(vmDevice);
                _writer.writeEndElement(); // item
            }
        }
    }

    protected void writeCd(VmBase vmBase) {
        Collection<VmDevice> devices = vmBase.getManagedDeviceMap().values();
        for (VmDevice vmDevice : devices) {
            if (vmDevice.getDevice().equals(VmDeviceType.CDROM.getName())) {
                _writer.writeStartElement("Item");
                _writer.writeStartElement(RASD_URI, "Caption");
                _writer.writeRaw("CDROM");
                _writer.writeEndElement();
                _writer.writeStartElement(RASD_URI, "InstanceId");
                _writer.writeRaw(vmDevice.getId().getDeviceId().toString());
                _writer.writeEndElement();
                _writer.writeStartElement(RASD_URI, "ResourceType");
                _writer.writeRaw(OvfHardware.CD);
                _writer.writeEndElement();
                writeVmDeviceInfo(vmDevice);
                _writer.writeEndElement(); // item
                break; // only one CD is currently supported
            }
        }
    }

    private void writeVmDeviceInfo(VmDevice vmDevice) {
        _writer.writeStartElement(OvfProperties.VMD_TYPE);
        _writer.writeRaw(String.valueOf(vmDevice.getType().getValue()));
        _writer.writeEndElement();
        _writer.writeStartElement(OvfProperties.VMD_DEVICE);
        _writer.writeRaw(String.valueOf(vmDevice.getDevice()));
        _writer.writeEndElement();
        _writer.writeStartElement(OvfProperties.VMD_ADDRESS);
        _writer.writeRaw(vmDevice.getAddress());
        _writer.writeEndElement();
        _writer.writeStartElement(OvfProperties.VMD_BOOT_ORDER);
        _writer.writeRaw(String.valueOf(vmDevice.getBootOrder()));
        _writer.writeEndElement();
        _writer.writeStartElement(OvfProperties.VMD_IS_PLUGGED);
        _writer.writeRaw(String.valueOf(vmDevice.getIsPlugged()));
        _writer.writeEndElement();
        _writer.writeStartElement(OvfProperties.VMD_IS_READONLY);
        _writer.writeRaw(String.valueOf(vmDevice.getIsReadOnly()));
        _writer.writeEndElement();
        _writer.writeStartElement(OvfProperties.VMD_ALIAS);
        _writer.writeRaw(String.valueOf(vmDevice.getAlias()));
        _writer.writeEndElement();
        if (vmDevice.getSpecParams() != null && vmDevice.getSpecParams().size() != 0
                && !VmPayload.isPayload(vmDevice.getSpecParams())) {
            _writer.writeStartElement(OvfProperties.VMD_SPEC_PARAMS);
            _writer.writeMap(vmDevice.getSpecParams());
            _writer.writeEndElement();
        }
        if (vmDevice.getCustomProperties() != null && !vmDevice.getCustomProperties().isEmpty()) {
            _writer.writeStartElement(OvfProperties.VMD_CUSTOM_PROP);
            _writer.writeRaw(DevicePropertiesUtils.getInstance().convertProperties(vmDevice.getCustomProperties()));
            _writer.writeEndElement();
        }

        if (vmDevice.getSnapshotId() != null) {
            _writer.writeStartElement(OvfProperties.VMD_SNAPSHOT_PROP);
            _writer.writeRaw(String.valueOf(vmDevice.getSnapshotId()));
            _writer.writeEndElement();
        }
    }

    @Override
    public String getStringRepresentation() {
        return _writer.getStringXML();
    }

    protected String getBackwardCompatibleUsbPolicy(UsbPolicy usbPolicy) {
        if (usbPolicy == null) {
            return version.compareTo(Version.v3_1) < 0 ? UsbPolicy.PRE_3_1_DISABLED : UsbPolicy.DISABLED.name();
        }

        if (version.compareTo(Version.v3_1) < 0) {
            switch (usbPolicy) {
            case ENABLED_LEGACY:
                return UsbPolicy.PRE_3_1_ENABLED;
            default:
                return UsbPolicy.PRE_3_1_DISABLED;
            }
        }
        else {
            return usbPolicy.toString();
        }
    }

    protected boolean vmInitEnabled() {
        return version.compareTo(Version.v3_4) < 0 ? false : true;
    }

    protected String getBackwardCompatibleDiskAlias(String diskAlias) {
        if (version.compareTo(Version.v3_1) >= 0) {
            return diskAlias;
        }

        String newDiskAlias = diskAliasesMap.get(diskAlias);
        if (newDiskAlias == null) {
            newDiskAlias = "Drive " + (++diskCounter);
            diskAliasesMap.put(diskAlias, newDiskAlias);
        }
        return newDiskAlias;
    }
}
