DESCRIPTION = "Password manager"
SECTION = "opie/applications"
LICENSE     = "GPLv2"
RCONFLICTS_${PN}  = "opie-zsafe"
APPNAME     = "zsafe"
APPTYPE     = "binary"
APPDESKTOP  = "${WORKDIR}"
SRC_URI     = "http://zcarsten.dyndns.org/carsten/zaurus/zsafe/zsafe_2.1.3.tgz \
               file://stream_h.patch"
S           = "${WORKDIR}"
PR = "r2"

LIC_FILES_CHKSUM = "file://LICENSE;md5=cbbd794e2a0a289b9dfcc9f513d1996e"

inherit opie

QMAKE_PROFILES = "zsafe.pro"

export OE_QMAKE_LINK="${CXX}"

#FILES bin/zsafe apps/Applications/zsafe.desktop pics/zsafe/zsafe.png

FILES_zsafe = "zsafe"

do_install() {
	install -d ${D}${palmtopdir}/pics/${APPNAME}/
	install -m 0644 ${WORKDIR}/pics/${APPNAME}/*.xpm ${D}${palmtopdir}/pics/${APPNAME}/
	install -m 0644 ${WORKDIR}/zsafe.png ${D}${palmtopdir}/pics/
}

SRC_URI[md5sum] = "5e4e10a67de603b04b752ed00311455d"
SRC_URI[sha256sum] = "0937b15ca5dcd6f49adff04096610cee1f70197e17d461aefa98ed52e5ea0b72"
