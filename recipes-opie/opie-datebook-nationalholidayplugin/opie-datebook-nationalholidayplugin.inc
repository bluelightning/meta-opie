DESCRIPTION = "Opie datebook national holidays plugin"
SECTION = "opie/datebook"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
RDEPENDS_${PN} = "opie-datebook"
APPNAME = "nationaldayplugin"

S = "${WORKDIR}/national"

inherit opie

do_install() {
	install -d ${D}${palmtopdir}/etc/nationaldays
	install -m 0644 ${WORKDIR}/nationaldays/*.xml ${D}${palmtopdir}/etc/nationaldays
}
