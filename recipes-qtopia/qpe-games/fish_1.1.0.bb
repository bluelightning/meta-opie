DESCRIPTION = "Fish Amusement"
SECTION = "opie/games"
LICENSE = "GPLv2"
AUTHOR = "Robert Ernst"
HOMEPAGE = "http://www.linux-solutions.at/projects/zaurus/games-Fish.html"



SRC_URI = "http://sources.openembedded.org/fish_V1.1.0.tar.gz \
           file://Makefile.patch \
           file://fish.patch"

S = "${WORKDIR}/fish_V${PV}"

LIC_FILES_CHKSUM = "file://COPYING;md5=cbbd794e2a0a289b9dfcc9f513d1996e \
                    file://Fish.cpp;beginline=4;endline=12;md5=865e24c089f008b0e12624a42687cac4"

APPNAME = "fish"
APPTYPE = "binary"
APPDESKTOP = "${S}"


do_compile_prepend() {
	oe_runmake -C images
}

do_install () {
	install -d ${D}${palmtopdir}/pics/${APPNAME}/
	install -m 0644 ${S}/*.png ${D}${palmtopdir}/pics/${APPNAME}/

}

inherit opie

SRC_URI[md5sum] = "78770f1abce09fbbaa0a46ce8ccc607f"
SRC_URI[sha256sum] = "9d13db38c065d70f48ce70580c7d8cd940d923192c04bc3cb356cc98879b5788"
