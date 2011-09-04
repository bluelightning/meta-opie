DESCRIPTION = "Opie QCOP IPC Client"
SECTION = "opie/base"
LICENSE = "GPLv2"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

S = "${WORKDIR}/qcop"

inherit opie

do_install() {
	install -d ${D}${bindir}
	install -m 0755 ${S}/qcop ${D}${bindir}/qcop
}
