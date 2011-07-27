DESCRIPTION = "Guitar Chord generator application"
SECTION = "opie/multimedia"
PRIORITY = "optional"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
APPNAME = "powerchord"


S = "${WORKDIR}/${APPNAME}"

inherit opie

# FILES bin/powerchord apps/Applications/powerchord.desktop pics/powerchord share/powerchord
do_install() {
        install -d ${D}${palmtopdir}/pics/${APPNAME}/
        install -m 0644 ${WORKDIR}/pics/${APPNAME}/*.png ${D}${palmtopdir}/pics/${APPNAME}/
        install -d ${D}${palmtopdir}/share/${APPNAME}/
        install -m 0644 ${WORKDIR}/share/${APPNAME}/*.raw ${D}${palmtopdir}/share/${APPNAME}/
}

