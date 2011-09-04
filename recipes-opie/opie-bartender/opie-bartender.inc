DESCRIPTION = "Bartender drink recipe database"
SECTION = "opie/applications"
LICENSE = "GPLv2+"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
APPNAME = "bartender"


S = "${WORKDIR}/opie-bartender"

inherit opie

do_install() {
        install -d ${D}${palmtopdir}/pics/${APPNAME}/
        install -d ${D}${palmtopdir}/etc/${APPNAME}/
	install -m 0644 ${WORKDIR}/pics/${APPNAME}/*.png ${D}${palmtopdir}/pics/${APPNAME}/
	install -m 0644 db/drinkdb.txt  ${D}${palmtopdir}/etc/${APPNAME}/
}
