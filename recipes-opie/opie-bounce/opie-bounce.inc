DESCRIPTION = "bounce"
SECTION = "opie/games"
LICENSE = "LGPLv2+"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/LGPL-2.0;md5=9427b8ccf5cf3df47c29110424c9641a"
APPNAME = "bounce"


S = "${WORKDIR}/${APPNAME}"

inherit opie

# FILES plugins/application/libbounce.so* bin/bounce apps/Games/bounce.desktop pics/bounce/*.png
do_install() {
        install -d ${D}${palmtopdir}/pics/${APPNAME}/
        install -m 0644 ${WORKDIR}/pics/${APPNAME}/*.png ${D}${palmtopdir}/pics/${APPNAME}/
}

