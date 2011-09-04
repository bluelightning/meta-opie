DESCRIPTION = "Rotate Applet"
SECTION = "opie/applets"
LICENSE = "LGPLv2+"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/LGPL-2.0;md5=03f2b9deed35802bc1aae2ae3dc6d9ed"
APPNAME = "rotateapplet"


S = "${WORKDIR}/${APPNAME}"

inherit opie

# FILES
do_install() {
}
