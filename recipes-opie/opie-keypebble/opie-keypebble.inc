DESCRIPTION = "A VNC Viewer"
SECTION = "opie/applications"
LICENSE = "GPLv2"
APPNAME = "keypebble"

S = "${WORKDIR}/${APPNAME}"

LIC_FILES_CHKSUM = "file://LICENSE.GPL;md5=0a4544069a165e9b1b323f671e5b3b96"

inherit opie

do_install() {
	install -d ${D}${palmtopdir}/pics/vnc
	install -m 0644 ${WORKDIR}/pics/vnc/*.* ${D}${palmtopdir}/pics/vnc/
}

