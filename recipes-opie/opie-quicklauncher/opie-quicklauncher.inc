DESCRIPTION = "The Opie Quick Launcher Loader"
SECTION = "opie/base"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

S = "${WORKDIR}/quicklauncher"

inherit opie

do_install() {
	install -d ${D}${bindir}
	install -m 755 quicklauncher ${D}${bindir}/
}
