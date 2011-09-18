DESCRIPTION = "Password manager program for Opie."
SECTION = "opie/applications"
LICENSE = "GPLv2"
APPNAME = "zsafe"

S = "${WORKDIR}/${APPNAME}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=cbbd794e2a0a289b9dfcc9f513d1996e"

inherit opie

QMAKE_PROFILES = "zsafe.pro"

# FILES bin/zsafe apps/Applications/zsafe.desktop pics/zsafe/zsafe.png
do_install() {
        install -d ${D}${palmtopdir}/pics/${APPNAME}/
        install -m 0644 ${WORKDIR}/pics/${APPNAME}/*.png ${D}${palmtopdir}/pics/${APPNAME}/
}

