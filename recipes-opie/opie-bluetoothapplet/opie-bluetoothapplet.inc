DESCRIPTION = "Opie Bluetooth Applet"
SECTION = "opie/applets"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
DEPENDS = "libopietooth1"
APPNAME = "bluetoothapplet"

S = "${WORKDIR}/applet"

EXTRA_QMAKEVARS_POST += " INCLUDEPATH+=${STAGING_INCDIR}/opietooth "

inherit opie

do_install() {
	install -d ${D}${palmtopdir}/pics/bluetoothapplet
	install -m 0644 ${WORKDIR}/pics/bluetoothapplet/*.png ${D}${palmtopdir}/pics/bluetoothapplet
}

