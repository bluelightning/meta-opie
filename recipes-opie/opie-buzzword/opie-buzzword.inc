DESCRIPTION = "BuzzWord Bingo"
SECTION = "opie/games"
LICENSE = "LGPLv2+"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/LGPL-2.0;md5=03f2b9deed35802bc1aae2ae3dc6d9ed"
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

