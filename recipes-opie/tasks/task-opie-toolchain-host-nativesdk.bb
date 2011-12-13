require recipes-core/tasks/task-sdk-host-nativesdk.bb

DESCRIPTION = "Host packages for Opie SDK"
PR = "r2"
LICENSE = "MIT"
ALLOW_EMPTY = "1"

RDEPENDS_${PN} += "qmake-nativesdk uicmoc-nativesdk"
