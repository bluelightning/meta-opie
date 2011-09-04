DESCRIPTION = "Opie PIM database converter"
SECTION = "opie/pim"
LICENSE = "LGPLv2+"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/LGPL-2.0;md5=03f2b9deed35802bc1aae2ae3dc6d9ed"
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

