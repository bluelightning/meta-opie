DESCRIPTION = "Opie embedded konsole"
SECTION = "opie/applications"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
DEPENDS = "libqtaux2 opie-keytabs"
RDEPENDS_${PN} = "opie-keytabs"
APPNAME = "embeddedkonsole"

S = "${WORKDIR}/${APPNAME}"

inherit opie

do_install() {
    install -d ${D}${palmtopdir}/pics/konsole/
    install -m 0644 ${WORKDIR}/pics/konsole/*.png ${D}${palmtopdir}/pics/konsole/
}
