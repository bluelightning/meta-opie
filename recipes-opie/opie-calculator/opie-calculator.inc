DESCRIPTION = "Calculator"
SECTION = "opie/applications"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
APPNAME = "calculator"


S = "${WORKDIR}/${APPNAME}"

inherit opie

# FILES plugins/application/libcalculator.so* bin/calculator apps/Applications/calculator.desktop etc/unit_conversion.dat pics/calc
do_install() {
        install -d ${D}${palmtopdir}/pics/calc/
        install -m 0644 ${WORKDIR}/pics/calc/*.png ${D}${palmtopdir}/pics/calc/
        install -d ${D}${palmtopdir}/etc/
        install -m 0644 ${WORKDIR}/etc/unit_conversion.dat ${D}${palmtopdir}/etc/
}

