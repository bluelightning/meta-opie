DESCRIPTION = "Opie-Ftp"
SECTION = "opie/applications"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
DEPENDS = "libopiecore2 opie-ftplib"
APPNAME = "opieftp"
I18N_FILES = "opieftp.ts"


S = "${WORKDIR}/${APPNAME}"

inherit opie

# FILES plugins/application/libopieftp.so* bin/opieftp pics/opieftp apps/Applications/opieftp.desktop
do_install() {
        install -d ${D}${palmtopdir}/pics/${APPNAME}/
        install -m 0644 ${WORKDIR}/pics/${APPNAME}/*.png ${D}${palmtopdir}/pics/${APPNAME}/
}

