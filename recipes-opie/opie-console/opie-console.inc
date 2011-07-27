DESCRIPTION = "Console Application"
SECTION = "opie/applications"
PRIORITY = "optional"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
DEPENDS = "opie-keytabs"
RDEPENDS_${PN} = "opie-keytabs"
APPNAME = "opie-console"
APPTYPE = "binary"

S = "${WORKDIR}/${APPNAME}"

inherit opie

do_install() {
	install -d ${D}${palmtopdir}/pics/console/keys/
	install -m 0644 ${WORKDIR}/pics/inline/pass.* ${D}${palmtopdir}/pics/
	install -m 0644 ${WORKDIR}/pics/console/*.png ${D}${palmtopdir}/pics/console/
	install -m 0644 ${WORKDIR}/pics/console/keys/*.png ${D}${palmtopdir}/pics/console/keys/
}
