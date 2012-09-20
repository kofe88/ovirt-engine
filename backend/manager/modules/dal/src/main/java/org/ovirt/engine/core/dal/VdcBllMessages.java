package org.ovirt.engine.core.dal;

// This enum was moved from VdcBLL
public enum VdcBllMessages {
    Unassigned,
    VAR__TYPE__HOST,
    VAR__TYPE__VM,
    VAR__TYPE__QUOTA,
    VAR__TYPE__VM__CLUSTER,
    VAR__TYPE__VM_TEMPLATE,
    VAR__TYPE__SNAPSHOT,
    VAR__TYPE__DESKTOP_POOL,
    VAR__TYPE__VM_FROM_VM_POOL,
    VAR__TYPE__COMPUTER_ACCOUNT,
    VAR__TYPE__CLUSTER,
    VAR__TYPE__ROLE,
    VAR__TYPE__INTERFACE,
    VAR__TYPE__NETWORK,
    VAR__TYPE__NETWORKS,
    VAR__TYPE__VM_DISK,
    VAR__TYPE__BOOKMARK,
    VAR__TYPE__VM_TICKET,

    // Gluster types
    VAR__TYPE__GLUSTER_VOLUME,
    VAR__TYPE__GLUSTER_VOLUME_OPTION,
    VAR__TYPE__GLUSTER_BRICK,

    VAR__ACTION__RUN,
    VAR__ACTION__REMOVE,
    VAR__ACTION__ADD,
    VAR__ACTION__UPDATE,
    VAR__ACTION__CREATE,
    VAR__ACTION__PAUSE,
    VAR__ACTION__HIBERNATE,
    VAR__ACTION__MIGRATE,
    VAR__ACTION__CANCEL_MIGRATE,
    VAR__ACTION__ATTACHE_DESKTOP_TO,
    VAR__ACTION__REVERT_TO,
    VAR__ACTION__PREVIEW,
    VAR__ACTION__STOP,
    VAR__ACTION__START,
    VAR__ACTION__RESTART,
    VAR__ACTION__SHUTDOWN,
    VAR__ACTION__EXPORT,
    VAR__ACTION__EXTEND,
    VAR__ACTION__IMPORT,
    VAR__ACTION__ATTACH_ACTION_TO,
    VAR__ACTION__DETACH_ACTION_TO,
    VAR__ACTION__MOVE,
    VAR__ACTION__COPY,
    VAR__ACTION__CHANGE_CD,
    VAR__ACTION__EJECT_CD,
    VAR__ACTION__ALLOCATE_AND_RUN,
    VAR__ACTION__SET,
    VAR__ACTION__SETUP,
    VAR__ACTION__RESET,
    VAR__ACTION__HOT_PLUG,
    VAR__ACTION__HOT_UNPLUG,
    VAR__ACTION__LOGON,
    VAR__ACTION__LOGOFF,
    VAR__ACTION__REBALANCE_START,
    VAR__ACTION__ASSIGN,

    // Host statuses replacements
    VAR__HOST_STATUS__UP,
    VAR__HOST_STATUS__UP_MAINTENANCE_OR_NON_OPERATIONAL,

    ACTION_LIST_CANNOT_BE_EMPTY,
    ACTION_TYPE_FAILED_VM_MAX_RESOURCE_EXEEDED,
    ACTION_TYPE_FAILED_VM_IN_PREVIEW,
    ACTION_TYPE_FAILED_DISKS_ARE_LOCKED,
    ACTION_TYPE_FAILED_DISK_IS_LOCKED,
    ACTION_TYPE_FAILED_VM_IS_LOCKED,
    ACTION_TYPE_FAILED_VM_DURING_EXPORT,
    ACTION_TYPE_FAILED_VM_IMAGE_IS_ILLEGAL,
    ACTION_TYPE_FAILED_VM_HAS_NO_DISKS,
    ACTION_TYPE_FAILED_VM_IMAGE_DOES_NOT_EXIST,
    ACTION_TYPE_FAILED_VM_SNAPSHOT_DOES_NOT_EXIST,
    ACTION_TYPE_FAILED_VM_SNAPSHOT_HAS_NO_CONFIGURATION,
    ACTION_TYPE_FAILED_VM_SNAPSHOT_IS_BROKEN,
    ACTION_TYPE_FAILED_IMAGE_REPOSITORY_NOT_FOUND,
    ACTION_TYPE_FAILED_VM_IS_RUNNING,
    ACTION_TYPE_FAILED_VM_IS_NOT_RUNNING,
    ACTION_TYPE_FAILED_VM_IS_NOT_UP,
    ACTION_TYPE_FAILED_VM_IS_NOT_DOWN,
    ACTION_TYPE_FAILED_VM_IS_SAVING_RESTORING,
    ACTION_TYPE_FAILED_VM_IS_DURING_SNAPSHOT,
    ACTION_TYPE_FAILED_VM_NOT_FOUND,
    ACTION_TYPE_FAILED_VM_NOT_EXIST,
    ACTION_TYPE_FAILED_VM_ALREADY_EXIST,
    ACTION_TYPE_FAILED_VM_GUID_ALREADY_EXIST,
    ACTION_TYPE_FAILED_VM_ATTACHED_TO_POOL,
    ACTION_TYPE_FAILED_VM_WITH_BLANK_TEMPLATE,
    ACTION_TYPE_FAILED_VM_STATUS_ILLEGAL,
    ACTION_TYPE_FAILED_VM_RUNNING_STATELESS,
    ACTION_TYPE_FAILED_VM_HAS_STATELESS_SNAPSHOT_LEFTOVER,
    ACTION_TYPE_FAILED_VM_IN_USE_BY_OTHER_USER,
    ACTION_TYPE_FAILED_EXCEEDED_MAX_PCI_SLOTS,
    ACTION_TYPE_FAILED_EXCEEDED_MAX_IDE_SLOTS,
    ACTION_TYPE_FAILED_DISK_BOOT_IN_USE,
    ACTION_TYPE_FAILED_DISK_ALREADY_ATTACHED,
    ACTION_TYPE_FAILED_NOT_SHAREABLE_DISK_ALREADY_ATTACHED,
    ACTION_TYPE_FAILED_DISK_ALREADY_DETACHED,
    ACTION_TYPE_FAILED_ILLEGAL_DISK_OPERATION,
    ACTION_TYPE_FAILED_DISK_SPACE_LOW,
    ACTION_TYPE_FAILED_DEDICATED_VDS_NOT_IN_SAME_CLUSTER,
    ACTION_TYPE_FAILED_DISK_MAX_SIZE_EXCEEDED,
    ACTION_TYPE_FAILED_DISK_CONFIGURATION_NOT_SUPPORTED,
    ACTION_TYPE_FAILED_DISK_LUN_IS_ALREADY_IN_USE,
    ACTION_TYPE_FAILED_DISK_LUN_HAS_NO_VALID_TYPE,
    ACTION_TYPE_FAILED_DISK_LUN_ISCSI_MISSING_CONNECTION_PARAMS,
    ACTION_TYPE_FAILED_MIGRATION_IN_PROGRESS,
    ACTION_TYPE_FAILED_MIGRATION_TO_SAME_HOST,
    ACTION_TYPE_FAILED_VDS_VM_CLUSTER,
    ACTION_TYPE_FAILED_VDS_VM_MEMORY,
    ACTION_TYPE_FAILED_VDS_VM_VERSION,
    ACTION_TYPE_FAILED_VDS_VM_SWAP,
    ACTION_TYPE_FAILED_VDS_VM_CPUS,
    ACTION_TYPE_FAILED_VDS_VM_NETWORKS,
    ACTION_TYPE_FAILED_NO_VDS_AVAILABLE_IN_CLUSTER,
    ACTION_TYPE_FAILED_CANNOT_REMOVE_IMAGE_TEMPLATE,
    ACTION_TYPE_FAILED_CANNOT_REMOVE_ACTIVE_IMAGE,
    ACTION_TYPE_FAILED_CPU_NOT_FOUND,
    ACTION_TYPE_FAILED_PROBLEM_WITH_CANDIDATE_INFO,
    ACTION_TYPE_FAILED_TEMPLATE_DOES_NOT_EXIST,
    ACTION_TYPE_FAILED_IMAGE_ALREADY_EXISTS,
    ACTION_TYPE_FAILED_TEMPLATE_NAME_ALREADY_EXISTS,
    ACTION_TYPE_FAILED_TEMPLATE_GUID_ALREADY_EXISTS,
    ACTION_TYPE_FAILED_CANDIDATE_ALREADY_EXISTS,
    ACTION_TYPE_FAILED_ROLE_IS_READ_ONLY,
    ACTION_TYPE_FAILED_STORAGE_POOL_NOT_MATCH,
    ACTION_TYPE_FAILED_STORAGE_POOL_OF_VM_NOT_MATCH,
    ACTION_TYPE_FAILED_MISSED_STORAGES_FOR_SOME_DISKS,
    ACTION_TYPE_FAILED_STOARGE_DOMAIN_IS_WRONG,
    ACTION_TYPE_FAILED_STORAGE_DOMAIN_ALREADY_CONTAINS_DISK,
    ACTION_TYPE_FAILED_STORAGE_DOMAIN_NAME_ALREADY_EXIST,
    ACTION_TYPE_FAILED_STORAGE_DOMAIN_ALREADY_EXIST,
    ACTION_TYPE_FAILED_CANNOT_CHANGE_STORAGE_DOMAIN_TYPE,
    ACTION_TYPE_FAILED_STORAGE_POOL_NAME_ALREADY_EXIST,
    ACTION_TYPE_FAILED_TEMPLATE_NOT_FOUND_ON_DESTINATION_DOMAIN,
    ACTION_TYPE_FAILED_TEMPLATE_NOT_FOUND_ON_EXPORT_DOMAIN,
    ACTION_TYPE_FAILED_VM_NOT_FOUND_ON_EXPORT_DOMAIN,
    ACTION_TYPE_FAILED_IMPORTED_TEMPLATE_IS_MISSING,
    ACTION_TYPE_FAILED_SPECIFY_DOMAIN_IS_NOT_EXPORT_DOMAIN,
    ACTION_TYPE_FAILED_DETECTED_ACTIVE_VMS,
    ACTION_TYPE_FAILED_VDS_WITH_SAME_HOST_EXIST,
    ACTION_TYPE_FAILED_ILLEGAL_MEMORY_SIZE,
    ACTION_TYPE_FAILED_ILLEGAL_NUM_OF_MONITORS,
    ACTION_TYPE_FAILED_ILLEGAL_DOMAIN_NAME,
    ACTION_TYPE_FAILED_MAX_NUM_CPU,
    ACTION_TYPE_FAILED_MAX_NUM_SOCKETS,
    ACTION_TYPE_FAILED_MIN_NUM_SOCKETS,
    ACTION_TYPE_FAILED_MAX_CPU_PER_SOCKET,
    ACTION_TYPE_FAILED_MIN_CPU_PER_SOCKET,
    ACTION_TYPE_FAILED_PRESTARTED_VMS_CANNOT_EXCEED_VMS_COUNT,
    STORAGE_DOMAIN_TYPE_ILLEGAL_FOR_ADDING_EXISTING,
    TEMPLATE_IMAGE_NOT_EXIST,
    ILLEAGAL_USER_PROVIDED,
    ACTION_TYPE_FAILED_CANNOT_DECREASE_COMPATIBILITY_VERSION,
    ACTION_TYPE_FAILED_GIVEN_VERSION_NOT_SUPPORTED,
    CANNOT_MAINTANANCE_VDS_RUN_VMS_NO_OTHER_RUNNING_VDS,
    ACTION_TYPE_FAILED_NAME_LENGTH_IS_TOO_LONG,
    ACTION_TYPE_FAILED_NAME_MAY_NOT_BE_EMPTY,
    ACTION_TYPE_FAILED_NAME_MAY_NOT_CONTAIN_SPECIAL_CHARS,
    ACTION_TYPE_FAILED_NAME_MAY_NOT_CONTAIN_SPECIAL_CHARS_OR_DASH,
    ACTION_TYPE_FAILED_INVALID_VDS_HOSTNAME,
    ACTION_TYPE_FAILED_HOSNAME_CANNOT_CHANGE,
    ACTION_TYPE_FAILED_HOST_NOT_EXIST,
    ACTION_TYPE_FAILED_VM_SNAPSHOT_NOT_IN_PREVIEW,
    ACTION_TYPE_FAILED_FLOATING_DISK_NOT_SUPPORTED,
    ACTION_TYPE_FAILED_SHARED_DISK_NOT_SUPPORTED,

    VDS_CANNOT_REMOVE_DEFAULT_VDS_GROUP,
    VDS_CANNOT_REMOVE_VDS_DETECTED_RUNNING_VM,
    ACTION_TYPE_FAILED_DETECTED_PINNED_VMS,
    VDS_CANNOT_REMOVE_VDS_STATUS_ILLEGAL,
    ACTION_TYPE_FAILED_VDS_STATUS_ILLEGAL,
    ACTION_TYPE_FAILED_MIGRATE_BETWEEN_TWO_CLUSTERS,
    ACTION_TYPE_FAILED_VDS_INTERMITENT_CONNECTIVITY,
    VDS_CANNOT_REMOVE_VDS_GROUP_VDS_DETECTED,
    VDS_CANNOT_MAINTENANCE_VDS_IS_NOT_OPERATIONAL,
    VDS_CANNOT_MAINTENANCE_VDS_IS_NOT_RESPONDING_WITH_VMS,
    VDS_CANNOT_MAINTENANCE_VDS_IS_NOT_RESPONDING_AND_SPM,
    VDS_CANNOT_MAINTENANCE_SPM_WITH_RUNNING_TASKS,
    VDS_CANNOT_MAINTENANCE_SPM_CONTENDING,
    VDS_CANNOT_MAINTENANCE_VDS_IS_IN_MAINTENANCE,
    VDS_CANNOT_ACTIVATE_VDS_ALREADY_UP,
    VDS_CANNOT_ACTIVATE_VDS_NOT_EXIST,
    VDS_STATUS_NOT_VALID_FOR_STOP,
    VDS_STATUS_NOT_VALID_FOR_START,
    VDS_NO_VDS_PROXY_FOUND,
    VDS_FAILED_FENCE_VIA_PROXY_CONNECTION,
    VDS_FENCE_DISABLED_AT_SYSTEM_STARTUP_INTERVAL,
    VDS_FENCE_DISABLED_AT_QUIET_TIME,
    VDS_STATUS_NOT_VALID_FOR_UPDATE,
    VDS_TRY_CREATE_WITH_EXISTING_PARAMS,
    VDS_EMPTY_NAME,
    VDS_TRY_CREATE_SECURE_CERTIFICATE_NOT_FOUND,
    VDS_CANNOT_INSTALL_EMPTY_PASSWORD,
    VDS_PORT_CHANGE_REQUIRE_INSTALL,
    VDS_PORT_IS_NOT_LEGAL,
    VDS_INVALID_SERVER_ID,
    VDS_ADD_STORAGE_SERVER_STATUS_MUST_BE_UP,
    VDS_CANNOT_CLEAR_VMS_WRONG_STATUS,
    VDS_NEW_CLUSTER_ILLEGAL,
    VDS_CLUSTER_IS_NOT_VALID,
    VDS_FENCING_DISABLED,
    VDS_CANNOT_INSTALL_STATUS_ILLEGAL,
    VDS_CANNOT_UPGRADE_BETWEEN_MAJOR_VERSION,
    VDS_CANNOT_INSTALL_MISSING_IMAGE_FILE,
    VDS_CANNOT_CONNECT_TO_SERVER,
    VAR__ACTION__MANUAL_FENCE,
    VAR__ACTION__MAINTENANCE,
    ACTION_TYPE_FAILED_PM_ENABLED_WITHOUT_AGENT,
    ACTION_TYPE_FAILED_PM_ENABLED_WITHOUT_AGENT_CREDENTIALS,
    ACTION_TYPE_FAILED_AGENT_NOT_SUPPORTED,
    VDS_CANNOT_CHECK_VERSION_HOST_NON_RESPONSIVE,
    // VDS_CANNOT_RUN_VM_FAILED_TO_RUN, // EINAV: not in use
    // internal const string VDS_CANNOT_REMOVE_VDS_DETECTED_RUNNING_VM =
    /**
     * "Cannot delete the server, there are desktop(s) running on the server.";
     */
    VM_CANNOT_CANCEL_MIGRATION_WHEN_VM_IS_NOT_MIGRATING,
    VM_CANNOT_REMOVE_VDS_GROUP_VMS_DETECTED,
    VM_TEMPLATE_IMAGE_IS_LOCKED,
    VM_TEMPLATE_IMAGE_IS_ILLEGAL,
    VM_TEMPLATE_IMAGE_LAST_DOMAIN,
    VM_NAME_CANNOT_BE_EMPTY,
    VM_CANNOT_UPDATE_ILLEGAL_FIELD,
    IMAGE_REPOSITORY_NOT_FOUND,
    MAC_POOL_NOT_ENOUGH_MAC_ADDRESSES,
    VM_CANNOT_MOVE_TO_CLUSTER_IN_OTHER_STORAGE_POOL,
    VM_CLUSTER_IS_NOT_VALID,
    VM_CANNOT_REMOVE_VM_WHEN_STATUS_IS_NOT_DOWN,
    VM_CANNOT_EXPORT_RAW_FORMAT,
    VM_PINNING_FORMAT_INVALID,
    CANNOT_PREIEW_CURRENT_IMAGE,
    ACTION_TYPE_FAILED_XP_MEMORY_ERROR,
    USER_CANNOT_BE_ADDED_TO_VM,
    VM_CANNOT_SUSPENDE_HAS_RUNNING_TASKS,
    VM_CANNOT_REMOVE_HAS_RUNNING_TASKS,
    VM_CANNOT_RUN_FROM_NETWORK_WITHOUT_NETWORK,
    VM_CANNOT_RUN_FROM_CD_WITHOUT_ACTIVE_STORAGE_DOMAIN_ISO,
    VM_CANNOT_WITHOUT_ACTIVE_STORAGE_DOMAIN_ISO,
    VM_CANNOT_RUN_FROM_DISK_WITHOUT_DISK,
    VM_CANNOT_RUN_STATELESS_WHILE_IN_PREVIEW,
    VM_CANNOT_RUN_STATELESS_HA,
    VM_CANNOT_IMPORT_VM_EXISTS,
    VM_CANNOT_IMPORT_VM_NAME_EXISTS,
    VM_CANNOT_SUSPEND_STATELESS_VM,
    VM_CANNOT_SUSPEND_VM_FROM_POOL,
    VM_CANNOT_SUSPEND_VM_WITHOUT_IMAGE_DISKS,
    // internal const string VMT_CANNOT_REMOVE_DETECTED_DERIVED_VM =
    // "Cannot delete the template, there are desktop(s) created from template";
    VMT_CANNOT_REMOVE_DETECTED_DERIVED_VM,
    VMT_CANNOT_CREATE_TEMPLATE_FROM_DOWN_VM,
    VMT_CANNOT_REMOVE_BLANK_TEMPLATE,
    VMT_CANNOT_EDIT_BLANK_TEMPLATE,
    VMT_CANNOT_EXPORT_BLANK_TEMPLATE,
    VMT_CANNOT_UPDATE_ILLEGAL_FIELD,
    VMT_CANNOT_REMOVE_VDS_GROUP_VMTS_DETECTED,
    VMT_CANNOT_CREATE_DUPLICATE_NAME,
    VMT_CLUSTER_IS_NOT_VALID,
    VMT_CANNOT_CHANGE_IMAGES_TEMPLATE,
    VMT_CANNOT_IMPORT_RAW_IMAGE_WITH_TEMPLATE,
    VMT_CANNOT_IMPORT_RAW_IMAGE_WITH_SNAPSHOTS,
    VMT_CANNOT_IMPORT_TEMPLATE_EXISTS,
    VMT_CANNOT_REMOVE_DOMAINS_LIST_MISMATCH,
    VM_CANNOT_IMPORT_TEMPLATE_NAME_EXISTS,
    ACTION_TYPE_FAILED_NETWORK_INTERFACE_MAC_INVALID,
    USER_CANNOT_REMOVE_USER_DETECTED_RUNNING_VM,
    USER_CANNOT_REMOVE_USER_ATTACHED_POOL,
    USER_CANNOT_REMOVE_USER_NOT_ATTACHED_POOL,
    USER_CANNOT_REMOVE_HIMSELF,
    USER_CANNOT_ATTACH_TO_VM_IN_POOL,
    USER_CANNOT_ATTACH_TO_VM_ALREADY_ATTACHED,
    USER_CANNOT_ATTACH_TO_VM_NOT_ATTACHED,
    USER_FAILED_TO_AUTHENTICATE,
    USER_FAILED_TO_AUTHENTICATE_KERBEROS_ERROR,
    USER_PASSWORD_EXPIRED,
    USER_ACCOUNT_DISABLED,
    USER_PERMISSION_DENIED,
    USER_MUST_EXIST_IN_DB,
    USER_MUST_EXIST_IN_DIRECTORY,
    USER_IS_ALREADY_LOGGED_IN,
    USER_IS_NOT_LOGGED_IN,
    USER_DOES_NOT_HAVE_A_VALID_EMAIL,
    USER_CANNOT_DETACH_FROM_VM_NOT_ATTACHED,
    USER_CANNOT_RUN_QUERY_NOT_PUBLIC,
    USER_CANNOT_LOGIN_DOMAIN_NOT_SUPPORTED,
    USER_CANNOT_LOGIN_SESSION_MISSING,
    USER_CANNOT_REMOVE_ADMIN_USER,
    USB_NATIVE_SUPPORT_ONLY_AVAILABLE_ON_CLUSTER_LEVEL,
    USB_LEGACY_NOT_SUPPORTED_ON_LINUX_VMS,
    VM_POOL_CANNOT_REMOVE_VM_POOL_WITH_ATTACHED_USERS,
    VM_POOL_CANNOT_REMOVE_VM_POOL_WITH_ATTACHED_DIRECTORY_GROUPS,
    VM_POOL_CANNOT_REMOVE_VM_POOL_WITH_VMS,
    VM_POOL_CANNOT_REMOVE_RUNNING_VM_FROM_POOL,
    VM_POOL_CANNOT_ADD_RUNNING_VM_TO_POOL,
    ACTION_TYPE_FAILED_USER_ATTACHED_TO_POOL,
    VM_POOL_CANNOT_ADD_VM_WITH_USERS_ATTACHED_TO_POOL,
    VM_POOL_CANNOT_ADD_VM_ATTACHED_TO_POOL,
    VM_POOL_CANNOT_DETACH_VM_NOT_ATTACHED_TO_POOL,
    VM_POOL_CANNOT_ADD_VM_DIFFERENT_CLUSTER,
    VM_POOL_CANNOT_CREATE_DUPLICATE_NAME,
    VM_POOL_CANNOT_CREATE_WITH_NO_VMS,
    ACTION_TYPE_FAILED_NO_AVAILABLE_POOL_VMS,
    VM_POOL_CANNOT_CREATE_FROM_BLANK_TEMPLATE,
    VM_POOL_CANNOT_UPDATE_POOL_NOT_FOUND,
    VM_POOL_CANNOT_DECREASE_VMS_FROM_POOL,
    USER_CANNOT_BE_ADDED_TO_VM_POOL,
    ACTION_TYPE_FAILED_VM_FROM_POOL_CANNOT_BE_STATELESS,
    DIRECTORY_GROUP_CANNOT_REMOVE_DIRECTORY_GROUP_ATTACHED_TO_VM,
    DIRECTORY_GROUP_CANNOT_REMOVE_DIRECTORY_GROUP_ATTACHED_TO_VM_POOL,
    DIRECTORY_GROUP_CANNOT_ATTACH_TO_VM_ALREADY_ATTACHED,
    DIRECTORY_GROUP_NOT_ATTACH_TO_VM,
    DIRECTORY_COMPUTER_WITH_THE_SAME_NAME_ALREADY_EXITS,
    ERROR_LICENSE_NO_LICENSE,
    ERROR_LICENSE_SYSTEM_CLOCK_MODIFIED,
    ERROR_LICENSE_EXPIRED,
    MESSAGE_LICENSE_EVALUATION__PARAM_DAYS_LEFT,
    ERROR_LICENSE_ILLEGAL,
    USER_NOT_AUTHORIZED_TO_PERFORM_ACTION,
    ERROR_CANNOT_REMOVE_LAST_SUPER_USER_ROLE,
    ERROR_CANNOT_REMOVE_ROLE_ATTACHED_TO_PERMISSION,
    ERROR_CANNOT_REMOVE_ROLE_INVALID_ROLE_ID,
    ERROR_CANNOT_UPDATE_ROLE_NAME,
    ERROR_CANNOT_UPDATE_ROLE_ID,
    ERROR_CANNOT_UPDATE_ROLE_TYPE,
    ERROR_CANNOT_ATTACH_ACTION_GROUP_TO_ROLE_ATTACHED,
    ERROR_CANNOT_DETACH_ACTION_GROUP_TO_ROLE_NOT_ATTACHED,
    ERROR_CANNOT_ATTACH_ACTION_GROUP_TO_ROLE_INVALID_ACTION,
    ERROR_CANNOT_DEFAULT_DIRECTORY_ELEMENT_TAG,
    VDS_REGISTER_NO_HOSTNAME_INPUT,
    VDS_REGISTER_UNIQUE_ID_AMBIGUOUS,
    VDS_REGISTER_UNIQUE_ID_DIFFERENT_TYPE,
    AUTO_MIGRATE_DISABLED,
    AUTO_MIGRATE_VDS_NOT_FOUND,
    AUTO_MIGRATE_POWERCLIENT_NOT_FOUND,
    AUTO_MIGRATE_ALREADY_ON_POWERCLIENT,
    AUTO_MIGRATE_ALREADY_RUNNING_ON_VDS,
    AUTO_MIGRATE_UNSUCCESSFUL,
    VDS_APPROVE_VDS_NOT_FOUND,
    VDS_APPROVE_WRONG_VDS_TYPE,
    VDS_APPROVE_VDS_IN_WRONG_STATUS,
    VDS_SHUTDOWN_VDS_NOT_FOUND,
    VDS_SHUTDOWN_NO_RESPONSE,
    VDS_GROUP_CANNOT_UPDATE_CPU_ILLEGAL,
    VDS_GROUP_CANNOT_UPDATE_CPU_WHEN_RUNNING_VMS,
    VDS_GROUP_CANNOT_DO_ACTION_NAME_IN_USE,
    ERROR_CANNOT_CHANGE_STORAGE_POOL_VDSS_UP,
    VDS_GROUP_CANNOT_CHANGE_STORAGE_POOL,
    VDS_GROUP_CANNOT_UPDATE_CPU_WITH_LOWER_HOSTS,
    VDS_GROUP_CANNOT_UPDATE_COMPATIBILITY_VERSION_WITH_LOWER_HOSTS,
    VDS_GROUP_CANNOT_UPDATE_VDS_UP,
    VDS_GROUP_CANNOT_ADD_COMPATIBILITY_VERSION_WITH_LOWER_STORAGE_POOL,
    VDS_GROUP_CANNOT_REMOVE_HAS_VM_POOLS,
    VDS_GROUP_CPU_TYPE_CANNOT_BE_NULL,
    NETWORK_NAME_ALREADY_EXISTS,
    NETWORK_HOST_IS_BUSY,
    NETWORK_IN_USE,
    NETWORK_NOT_EXISTS,
    NETWORK_NOT_EXISTS_IN_CLUSTER,
    NETWORK_OLD_NETWORK_NOT_SPECIFIED,
    NETWORK_ALREADY_ATTACHED_TO_CLUSTER,
    NETWORK_CAN_NOT_REMOVE_DEFAULT_NETWORK,
    NETWORK_CAN_NOT_UPDATE_DEFAULT_NETWORK,
    NETWORK_STORAGE_POOL_MUST_BE_SPECIFY,
    NETWORK_VLAN_OUT_OF_RANGE,
    NETWORK_VLAN_IN_USE,
    NETWORK_ADDR_MANDATORY_IN_STATIC_IP,
    NETWORK_MAC_ADDRESS_IN_USE,
    NETWORK_INVALID_MAC_ADDRESS,
    NETWORK_INTERFACE_EXITED_MAX_INTERFACES,
    NETWORK_INTERFACE_NAME_ALREADY_IN_USE,
    NETWORK_INTERFACE_IN_USE_BY_VLAN,
    NETWORK_INTERFACE_CANNOT_UPDATE_INTERFACE_VLAN,
    NETWORK_ALREADY_ATTACHED_TO_INTERFACE,
    NETWORK_INTERFACE_ALREADY_HAVE_NETWORK,
    NETWORK_CLUSTER_NETWORK_IN_USE,
    NETWORK_INTERFACE_CONNECT_TO_VLAN,
    NETWORK_INTERFACE_TEMPLATE_CANNOT_BE_SET,
    NETWORK_INTERFACE_VM_CANNOT_BE_SET,
    NETWORK_INTERFACE_NOT_ATTACCH_TO_NETWORK,
    NETWORK_CANNOT_REMOVE_NETWORK_IN_USE_BY_VM,
    NETWORK_CANNOT_REMOVE_MANAGEMENT_NETWORK,
    NETWORK_CANNOT_REMOVE_NETWORK_IN_USE_BY_TEMPLATE,
    NETWORK_INVALID_BOND_NAME,
    NETWORK_BOND_NAME_EXISTS,
    NETWORK_BOND_PARAMETERS_INVALID,
    NETWORK_DEFAULT_UPDATE_NAME_INVALID,
    NETWORK_CHECK_CONNECTIVITY,
    NETWORK_INTERFACE_ALREADY_IN_BOND,
    NETWORK_BOND_NOT_EXISTS,
    NETWORK_BOND_NOT_ATTACCH_TO_NETWORK,
    NETWORK_BOND_HAVE_ATTACHED_VLANS,
    NETWORK_INTERFACE_NOT_EXISTS,
    NETWORK_INTERFACE_NOT_HAVE_DISPLAY_FLAG,
    NETWORK_INTERFACE_IN_USE_BY_VM,
    NETWORK_CANNOT_CHANGE_STATUS_WHEN_NOT_DOWN,
    NETWORK_CANNOT_ADD_INTERFACE_WHEN_VM_STATUS_NOT_UP_DOWN_LOCKED,
    NETWORK_CLUSTER_HAVE_NOT_EXISTING_DATA_CENTER_NETWORK,
    NETWORK_NOT_EXISTS_IN_CURRENT_CLUSTER,
    NETWORKS_NOT_IN_SYNC,
    NETWORK_INTERFACES_ALREADY_SPECIFIED,
    NETWORKS_ALREADY_ATTACHED_TO_IFACES,
    NETWORK_INTERFACES_DONT_EXIST,
    NETWORKS_DONT_EXIST_IN_CLUSTER,
    NETWORK_BONDS_INVALID_SLAVE_COUNT,
    NETWORK_INTERFACES_NOT_EXCLUSIVELY_USED_BY_NETWORK,
    NETWORK_CANNOT_DETACH_NETWORK_USED_BY_VMS,
    NON_VM_NETWORK_CANNOT_SUPPORT_STP,
    NETWORK_MTU_DIFFERENCES,
    NETWORK_MTU_OVERRIDE_NOT_SUPPORTED,
    ACTION_TYPE_FAILED_STORAGE_DOMAIN_NOT_IN_STORAGE_POOL,
    ACTION_TYPE_FAILED_STORAGE_POOL_NOT_EXIST,
    ACTION_TYPE_FAILED_STORAGE_DOMAIN_NOT_EXIST,
    ACTION_TYPE_FAILED_STORAGE_CONNECTION,
    ACTION_TYPE_FAILED_STORAGE_CONNECTION_NOT_EXIST,
    ACTION_TYPE_FAILED_STORAGE_CONNECTION_WRONG_PARAMETERS_FOR_STORAGE_TYPE,
    ACTION_TYPE_FAILED_STORAGE_DOMAIN_STATUS_ILLEGAL,
    ACTION_TYPE_FAILED_STORAGE_DOMAIN_STATUS_ILLEGAL2,
    STORAGE_POOL_REINITIALIZE_WITH_MORE_THAN_ONE_DATA_DOMAIN,
    ACTION_TYPE_FAILED_STORAGE_POOL_STATUS_ILLEGAL,
    ACTION_TYPE_FAILED_NO_VDS_IN_POOL,
    ACTION_TYPE_FAILED_NO_VDS_SUPPLIED,
    ACTION_TYPE_FAILED_STORAGE_DOMAIN_TYPE_ILLEGAL,
    ACTION_TYPE_FAILED_STORAGE_DOMAIN_FORMAT_ILLEGAL,
    ACTION_TYPE_FAILED_STORAGE_DOMAIN_FORMAT_ILLEGAL_HOST,
    ACTION_TYPE_FAILED_MASTER_STORAGE_DOMAIN_NOT_ACTIVE,
    STORAGE_DOMAIN_NOT_ATTACHED_TO_STORAGE_POOL,
    ERROR_CANNOT_DETACH_STORAGE_DOMAIN_WITH_IMAGES,
    ERROR_CANNOT_ATTACH_MORE_THAN_ONE_ISO_DOMAIN,
    ERROR_CANNOT_ATTACH_MORE_THAN_ONE_EXPORT_DOMAIN,
    ERROR_CANNOT_DETACH_LAST_STORAGE_DOMAIN,
    ERROR_CANNOT_DESTROY_LAST_STORAGE_DOMAIN,
    ERROR_CANNOT_DESTROY_LAST_STORAGE_DOMAIN_HOST_NOT_ACTIVE,
    ERROR_CANNOT_DEACTIVATE_MASTER_WITH_NON_DATA_DOMAINS,
    ERROR_CANNOT_DEACTIVATE_MASTER_WITH_LOCKED_DOMAINS,
    ERROR_CANNOT_DEACTIVATE_DOMAIN_WITH_TASKS,
    ERROR_CANNOT_DEACTIVATE_MASTER_DOMAIN_WITH_TASKS_ON_POOL,
    ERROR_CANNOT_ADD_STORAGE_POOL_WITHOUT_DATA_AND_ISO_DOMAINS,
    ERROR_CANNOT_ADD_STORAGE_POOL_WITHOUT_DATA_DOMAIN,
    ERROR_CANNOT_ADD_STORAGE_POOL_WITH_DIFFERENT_STORAGE_FORMAT,
    ERROR_CANNOT_CREATE_STORAGE_DOMAIN_WITHOUT_VG_LV,
    ERROR_CANNOT_REMOVE_POOL_WITH_NETWORKS,
    ERROR_CANNOT_REMOVE_POOL_WITH_ACTIVE_DOMAINS,
    ERROR_CANNOT_ATTACH_STORAGE_DOMAIN_STORAGE_TYPE_NOT_MATCH,
    ERROR_CANNOT_CHANGE_STORAGE_POOL_TYPE_WITH_DOMAINS,
    ERROR_CANNOT_ATTACH_STORAGE_DOMAIN_SHARED_NOT_SUPPORTED_IN_THIS_POOL,
    ERROR_CANNOT_ATTACH_STORAGE_DOMAIN_SHARED_NOT_SUPPORTED_IN_OTHER_POOL,
    ERROR_CANNOT_EXTEND_NON_DATA_DOMAIN,
    ERROR_CANNOT_EXTEND_CONNECTION_FAILED,
    ERROR_CANNOT_CHANGE_STORAGE_DOMAIN_FIELDS,
    ERROR_CANNOT_REMOVE_STORAGE_POOL_WITH_IMAGES,
    ERROR_CANNOT_REMOVE_STORAGE_POOL_WITH_VMS,
    ERROR_CANNOT_REMOVE_STORAGE_POOL_WITH_NONMASTER_DOMAINS,
    ERROR_CANNOT_UPDATE_STORAGE_POOL_COMPATIBILITY_VERSION_BIGGER_THAN_CLUSTERS,
    ERROR_CANNOT_ADD_EXISTING_STORAGE_DOMAIN_CONNECTION_DATA_ILLEGAL,
    ERROR_CANNOT_ADD_EXISTING_STORAGE_DOMAIN_LUNS_PROBLEM,
    ERROR_CANNOT_RECOVERY_STORAGE_POOL_THERE_IS_ACTIVE_DATA_DOMAINS,
    ERROR_CANNOT_RECOVERY_STORAGE_POOL_STORAGE_TYPE_MISSMATCH,
    ERROR_CANNOT_REMOVE_STORAGE_DOMAIN_DO_FORMAT,
    ERROR_CANNOT_FIND_ISO_IMAGE_PATH,
    ERROR_CANNOT_FIND_FLOPPY_IMAGE_PATH,
    ACTION_TYPE_FAILED_VMS_IN_STORAGE_POOL,
    ACTION_TYPE_FAILED_UP_VDSS_IN_CLUSTER,
    VAR__TYPE__STORAGE__POOL,
    VAR__TYPE__STORAGE__DOMAIN,
    VAR__ACTION__ATTACH,
    VAR__ACTION__DETACH,
    VAR__ACTION__ACTIVATE,
    VAR__ACTION__DEACTIVATE,
    VAR__ACTION__RECONSTRUCT_MASTER,
    VAR__ACTION__RECOVER_POOL,
    VAR__ACTION__DESTROY_DOMAIN,
    VAR__TYPE__USER_FROM_VM,
    VAR__TYPE__USER,
    EN_EVENT_UP_SUBJECT_TEXT,
    EN_EVENT_DOWN_SUBJECT_TEXT,
    EN_UNKNOWN_NOTIFICATION_METHOD,
    EN_UNSUPPORTED_NOTIFICATION_EVENT,
    EN_ALREADY_SUBSCRIBED,
    EN_NOT_SUBSCRIBED,
    EN_UNKNOWN_TAG_NAME,
    TAGS_CANNOT_EDIT_READONLY_TAG,
    TAGS_DIRECTORY_ELEMENT_TAG_IS_MISSING,
    TAGS_SPECIFY_TAG_IS_NOT_EXISTS,
    TAGS_SPECIFY_TAG_IS_IN_USE,
    TAGS_CANNOT_ASSING_TAG,
    TAGS_SPECIFIED_TAG_CANNOT_BE_THE_PARENT_OF_ITSELF,
    TAGS_CANNOT_REMOVE_TAG_NOT_EXIST,
    NETWORK_CANNOT_CONTAIN_BOND_NAME,
    VMPAYLOAD_INVALID_PAYLOAD_TYPE,
    VMPAYLOAD_SIZE_EXCEEDED,
    VMPAYLOAD_CDROM_EXCEEDED,
    VMPAYLOAD_FLOPPY_EXCEEDED,

    CONFIG_UNKNOWN_KEY,
    ACTION_TYPE_FAILED_BOOKMARK_NAME_ALREADY_EXISTS,
    ACTION_TYPE_FAILED_BOOKMARK_INVALID_ID,
    VDS_FENCING_OPERATION_FAILED,
    ACTION_NOT_SUPPORTED_FOR_CLUSTER_POOL_LEVEL,
    CAN_DO_ACTION_GENERAL_FAILURE,
    CAN_DO_ACTION_DATABASE_CONNECTION_FAILURE,
    ACTION_TYPE_FAILED_OBJECT_LOCKED,
    VM_OR_TEMPLATE_ILLEGAL_PRIORITY_VALUE,

    NETWORK_ADDR_IN_STATIC_IP_BAD_FORMAT,
    NETWORK_ADDR_IN_GATEWAY_BAD_FORMAT,
    NETWORK_ADDR_IN_SUBNET_BAD_FORMAT,
    USER_FAILED_TO_AUTHENTICATION_WRONG_AUTHENTICATION_METHOD,
    ACTION_TYPE_FAILED_VM_IS_PINNED_TO_HOST,
    ACTION_TYPE_FAILED_VM_IS_NON_MIGRTABLE_AND_IS_NOT_FORCED_BY_USER_TO_MIGRATE,
    VDS_CANNOT_MAINTENANCE_IT_INCLUDES_NON_MIGRATABLE_VM,
    ACTION_TYPE_FAILED_VM_CANNOT_BE_HIGHLY_AVAILABLE_AND_PINNED_TO_HOST,
    ACTION_TYPE_FAILED_VM_CANNOT_BE_PINNED_TO_CPU_AND_MIGRATABLE,
    VM_PINNED_TO_HOST_CANNOT_RUN_ON_THE_DEFAULT_VDS,

    ACTION_TYPE_FAILED_STORAGE_POOL_IS_NOT_LOCAL,
    ACTION_TYPE_FAILED_VDS_IS_NOT_IN_STORAGE_POOL,
    RHEVH_LOCALFS_WRONG_PATH_LOCATION,

    VDS_CANNOT_ADD_MORE_THEN_ONE_HOST_TO_LOCAL_STORAGE,
    VDS_CANNOT_REMOVE_HOST_WITH_LOCAL_STORAGE,
    VDS_CANNOT_ADD_LOCAL_STORAGE_TO_NON_LOCAL_HOST,
    VDS_CANNOT_REMOVE_LOCAL_STORAGE_ON_NON_LOCAL_HOST,

    VDS_GROUP_CANNOT_ADD_MORE_THEN_ONE_HOST_TO_LOCAL_STORAGE,
    VDS_GROUP_SELECTION_ALGORITHM_MUST_BE_SET_TO_NONE_ON_LOCAL_STORAGE,
    VDS_GROUP_CANNOT_DETACH_DATA_DOMAIN_FROM_LOCAL_STORAGE,
    DATA_CENTER_LOCAL_STORAGE_NOT_SUPPORTED_IN_CURRENT_VERSION,
    DATA_CENTER_POSIX_STORAGE_NOT_SUPPORTED_IN_CURRENT_VERSION,

    VDS_GROUP_CPU_UTILIZATION_MUST_BE_IN_VALID_RANGE,
    VDS_GROUP_CPU_LOW_UTILIZATION_PERCENTAGE_MUST_BE_LOWER_THAN_HIGH_PERCENTAGE,
    VDS_GROUP_CPU_HIGH_UTILIZATION_PERCENTAGE_MUST_BE_DEFINED_WHEN_USING_EVENLY_DISTRIBUTED,
    VDS_GROUP_BOTH_LOW_AND_HIGH_CPU_UTILIZATION_PERCENTAGE_MUST_BE_DEFINED_WHEN_USING_POWER_SAVING,
    VDS_GROUP_AT_LEAST_ONE_SERVICE_MUST_BE_ENABLED,
    VDS_GROUP_ENABLING_BOTH_VIRT_AND_GLUSTER_SERVICES_NOT_ALLOWED,
    VDS_GROUP_CANNOT_DISABLE_VIRT_WHEN_CLUSTER_CONTAINS_VMS,
    VDS_GROUP_CANNOT_DISABLE_GLUSTER_WHEN_CLUSTER_CONTAINS_VOLUMES,
    VDS_CANNOT_UPDATE_CLUSTER,
    VM_CANNOT_UPDATE_CLUSTER,
    VM_STATUS_NOT_VALID_FOR_UPDATE,
    PERMISSION_ADD_FAILED_PERMISSION_NOT_SENT,
    PERMISSION_ADD_FAILED_INVALID_ROLE_ID,
    PERMISSION_ADD_FAILED_INVALID_OBJECT_ID,
    PERMISSION_ADD_FAILED_USER_ID_MISMATCH,
    PERMISSION_ADD_FAILED_ONLY_SYSTEM_SUPER_USER_CAN_GIVE_ADMIN_ROLES,
    PERMISSION_ADD_FAILED_VM_IN_POOL,
    PERMISSION_REMOVE_FAILED_ONLY_SYSTEM_SUPER_USER_CAN_REMOVE_ADMIN_ROLES,
    CANNOT_ADD_ACTION_GROUPS_TO_ROLE_TYPE,
    ROLE_TYPE_CANNOT_BE_EMPTY,
    ROLE_WITH_ROLE_ID_DO_NOT_EXIST,
    ACTION_TYPE_FAILED_INVALID_CUSTOM_VM_PROPERTIES_INVALID_SYNTAX,
    ACTION_TYPE_FAILED_INVALID_CUSTOM_VM_PROPERTIES_INVALID_KEYS,
    ACTION_TYPE_FAILED_INVALID_CUSTOM_VM_PROPERTIES_INVALID_VALUES,
    CUSTOM_VM_PROPERTIES_INVALID_VALUES_NOT_ALLOWED_IN_CURRENT_CLUSTER,

    NETWORK_ILEGAL_NETWORK_NAME,
    NETWORK_ATTACH_ILLEGAL_GATEWAY,
    MISSING_DIRECTORY_ELEMENT_ID,
    ACTION_TYPE_FAILED_VDS_NOT_MATCH_VALID_STATUS,
    CANNOT_REMOVE_STORAGE_DOMAIN_INVALID_HOST_ID,
    STORAGE_OPERATION_FAILED_SPM_NETWORK_PROBLEMS,
    ERROR_CANNOT_REMOVE_ACTIVE_STORAGE_POOL,
    USER_FAILED_TO_AUTHENTICATE_WRONG_USERNAME_OR_PASSWORD,
    VDS_GROUP_CANNOT_UPDATE_CPU_WITH_SUSPENDED_VMS,
    VDS_GROUP_CANNOT_LOWER_CPU_LEVEL,
    USER_FAILED_TO_AUTHENTICATE_ACCOUNT_IS_LOCKED_OR_DISABLED,
    USER_FAILED_TO_AUTHENTICATE_DNS_ERROR,
    USER_FAILED_TO_AUTHENTICATE_NO_KDCS_FOUND,
    USER_FAILED_TO_AUTHENTICATE_CLOCK_SKEW_TOO_GREAT,
    USER_FAILED_TO_AUTHENTICATE_WRONG_REALM,
    USER_FAILED_TO_AUTHENTICATE_CONNECTION_TIMED_OUT,
    USER_FAILED_TO_AUTHENTICATE_CONNECTION_ERROR,
    ACTION_TYPE_FAILED_INVALID_CUSTOM_VM_PROPERTIES_DUPLICATE_KEYS,
    ACTION_TYPE_FAILED_CANNOT_REMOVE_BUILTIN_GROUP_EVERYONE,
    ACTION_TYPE_FAILED_IMPORT_DATA_DOMAIN_PROHIBITED,
    ACTION_TYPE_FAILED_VM_TASKS_ARE_ALREADY_RUNNING,
    NETWORK_NO_NETWORKS_OR_INTERFACES,
    NETWORK_BOND_EXISTS_IN_ADD_AND_REMOVE,
    NETWORK_NO_INTERFACE_FOR_BOND,
    NETWORK_EXISTS_IN_ADD_AND_REMOVE,
    NETWORK_HAVE_NO_INERFACES,
    VM_CANNOT_RUN_ONCE_WITH_ILLEGAL_SYSPREP_PARAM,
    MOVE_VM_CLUSTER_MISSING_NETWORK,
    ACTION_TYPE_FAILED_STORAGE_POOL_WITH_DEFAULT_VDS_GROUP_CANNOT_BE_LOCALFS,
    DEFAULT_CLUSTER_CANNOT_BE_ON_LOCALFS,
    HOT_PLUG_IS_NOT_SUPPORTED,
    ACTION_TYPE_FAILED_GUEST_OS_VERSION_IS_NOT_SUPPORTED,
    HOT_PLUG_DISK_IS_NOT_VIRTIO,
    HOT_PLUG_DISK_IS_NOT_UNPLUGGED,
    HOT_UNPLUG_DISK_IS_NOT_PLUGGED,
    ACTIVATE_DEACTIVATE_NIC_VM_STATUS_ILLEGAL,
    ACTIVATE_DEACTIVATE_NETWORK_NOT_IN_VDS,
    SHAREABLE_DISK_IS_NOT_SUPPORTED_FOR_DISK,
    SHAREABLE_DISK_IS_NOT_SUPPORTED_BY_VOLUME_FORMAT,
    ERROR_CANNOT_DETACH_DISK_WITH_SNAPSHOT,
    DISK_IS_ALREADY_SHARED_BETWEEN_VMS,
    VM_CANNOT_RUN_FROM_DISK_WITHOUT_PLUGGED_DISK,
    ACTION_TYPE_FAILED_QUOTA_NOT_EXIST,
    ACTION_TYPE_FAILED_QUOTA_IS_NOT_VALID,
    ACTION_TYPE_FAILED_NO_QUOTA_SET_FOR_DOMAIN,
    ACTION_TYPE_FAILED_QUOTA_IS_NO_LONGER_AVAILABLE_IN_SYSTEM,
    ACTION_TYPE_FAILED_QUOTA_LIMIT_IS_SPECIFIC_AND_GENERAL,
    ACTION_TYPE_FAILED_QUOTA_LIMIT_IS_NOT_SPECIFIC_OR_GENERAL,
    ACTION_TYPE_FAILED_QUOTA_NAME_ALREADY_EXISTS,
    ACTION_TYPE_FAILED_QUOTA_NAME_RESERVED_FOR_DEFAULT,
    ACTION_TYPE_FAILED_QUOTA_CAN_NOT_HAVE_DEFAULT_INDICATION,
    ACTION_TYPE_FAILED_QUOTA_WITH_DEFAULT_INDICATION_CAN_NOT_BE_REMOVED,
    ACTION_TYPE_FAILED_QUOTA_IN_USE_BY_VM_OR_DISK,
    ACTION_TYPE_FAILED_DATA_CENTER_MUST_HAVE_AT_LEAST_ONE_QUOTA,
    ACTION_TYPE_FAILED_QUOTA_STORAGE_LIMIT_EXCEEDED,
    ACTION_TYPE_FAILED_QUOTA_VDS_GROUP_LIMIT_EXCEEDED,
    ACTION_TYPE_FAILED_NOT_A_VM_NETWORK,
    ACTION_TYPE_FAILED_NETWORK_NOT_IN_CLUSTER,
    ACTION_TYPE_FAILED_INTERFACE_NETWORK_NOT_CONFIGURED,
    ACTION_TYPE_FAILED_DISK_IS_NOT_VM_DISK,
    ACTION_TYPE_FAILED_DISK_IS_NOT_TEMPLATE_DISK,
    ACTION_TYPE_FAILED_DISK_NOT_EXIST,
    ACTION_TYPE_FAILED_SOURCE_AND_TARGET_SAME,
    NON_VM_NETWORK_NOT_SUPPORTED_FOR_POOL_LEVEL,

    // Gluster Messages
    ACTION_TYPE_FAILED_CLUSTER_IS_NOT_VALID,
    ACTION_TYPE_FAILED_CLUSTER_DOES_NOT_SUPPORT_GLUSTER,
    ACTION_TYPE_FAILED_GLUSTER_VOLUME_NAME_ALREADY_EXISTS,
    ACTION_TYPE_FAILED_GLUSTER_VOLUME_INVALID,
    ACTION_TYPE_FAILED_BRICKS_REQUIRED,
    ACTION_TYPE_FAILED_BRICK_ID_REQUIRED,
    ACTION_TYPE_FAILED_GLUSTER_BRICK_INVALID,
    ACTION_TYPE_FAILED_REPLICA_COUNT_MIN_2,
    ACTION_TYPE_FAILED_REPLICA_COUNT_MIN_4,
    ACTION_TYPE_FAILED_INVALID_BRICK_COUNT_FOR_REPLICATE,
    ACTION_TYPE_FAILED_INVALID_BRICK_COUNT_FOR_DISTRIBUTED_REPLICATE,
    ACTION_TYPE_FAILED_STRIPE_COUNT_MIN_4,
    ACTION_TYPE_FAILED_STRIPE_COUNT_MIN_8,
    ACTION_TYPE_FAILED_INVALID_BRICK_COUNT_FOR_STRIPE,
    ACTION_TYPE_FAILED_INVALID_BRICK_COUNT_FOR_DISTRIBUTED_STRIPE,
    ACTION_TYPE_FAILED_INVALID_BRICK_SERVER_ID,
    ACTION_TYPE_FAILED_GLUSTER_VOLUME_ALREADY_STARTED,
    ACTION_TYPE_FAILED_GLUSTER_VOLUME_ALREADY_STOPPED,
    ACTION_TYPE_FAILED_GLUSTER_VOLUME_IS_UP,
    ACTION_TYPE_FAILED_GLUSTER_VOLUME_SHOULD_BE_STARTED,
    ACTION_TYPE_FAILED_GLUSTER_VOLUME_BRICKS_ARE_NOT_DISTRIBUTED,
    ACTION_TYPE_FAILED_GLUSTER_VOLUME_IS_DOWN,
    ACTION_TYPE_FAILED_NOT_A_GLUSTER_VOLUME_BRICK,
    ACTION_TYPE_FAILED_CAN_NOT_REMOVE_ALL_BRICKS_FROM_VOLUME,
    ACTION_TYPE_FAILED_CAN_NOT_REDUCE_REPLICA_COUNT_MORE_THAN_ONE,
    ACTION_TYPE_FAILED_CAN_NOT_INCREASE_REPLICA_COUNT_MORE_THAN_ONE,
    ACTION_TYPE_FAILED_CAN_NOT_INCREASE_STRIPE_COUNT_MORE_THAN_ONE,
    ACTION_TYPE_FAILED_CAN_NOT_REDUCE_REPLICA_COUNT,
    ACTION_TYPE_FAILED_CAN_NOT_INCREASE_REPLICA_COUNT,
    ACTION_TYPE_FAILED_CAN_NOT_REDUCE_STRIPE_COUNT,
    ACTION_TYPE_FAILED_BRICK_ALREADY_EXISTS_IN_VOLUME,
    ACTION_TYPE_FAILED_NO_UP_SERVER_FOUND,
    VDS_CANNOT_REMOVE_HOST_HAVING_GLUSTER_VOLUME,
    ACTION_TYPE_FAILED_NO_GLUSTER_HOST_TO_PEER_PROBE,
    MIGRATE_PAUSED_VM_IS_UNSUPPORTED,

    VM_INTERFACE_NOT_EXIST,
    ACTION_TYPE_FAILED_CANNOT_REMOVE_ACTIVE_DEVICE,
    ACTION_TYPE_FAILED_IMPORT_CLONE_NOT_COLLAPSED,

    /* VDSM Error that propagates up to the client. See VdcBLLErrors */
    ERROR_GET_STORAGE_DOMAIN_LIST, // VdcBllErrors.GetStorageDomainListError

    USER_CANNOT_FORCE_RECONNECT_TO_VM,
    // Engine maintenance mode
    ENGINE_IS_RUNNING_IN_MAINTENANCE_MODE,
    // Engine prepare mode
    ENGINE_IS_RUNNING_IN_PREPARE_MODE;

    public int getValue() {
        return this.ordinal();
    }

    public static VdcBllMessages forValue(int value) {
        return values()[value];
    }
}
