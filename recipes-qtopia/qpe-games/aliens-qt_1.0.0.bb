DESCRIPTION = "Alien ShootOut"
SECTION = "opie/games"
LICENSE = "GPLv2"
AUTHOR = "Bill Kendrick"
HOMEPAGE = "http://www.linux-solutions.at/projects/zaurus/games-Aliens.html"


SRC_URI = "http://sources.openembedded.org/aliens_V1.0.0.tar.gz \
	   file://Makefile.patch \
           file://aliens.patch"

S = "${WORKDIR}/aliens_V${PV}"

LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f \
                    file://Aliens.cpp;beginline=4;endline=12;md5=865e24c089f008b0e12624a42687cac4"

APPNAME = "aliens"
APPTYPE = "binary"
APPDESKTOP = "${S}"

do_compile_prepend () {
	oe_runmake -C images
}

do_install () {
	install -d ${D}${palmtopdir}/pics/${APPNAME}/
	install -m 0644 ${S}/*.png ${D}${palmtopdir}/pics/${APPNAME}/

}

inherit opie


SRC_URI[md5sum] = "9d7cde75aecf4b85478c0e47343d4293"
SRC_URI[sha256sum] = "0aa0084a74f912f4002f1c40a815ce62ac13331ec84787a954d8bea06e1c96c5"
