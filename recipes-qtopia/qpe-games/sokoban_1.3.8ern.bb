DESCRIPTION = "Sokoban"
SECTION = "opie/games"
LICENSE = "GPLv2"
AUTHOR = "Anders Widell, Steve Dunham, Robert Ernst"
HOMEPAGE = "http://www.linux-solutions.at/projects/zaurus/games-Sokoban.html"


SRC_URI = "http://sources.openembedded.org/sokoban_V1.3.8ern.tar.gz \
           file://sokoban.patch"

S = "${WORKDIR}/sokoban_V${PV}"

LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f \
                    file://main.C;beginline=6;endline=14;md5=f2ed6543478c351305caf0337285d513"

APPNAME = "sokoban"
APPTYPE = "binary"
APPDESKTOP = "${S}"

do_compile_prepend() {
	oe_runmake -C images
	oe_runmake -C levels
}

do_install () {
	install -d ${D}${palmtopdir}/pics/${APPNAME}/
	install -m 0644 ${S}/*.png ${D}${palmtopdir}/pics/${APPNAME}/

}

inherit opie


SRC_URI[md5sum] = "a362dc3f5f23d785990917103c76a43d"
SRC_URI[sha256sum] = "084f8286eb945455f3f1567c0a7e7df3a759f2a4e1aab3b881b8ef1bda5bdb21"
