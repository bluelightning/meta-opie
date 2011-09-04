DESCRIPTION = "Bluetooth manager for Opie"
SECTION = "opie/settings"
DEPENDS = "libopietooth1 obexftp"
RDEPENDS_${PN} = "opie-bluepin"
LICENSE = "GPLv2"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
APPNAME = "bluetooth-manager"

S = "${WORKDIR}/manager"

EXTRA_QMAKEVARS_POST += "INCLUDEPATH+=${STAGING_INCDIR}/opietooth"
EXTRA_QMAKEVARS_PRE += "LIBOBEXFTP_INC_DIR=${STAGING_INCDIR}/obexftp"

inherit opie

# Files: plugins/application/libbluetooth-manager.so* bin/bluetooth-manager apps/Settings/bluetooth-manager.desktop pics/opietooth/* pics/opietooth/icons/*
do_install() {
        install -d ${D}${palmtopdir}/pics/opietooth/
        install -d ${D}${palmtopdir}/pics/opietooth/icons/
        install -m 0644 ${WORKDIR}/pics/opietooth/*.png ${D}${palmtopdir}/pics/opietooth/
        install -m 0644 ${WORKDIR}/pics/opietooth/icons/*.png ${D}${palmtopdir}/pics/opietooth/icons/
}
