DESCRIPTION = "Etext reader for the Project Gutenberg."
SECTION = "opie/applications"
LICENSE = "GPLv2"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
DEPENDS = "opie-ftplib"
APPNAME = "gutenbrowser"


S = "${WORKDIR}/opie-gutenbrowser"

inherit opie

do_install() {
        install -d ${D}${palmtopdir}/pics/${APPNAME}/
        install -m 0644 ${WORKDIR}/pics/${APPNAME}/*.png ${D}${palmtopdir}/pics/${APPNAME}/
	install -d ${D}${palmtopdir}/etc/gutenbrowser/
	install -m 0644 ${WORKDIR}/etc/gutenbrowser/ftpList ${WORKDIR}/etc/gutenbrowser/GUTINDEX.ALL ${D}${palmtopdir}/etc/gutenbrowser/
}
