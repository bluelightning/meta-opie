DESCRIPTION = "WAV file plugin"
SECTION = "opie/codecs"
LICENSE = "GPLv2"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
DEPENDS = "opie-mediaplayer1-core"
RDEPENDS_${PN} = "opie-mediaplayer1-core"
APPNAME = "wavplugin"


S = "${WORKDIR}/opieplayer/${APPNAME}"

inherit opie

# FILES plugins/codecs/libwavplugin*
