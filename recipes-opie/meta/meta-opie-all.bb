DESCRIPTION = "Meta-package for QPE stuff"
SECTION = "opie/base"
LICENSE = "MIT"
PR = "r4"

RDEPENDS_${PN} = " \
    packagegroup-qpe-applets \
    packagegroup-qpe-games \
    packagegroup-qpe-inputmethods \
    packagegroup-qpe-multimedia \
    packagegroup-qpe-emulators \
    packagegroup-qpe-applications \
    packagegroup-qpe-fonts \
    packagegroup-qpe-settings"

inherit meta
