DESCRIPTION = "The classic Opie media player (core)"
SECTION = "opie/multimedia"
PRIORITY = "optional"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
DEPENDS = "libqtaux2"
RDEPENDS_${PN} = "opie-mediaplayer2-skin-default"
APPNAME = "opieplayer"
APPTYPE = "binary"


S = "${WORKDIR}/${APPNAME}"

inherit opie

# FILES bin/opieplayer pics/opieplayer apps/Applications/opieplayer.desktop
do_install() {
        install -d ${D}${palmtopdir}/pics/${APPNAME}/skins/default/
        install -m 0644 ${WORKDIR}/pics/${APPNAME}/*.png ${D}${palmtopdir}/pics/${APPNAME}/
}

