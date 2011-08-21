DESCRIPTION = "ZIQ"
SECTION = "opie/games"
LICENSE = "GPLv2"
AUTHOR = "Bill Wetter"
HOMEPAGE = "http://www.linux-solutions.at/projects/zaurus/games-ZIQ.html"


SRC_URI = "http://sources.openembedded.org/ziq_V1.1ern.tar.gz \
           file://ziq.patch"

PR = "r1"
S = "${WORKDIR}/ziq_V${PV}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=33994abd59dbf0ac2baa657e9f174dae \
                    file://mainwidget.cpp;beginline=6;endline=17;md5=7da0e7ce6bf5981858f5b4c8525cf12f"

APPNAME = "ziq"
APPTYPE = "binary"
APPDESKTOP = "${S}"


do_install () {
	install -d ${D}${palmtopdir}/apps/Games/
	install -d ${D}${palmtopdir}/pics/${APPNAME}/
	install -d ${D}${palmtopdir}/apps/Games
	install -m 0644 ${S}/*.png ${D}${palmtopdir}/pics/${APPNAME}/
	install -m 0644 ${S}/${APPNAME}.desktop ${D}${palmtopdir}/apps/Games
}


inherit opie

SRC_URI[md5sum] = "f8c6b4b8b5b6f62ec9fc117e4b35fd53"
SRC_URI[sha256sum] = "995a52223365ec41ae72ef781bde2c8f2f34e0e5dd19e17245f5f354ac52fb8b"
