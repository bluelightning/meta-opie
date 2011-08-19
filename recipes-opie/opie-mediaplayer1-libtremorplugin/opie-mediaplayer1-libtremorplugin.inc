DESCRIPTION = "Ogg file plugin using tremor"
SECTION = "opie/codecs"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
DEPENDS = "opie-mediaplayer1-core tremor"
RDEPENDS_${PN} = "opie-mediaplayer1-core"
APPNAME = "tremorplugin"


S = "${WORKDIR}/opieplayer/vorbis"

QMAKE_PROFILES = "vorbis.pro"

inherit opie

do_configure_prepend() {
	install -m 0644 ${WORKDIR}/vorbis.pro ${S}/
}

# FILES plugins/codecs/libtremorplugin.so
