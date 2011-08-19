DESCRIPTION = "SFCave for the Zaurus. Fly the dot though the cave avoiding the walls."
SECTION = "opie/games"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
APPNAME = "sfcave"


S = "${WORKDIR}/${APPNAME}"

inherit opie

# FILES bin/sfcave apps/Games/sfcave.desktop pics/sfcave
do_install() {
        install -d ${D}${palmtopdir}/pics/${APPNAME}/
        install -m 0644 ${WORKDIR}/pics/${APPNAME}/*.png ${D}${palmtopdir}/pics/${APPNAME}/
}

