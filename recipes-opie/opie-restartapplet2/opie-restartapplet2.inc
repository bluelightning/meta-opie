DESCRIPTION = "Restart Applet"
SECTION = "opie/applets"
LICENSE = "GPLv2"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
APPNAME = "restartapplet2"
I18N_FILES = "librestartapplet2.ts"


S = "${WORKDIR}/restartapplet2"

inherit opie

# FILES plugins/applets/librestartapplet.so*
do_install() {
}

