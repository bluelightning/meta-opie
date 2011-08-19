DESCRIPTION = "Enables apps on external media"
SECTION = "opie/base"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
APPNAME = "opie-update-symlinks"
APPTYPE = "binary"


S = "${WORKDIR}/symlinker"

inherit opie

do_install() {
	install -d ${D}${palmtopdir}/bin/
	install -m 0755 ${S}/opie-update-symlinks ${D}${palmtopdir}/bin/
}

