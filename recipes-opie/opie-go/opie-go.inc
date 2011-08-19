DESCRIPTION = "The game of Go"
SECTION = "opie/games"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
APPNAME = "go"


S = "${WORKDIR}/${APPNAME}"

inherit opie

# FILES plugins/application/libgo.so* bin/go apps/Games/go.desktop pics/go
do_install() {
        install -d ${D}${palmtopdir}/pics/${APPNAME}/
        install -m 0644 ${WORKDIR}/pics/${APPNAME}/*.png ${D}${palmtopdir}/pics/${APPNAME}/
}

