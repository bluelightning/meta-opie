DESCRIPTION = "Opie network connection applet"
SECTION = "opie/applets"
LICENSE = "GPLv2"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
RDEPENDS_${PN} += "connman opie-connmansettings"
APPNAME = "connmanapplet"

S = "${WORKDIR}/applet"

inherit opie

do_install() {
	install -d ${D}${palmtopdir}/pics/connmanapplet
	install -m 0644 ${WORKDIR}/pics/connmanapplet/*.png ${D}${palmtopdir}/pics/connmanapplet
}

