DESCRIPTION = "Skin for opie-mediaplayer2"
SECTION = "opie/multimedia"
LICENSE = "GPLv2"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
APPNAME = "opieplayer2"
RPROVIDES_${PN} = "opie-mediaplayer2-skin"
PR = "r0"

SRC_URI = "http://sources.openembedded.org/opie-1.2.5-split_pics.tar.bz2;name=split_pics"
SRC_URI[split_pics.md5sum] = "e9b68749d67295f7080a23e39b17335e"
SRC_URI[split_pics.sha256sum] = "0a7aab6d0bce04d6a9c257d768d8a1a481d38ba527d6e6e50723973789954b4a"

do_install() {
	install -d ${D}${palmtopdir}/pics/${APPNAME}/skins/techno/
        install -m 0644 ${WORKDIR}/pics/${APPNAME}/skins/techno/*.png ${D}${palmtopdir}/pics/${APPNAME}/skins/techno/
}

FILES_${PN} = "${palmtopdir}/pics/${APPNAME}/skins/techno/*.png"
