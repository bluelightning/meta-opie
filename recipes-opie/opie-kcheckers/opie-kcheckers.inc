DESCRIPTION = "The game of Checkers"
SECTION = "opie/games"
PRIORITY = "optional"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
APPNAME = "kcheckers"


S = "${WORKDIR}/${APPNAME}"

inherit opie

# FILES plugins/application/libkcheckers.so* bin/kcheckers apps/Games/kcheckers.desktop pics/kcheckers
do_install() {
        install -d ${D}${palmtopdir}/pics/${APPNAME}/
        install -m 0644 ${WORKDIR}/pics/${APPNAME}/*.xpm ${D}${palmtopdir}/pics/${APPNAME}/
}

