DESCRIPTION = "The next generation mediaplayer for Opie - based on libxine. \
It plays mp3, mpeg, wav, ogg, quicktime, divx, etc. and is capable of streaming."
SECTION = "opie/multimedia"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
DEPENDS = "libxine libqtaux2 opie-mediaplayer2-skin-default"
RDEPENDS_${PN} = "opie-mediaplayer2-skin-default"
RRECOMMENDS_${PN} = "libxine-plugin-ao-out-oss libxine-plugin-inp-file \
libxine-plugin-decode-ff libxine-plugin-decode-mad \
libxine-plugin-dmx-audio libxine-plugin-dmx-avi libxine-plugin-dmx-mpeg"
APPNAME = "opieplayer2"

S = "${WORKDIR}/${APPNAME}"

inherit opie

QMAKE_PROFILES = "opieplayer2.pro"

do_install() {
	install -d ${D}${palmtopdir}/pics/${APPNAME}/ ${S}${palmtopdir}/apps/Applications/
        install -m 0644 ${WORKDIR}/pics/${APPNAME}/*.png ${D}${palmtopdir}/pics/${APPNAME}/
}
