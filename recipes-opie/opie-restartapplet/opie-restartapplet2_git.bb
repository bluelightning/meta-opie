DESCRIPTION = "Restart Applet"
SECTION = "opie/applets"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
PV = "${OPIE_GIT_PV}"
APPNAME = "restartapplet"

SRC_URI = "${OPIE_GIT};protocol=git;subpath=core/applets/restartapplet2 \
           ${OPIE_GIT};protocol=git;subpath=apps"

S = "${WORKDIR}/restartapplet2"

inherit opie

# FILES plugins/applets/librestartapplet.so*
do_install() {
}

