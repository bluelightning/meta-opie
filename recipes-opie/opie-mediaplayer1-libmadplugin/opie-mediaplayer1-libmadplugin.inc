DESCRIPTION = "MP3 file plugin for opie-mediaplayer11 using libmad"
SECTION = "opie/codecs"
PRIORITY = "optional"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
DEPENDS = "opie-mediaplayer1-core libmad"
RDEPENDS_${PN} = "opie-mediaplayer1-core"
APPNAME = "madplugin"


S = "${WORKDIR}/opieplayer/libmad"
QMAKE_PROFILES = "libmadplugin.pro"

inherit opie

do_configure_prepend() {
	install -m 0644 ${WORKDIR}/libmadplugin.pro ${S}/
}

# FILES plugins/codecs/libmadplugin.so
