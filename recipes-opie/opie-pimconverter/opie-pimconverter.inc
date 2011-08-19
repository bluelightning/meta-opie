DESCRIPTION = "Opie PIM database converter"
SECTION = "opie/pim"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
DEPENDS = "sqlite3 sqlite" 
RDEPENDS_${PN} = "sqlite3 sqlite-bin" 

APPNAME = "opimconverter"


S = "${WORKDIR}/pimconverter"
EXTRA_QMAKEVARS_POST += "TARGET=${APPNAME}"

inherit opie

# FILES bin/opimconverter pics/opimconverter/* apps/1Pim/opimconverter.desktop
do_install() {
        install -d ${D}${palmtopdir}/pics/${APPNAME}/
        install -m 0644 ${WORKDIR}/pics/${APPNAME}/*.png ${D}${palmtopdir}/pics/${APPNAME}/
}

