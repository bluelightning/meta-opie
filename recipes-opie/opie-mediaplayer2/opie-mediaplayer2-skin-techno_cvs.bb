DESCRIPTION = "Skin for opie-mediaplayer2"
SECTION = "opie/multimedia"
PRIORITY = "optional"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
APPNAME = "opieplayer2"
RPROVIDES_${PN} = "opie-mediaplayer2-skin"
OPIE_GIT_PV ?= "1.2.2+cvs${SRCDATE}"
PV = "${OPIE_GIT_PV}"
PR = "r3"

SRC_URI = "${OPIE_GIT};protocol=git;subpath=pics"

do_install() {
	install -d ${D}${palmtopdir}/pics/${APPNAME}/skins/techno/
        install -m 0644 ${WORKDIR}/pics/${APPNAME}/skins/techno/*.png ${D}${palmtopdir}/pics/${APPNAME}/skins/techno/
}

FILES_${PN} = "${palmtopdir}/pics/${APPNAME}/skins/techno/*.png"
