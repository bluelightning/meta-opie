DESCRIPTION = "Target packages for Opie SDK"
PR = "r7"
LICENSE = "MIT"
ALLOW_EMPTY_${PN} = "1"

LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"


RDEPENDS_${PN} = "\
    packagegroup-core-standalone-sdk-target \
    libopie2-dev \
    libqpe-opie-dev \
    ${@base_conditional("PALMTOP_USE_MULTITHREADED_QT", "yes", "qte-mt", "qte", d)}-dev \
    libqtaux2-dev \
    libmailwrapper-dev"
