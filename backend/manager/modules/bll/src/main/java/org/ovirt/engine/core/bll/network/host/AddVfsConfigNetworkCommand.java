package org.ovirt.engine.core.bll.network.host;

import org.ovirt.engine.core.bll.context.CommandContext;
import org.ovirt.engine.core.common.AuditLogType;
import org.ovirt.engine.core.common.action.VfsConfigNetworkParameters;
import org.ovirt.engine.core.common.errors.EngineMessage;

public class AddVfsConfigNetworkCommand extends NetworkVfsConfigCommandBase {

    public AddVfsConfigNetworkCommand(VfsConfigNetworkParameters parameters, CommandContext commandContext) {
        super(parameters, commandContext);
    }

    @Override
    protected void executeCommand() {
        super.executeCommand();

        getVfsConfigDao().addNetwork(getVfsConfig().getId(), getNetworkId());
        setSucceeded(true);
    }

    @Override
    protected boolean validate() {
        return super.validate() && validate(getVfsConfigValidator().networkNotInVfsConfig(getNetworkId()));
    }

    @Override
    public AuditLogType getAuditLogTypeValue() {
        return getSucceeded() ? AuditLogType.ADD_VFS_CONFIG_NETWORK
                : AuditLogType.ADD_VFS_CONFIG_NETWORK_FAILED;
    }

    @Override
    protected void setActionMessageParameters() {
        super.setActionMessageParameters();
        addValidationMessage(EngineMessage.VAR__ACTION__ADD);
    }
}
