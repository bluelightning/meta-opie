DESCRIPTION = "Opie keytabs for terminal applications"
SECTION = "opie/base"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

do_install() {
        install -d ${D}${palmtopdir}/etc/keytabs/
        install -m 0644 ${WORKDIR}/etc/keytabs/*.* ${D}${palmtopdir}/etc/keytabs/
}

FILES_${PN} = "${palmtopdir}/etc/keytabs/*"
