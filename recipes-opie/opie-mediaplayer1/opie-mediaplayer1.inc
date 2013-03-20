DESCRIPTION = "The classic Opie media player (core+plugins)."
LICENSE = "GPLv2"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
ALLOW_EMPTY_${PN} = "1"
PACKAGE_ARCH = "all"
RDEPENDS_${PN} = "opie-mediaplayer1-core"
RRECOMMENDS_${PN} = "opie-mediaplayer1-libmadplugin opie-mediaplayer1-libwavplugin \
opie-mediaplayer1-libmodplugin opie-mediaplayer1-libtremorplugin"

