DESCRIPTION = "Game: solitaire card games"
SECTION = "opie/games"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
APPNAME = "patience"


S = "${WORKDIR}/solitaire"

inherit opie

# FILES plugins/application/libpatience.so* bin/patience apps/Games/patience.desktop pics/cards
do_install() {
        install -d ${D}${palmtopdir}/pics/cards/
        install -m 0644 ${WORKDIR}/pics/cards/*.png ${D}${palmtopdir}/pics/cards/
}


