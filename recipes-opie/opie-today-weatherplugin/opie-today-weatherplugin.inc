DESCRIPTION = "Weather plugin for Today"
SECTION = "opie/today"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
DEPENDS = "libopiecore2 libopiepim2"
RDEPENDS_${PN} = "opie-today"
APPNAME = "todayweatherplugin"


S = "${WORKDIR}/weather"

inherit opie

# FILES plugins/today/libtodayweatherplugin.so* pics/todayweatherplugin
do_install() {
        install -d ${D}${palmtopdir}/pics/${APPNAME}/
        install -m 0644 ${WORKDIR}/pics/${APPNAME}/*.png ${D}${palmtopdir}/pics/${APPNAME}/
}

