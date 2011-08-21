DESCRIPTION = "Mahjongg"
SECTION = "opie/games"
LICENSE = "GPLv2"
AUTHOR = "Mario Weilguni, Port by Rober Ernst"
HOMEPAGE = "http://www.linux-solutions.at/projects/zaurus/games-Mahjongg.html"


SRC_URI = "http://sources.openembedded.org/mahjongg_V1.0.0.tar.gz \
           file://Makefile.patch \
	   file://mahjongg.patch"


S = "${WORKDIR}/mahjongg_V${PV}"

LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f \
                    file://Mahjongg.cpp;beginline=4;endline=12;md5=865e24c089f008b0e12624a42687cac4"

APPNAME = "mahjongg"
APPTYPE = "binary"
APPDESKTOP = "${S}"


do_compile_prepend() {
	oe_runmake -C images
	oe_runmake -C layouts
	oe_runmake -C tools
}


do_install () {
	install -d ${D}${palmtopdir}/pics/${APPNAME}/
	install -m 0644 ${S}/*.png ${D}${palmtopdir}/pics/${APPNAME}/

}

inherit opie

SRC_URI[md5sum] = "83587af02f53eb222242d0d84380735a"
SRC_URI[sha256sum] = "a059a2b0f438140a3bb1e30f410a28863eec61ebbb90c925209c7a473a89b76b"
