DESCRIPTION = "Checkers"
SECTION = "opie/games"
LICENSE = "GPL"
AUTHOR = "Walter Rawdanik"
HOMEPAGE = "http://www.linux-solutions.at/projects/zaurus/games-Checkers.html"


SRC_URI = "http://sources.openembedded.org/checkers_V1.0.5ern.tar.gz \
           file://checkers.patch"

S = "${WORKDIR}/checkers_V${PV}"
APPNAME = "checkers"
APPTYPE = "binary"
APPDESKTOP = "${S}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=33994abd59dbf0ac2baa657e9f174dae"

do_install () {
	install -d ${D}${palmtopdir}/pics/${APPNAME}/
	install -m 0644 ${S}/*.png ${D}${palmtopdir}/pics/${APPNAME}/

}


inherit opie

SRC_URI[md5sum] = "82b08b1980ec6fbfc83b4dc0e2df10f7"
SRC_URI[sha256sum] = "543435cb0988acc90a6e651e424eb331aba3f73361036d7af458bc1233973199"
