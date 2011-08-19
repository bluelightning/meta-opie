DESCRIPTION = "Backgammon Game"
SECTION = "opie/games"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
APPNAME = "backgammon"


S = "${WORKDIR}/${APPNAME}"

inherit opie

do_install() {
        install -d ${D}${palmtopdir}/pics/${APPNAME}/
        install -m 0644 ${WORKDIR}/pics/${APPNAME}/*.png ${D}${palmtopdir}/pics/${APPNAME}/

	for dir in boards dice odds pieces table
	do
		install -d ${D}${palmtopdir}/pics/${APPNAME}/$dir
		install -m 644 ${WORKDIR}/pics/${APPNAME}/$dir/*.png ${D}${palmtopdir}/pics/${APPNAME}/$dir
	done	
}

