DESCRIPTION = "Target packages for Opie SDK"
PR = "r7"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS_${PN} = "\
    packagegroup-core-standalone-sdk-target \
    libopie2-dev \
    libqpe-opie-dev \
    ${@base_conditional("PALMTOP_USE_MULTITHREADED_QT", "yes", "qte-mt", "qte", d)}-dev \
    libqtaux2-dev \
    libmailwrapper-dev"
