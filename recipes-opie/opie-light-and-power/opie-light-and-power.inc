DESCRIPTION = "Light and Power settings dialog"
SECTION = "opie/settings"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
APPNAME = "light-and-power"


S = "${WORKDIR}/${APPNAME}"

inherit opie

# FILES plugins/application/liblight-and-power.so* bin/light-and-power apps/Settings/light.desktop pics/lightandpower
do_install() {
        install -d ${D}${palmtopdir}/pics/lightandpower/
        install -m 0644 ${WORKDIR}/pics/lightandpower/*.png ${D}${palmtopdir}/pics/lightandpower/
}

