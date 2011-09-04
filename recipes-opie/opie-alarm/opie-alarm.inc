DESCRIPTION = "Opie Alarm"
SECTION = "opie/base"
LICENSE = "GPLv2"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
DEPENDS = "apmd"
RDEPENDS_${PN} = "apmd"

S = "${WORKDIR}/opiealarm"

inherit opie

do_install() {
	install -d ${D}${bindir} ${D}${sysconfdir}/apm/event.d/
	install -m 0755 ${S}/opiealarm ${D}${bindir}/
	install -m 0755 ${WORKDIR}/01opiealarm ${D}${sysconfdir}/apm/event.d/
}
