DESCRIPTION = "Dictionary look-up program"
SECTION = "opie/applications"
LICENSE = "GPLv2+"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
APPNAME = "odict"


S = "${WORKDIR}/${APPNAME}"

inherit opie

# FILES plugins/application/libodict.so* bin/odict apps/Applications/odict.desktop pics/odict/odict.png
do_install() {
        install -d ${D}${palmtopdir}/pics/${APPNAME}/
        install -m 0644 ${WORKDIR}/pics/${APPNAME}/*.png ${D}${palmtopdir}/pics/${APPNAME}/
}

