DESCRIPTION = "Logout Applet"
SECTION = "opie/applets"
LICENSE = "GPLv2"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
APPNAME = "logoutapplet"


S = "${WORKDIR}/${APPNAME}"

inherit opie

# FILES
do_install() {
}

