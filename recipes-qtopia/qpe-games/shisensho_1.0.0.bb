DESCRIPTION = "Shisensho"
SECTION = "opie/games"
LICENSE = "GPLv2"
AUTHOR = "Mario Weilguni"
HOMEPAGE = "http://www.linux-solutions.at/projects/zaurus/games-Shisen-Sho.html"

SRC_URI = "http://sources.openembedded.org/shisensho_V1.0.0.tar.gz \
           file://shisen.patch"

S = "${WORKDIR}/shisensho_V${PV}"

LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f \
                    file://ShisenSho.cpp;beginline=4;endline=12;md5=865e24c089f008b0e12624a42687cac4"

APPNAME = "shisensho"
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


SRC_URI[md5sum] = "001103f5847e71b0198c3a11df7d62d0"
SRC_URI[sha256sum] = "17cebdc8ae4374c3944a3233d86278f4d09aaf90279b48e98367e9387f7e6acc"
