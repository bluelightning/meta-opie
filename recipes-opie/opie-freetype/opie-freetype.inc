DESCRIPTION = "Freetype fontfactory plugin"
SECTION = "opie/fontfactories"
LICENSE = "GPLv2"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
DEPENDS = "freetype opie-ttf-support"
RDEPENDS_${PN} = "opie-ttf-support"
APPNAME = "freetypefactory"
APPTYPE = "plugin"

S = "${WORKDIR}/freetype"

inherit opie

EXTRA_QMAKEVARS_POST += "INCLUDEPATH+=${STAGING_INCDIR}/freetype2"

DEBIAN_NOAUTONAME_opie-freetype = "1"
