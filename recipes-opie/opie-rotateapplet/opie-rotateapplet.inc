DESCRIPTION = "Rotate Applet"
SECTION = "opie/applets"
LICENSE = "LGPLv2+"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/LGPL-2.0;md5=9427b8ccf5cf3df47c29110424c9641a"
APPNAME = "rotateapplet"


S = "${WORKDIR}/${APPNAME}"

inherit opie

# FILES
do_install() {
}
