DESCRIPTION = "Checkers"
SECTION = "opie/games"
LICENSE = "GPLv2"
AUTHOR = "Robert Ernst"
HOMEPAGE = "http://www.linux-solutions.at/projects/zaurus/games-Crossword.html"

SRC_URI = "http://sources.openembedded.org/crossword_V0.0.3.tar.gz \
	   file://crossword.patch"

PR = "r1"

S = "${WORKDIR}/crossword_V${PV}"

LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f \
                    file://Board.cpp;beginline=4;endline=12;md5=865e24c089f008b0e12624a42687cac4"

APPNAME = "crossword"
APPTYPE = "binary"
APPDESKTOP = "${S}"

do_install () {
	install -d ${D}${palmtopdir}/pics/${APPNAME}/
	install -m 0644 ${S}/*.png ${D}${palmtopdir}/pics/${APPNAME}/

}

pkg_postinst_${PN}() {
#!/bin/sh

MIMEFILE=/opt/QtPalmtop/etc/mime.types

grep -q application/puz $MIMEFILE 2>/dev/null || printf "application/crossword\t\tpuz tpz\n" >> $MIMEFILE
}

inherit opie

SRC_URI[md5sum] = "659d5c53cbace53f44fe7acb666bfe33"
SRC_URI[sha256sum] = "8b718c344cf19417447cbc16867d2e04434654c13b330598b96720ead146b961"
