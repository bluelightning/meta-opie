DESCRIPTION = "A note taking program with basic draw tools"
SECTION = "opie/pim"
PRIORITY = "optional"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
DEPENDS = "libopiecore2 libopieui2 libqtaux2"
APPNAME = "drawpad"


S = "${WORKDIR}/${APPNAME}"

inherit opie

# FILES plugins/application/libdrawpad.so* bin/drawpad apps/1Pim/drawpad.desktop pics/drawpad
do_install() {
        install -d ${D}${palmtopdir}/pics/${APPNAME}/
        install -m 0644 ${WORKDIR}/pics/${APPNAME}/*.png ${D}${palmtopdir}/pics/${APPNAME}/
}

