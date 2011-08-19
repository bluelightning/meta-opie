DESCRIPTION = "Remote Desktop Protocol (RDP) Client"
SECTION = "opie/applications"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
DEPENDS = "openssl"
I18N_FILES = "ordesktop.ts"
APPNAME = "ordesktop"
APPTYPE = "binary"


S = "${WORKDIR}/opierdesktop"

inherit opie

# FILES bin/ordesktop pics/opierdesktop apps/Applications/opierdesktop.desktop
do_install() {
        install -d ${D}${palmtopdir}/pics/opierdesktop/
        install -m 0644 ${WORKDIR}/pics/opierdesktop/*.png ${D}${palmtopdir}/pics/opierdesktop/ 
}
