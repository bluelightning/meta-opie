DESCRIPTION = "A remote control"
SECTION = "opie/applications"
LICENSE = "GPLv2+"
RDEPENDS_${PN} = "lirc"
APPNAME = "remote"
APPTYPE = "binary"

S = "${WORKDIR}/${APPNAME}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=1b8b7eea1ef88a433b9099cf032abc58"

inherit opie

# FILES bin/remote apps/Applications/remote.desktop pics/remote/*.png
do_install() {
        install -d ${D}${palmtopdir}/pics/${APPNAME}/
        install -m 0644 ${WORKDIR}/pics/${APPNAME}/*.png ${D}${palmtopdir}/pics/${APPNAME}/
}

