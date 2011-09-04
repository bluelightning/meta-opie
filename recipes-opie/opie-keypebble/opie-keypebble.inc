DESCRIPTION = "A VNC Viewer"
SECTION = "opie/applications"
LICENSE = "GPLv2"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
APPNAME = "keypebble"

S = "${WORKDIR}/${APPNAME}"

inherit opie

do_install() {
	install -d ${D}${palmtopdir}/pics/vnc
	install -m 0644 ${WORKDIR}/pics/vnc/*.* ${D}${palmtopdir}/pics/vnc/
}

