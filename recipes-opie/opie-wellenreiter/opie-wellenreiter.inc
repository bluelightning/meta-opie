DESCRIPTION = "A Wireless Network Monitor"
SECTION = "opie/applications"
LICENSE = "GPLv2"
RRECOMMENDS_${PN} = "manufacturers"
APPNAME = "wellenreiter"
APPTYPE = "binary"

S = "${WORKDIR}/wellenreiter"

LIC_FILES_CHKSUM = "file://COPYING;md5=cbbd794e2a0a289b9dfcc9f513d1996e"

inherit opie

do_install() {
        install -d ${D}${palmtopdir}/pics/${APPNAME}/
	install -m 0644 ${WORKDIR}/pics/${APPNAME}/*.* ${D}${palmtopdir}/pics/${APPNAME}/
}
