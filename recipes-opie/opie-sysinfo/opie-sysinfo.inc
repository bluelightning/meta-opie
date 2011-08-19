DESCRIPTION = "System Information dialog for the Opie environment"
SECTION = "opie/applications"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
APPNAME = "sysinfo"

S = "${WORKDIR}/${APPNAME}"

inherit opie

do_install() {
        install -d ${D}${palmtopdir}/pics/${APPNAME}/
        install -m 0644 ${WORKDIR}/pics/${APPNAME}/*.png ${D}${palmtopdir}/pics/${APPNAME}/
        install -d ${D}${palmtopdir}/share/sysinfo/
        install -m 0644 ${WORKDIR}/share/sysinfo/results ${D}${palmtopdir}/share/sysinfo/results
}

