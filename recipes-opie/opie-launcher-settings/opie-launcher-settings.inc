DESCRIPTION = "Launcher settings dialog"
SECTION = "opie/settings"
PRIORITY = "optional"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
DEPENDS = "libqtaux2"
APPNAME = "launchersettings"


S = "${WORKDIR}/launcher"

inherit opie

# FILES plugins/application/liblaunchersettings.so* bin/launchersettings apps/Settings/launchersettings.desktop pics/launchersettings
do_install() {
        install -d ${D}${palmtopdir}/pics/${APPNAME}/
        install -m 0644 ${WORKDIR}/pics/${APPNAME}/*.png ${D}${palmtopdir}/pics/${APPNAME}/
} 
