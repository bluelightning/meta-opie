DESCRIPTION = "Opie Advanced Filemanager"
SECTION = "opie/applications"
PRIORITY = "optional"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
APPNAME = "advancedfm"
RDEPENDS_${PN} = "opie-advancedfm-pics"

S = "${WORKDIR}/${APPNAME}"

inherit opie

do_install() {
    install -d ${D}${palmtopdir}/pics/${APPNAME}/
    install -m 0644 ${WORKDIR}/pics/${APPNAME}/*.png ${D}${palmtopdir}/pics/${APPNAME}/
}

PACKAGES_prepend = "opie-advancedfm-pics "
FILES_opie-advancedfm-pics = "${palmtopdir}/pics/${APPNAME}/*.png"

