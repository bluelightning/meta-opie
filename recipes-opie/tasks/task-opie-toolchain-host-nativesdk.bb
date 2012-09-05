require recipes-core/packagegroups/nativesdk-packagegroup-sdk-host.bb

DESCRIPTION = "Host packages for Opie SDK"
PR = "r3"
LICENSE = "MIT"
ALLOW_EMPTY = "1"

RDEPENDS_${PN} += "nativesdk-qmake nativesdk-uicmoc"
