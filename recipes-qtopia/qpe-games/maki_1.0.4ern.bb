DESCRIPTION = "Maki"
SECTION = "opie/games"
LICENSE = "GPLv2"
AUTHOR = "Henry So, Jr."
HOMEPAGE = "http://www.linux-solutions.at/projects/zaurus/games-Maki.html"



SRC_URI = "http://sources.openembedded.org/maki_V1.0.4ern.tar.gz \
	   file://maki.patch"

S = "${WORKDIR}/maki_V${PV}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=393a5ca445f6965873eca0259a17f833 \
                    file://maki.cpp;beginline=5;endline=7;md5=91e084d9a0fc232ffc07143bd057d1a0"

APPNAME = "maki"
APPTYPE = "binary"
APPDESKTOP = "${S}"

do_install () {
	install -d ${D}${palmtopdir}/pics/${APPNAME}/
	install -m 0644 ${S}/*.png ${D}${palmtopdir}/pics/${APPNAME}/

}

inherit opie

SRC_URI[md5sum] = "cb5e4656fc3b13aa02d94096966ef2a9"
SRC_URI[sha256sum] = "6d5f1f771de97e08378940070b28dd75ac394ea611965ed1751600adbd099a59"
