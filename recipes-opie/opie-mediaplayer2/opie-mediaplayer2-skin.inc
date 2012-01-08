DESCRIPTION = "${SKINNAME} skin for opie-mediaplayer2"
SECTION = "opie/multimedia"
LICENSE = "GPLv2"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
RPROVIDES_${PN} = "opie-mediaplayer2-skin"

do_install() {
	install -d ${D}${palmtopdir}/pics/opieplayer2/skins/${SKINNAME}/
	install -m 0644 ${WORKDIR}/pics/opieplayer2/skins/${SKINNAME}/*.png ${D}${palmtopdir}/pics/opieplayer2/skins/${SKINNAME}/
}

FILES_${PN} = "${palmtopdir}/pics/opieplayer2/skins/${SKINNAME}/*.png"
