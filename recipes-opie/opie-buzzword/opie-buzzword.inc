DESCRIPTION = "BuzzWord Bingo"
SECTION = "opie/games"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
APPNAME = "buzzword"


S = "${WORKDIR}/${APPNAME}"

inherit opie

# FILES plugins/application/libbuzzword.so* bin/buzzword apps/Games/buzzword.desktop pics/buzzword/buzzword.png share/buzzword/buzzwords
do_install() {
        install -d ${D}${palmtopdir}/pics/${APPNAME}/
        install -m 0644 ${WORKDIR}/pics/${APPNAME}/*.png ${D}${palmtopdir}/pics/${APPNAME}/
        install -d ${D}${palmtopdir}/share/${APPNAME}/
        install -m 0644 ${WORKDIR}/share/${APPNAME}/buzzwords ${D}${palmtopdir}/share/${APPNAME}/
}

