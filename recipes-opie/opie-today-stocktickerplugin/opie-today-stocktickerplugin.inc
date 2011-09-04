DESCRIPTION = "Stock ticker plugin for Today"
SECTION = "opie/today"
LICENSE = "GPLv2"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
DEPENDS = "opie-today libqtaux2"
APPNAME = "todaystocktickerplugin"


S = "${WORKDIR}/stockticker"

inherit opie

# FILES plugins/today/libtodaystocktickerplugin.so* bin/stockticker pics/stockticker/stockticker.png
do_install() {
        install -d ${D}${palmtopdir}/pics/stockticker/
        install -m 0644 ${WORKDIR}/pics/stockticker/*.png ${D}${palmtopdir}/pics/stockticker/
}

