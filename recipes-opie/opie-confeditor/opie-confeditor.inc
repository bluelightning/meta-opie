DESCRIPTION = "An enditor for the ~/Settings/*.conf files"
SECTION = "opie/settings"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
APPNAME = "confedit"


S = "${WORKDIR}/${APPNAME}"

inherit opie

# FILES bin/confedit apps/Settings/confedit.desktop pics/confedit/confedit.png plugins/application/libconfedit.so*
do_install() {
        install -d ${D}${palmtopdir}/pics/${APPNAME}/
        install -m 0644 ${WORKDIR}/pics/${APPNAME}/*.png ${D}${palmtopdir}/pics/${APPNAME}/
}

