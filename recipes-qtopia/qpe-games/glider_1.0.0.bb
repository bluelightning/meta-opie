DESCRIPTION = "Glider"
SECTION = "opie/games"
LICENSE = "GPLv2"
AUTHOR = "Robert Ernst"
HOMEPAGE = "http://www.linux-solutions.at/projects/zaurus/games-Glider.html"


SRC_URI = "http://sources.openembedded.org/glider_V1.0.0.tar.gz \
           file://Makefile.patch \
	   file://glider.patch"

S = "${WORKDIR}/glider_V${PV}"

LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f \
                    file://Glider.cpp;beginline=4;endline=12;md5=865e24c089f008b0e12624a42687cac4"

APPNAME = "glider"
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

SRC_URI[md5sum] = "78fe56143bab9a7df232fa15e35a54a6"
SRC_URI[sha256sum] = "972da0f1c35df459b99b24f5bbed5ddec150b714540e2254b6b37035117167ed"
