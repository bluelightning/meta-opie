DESCRIPTION = "A traditional (german?) boardgame"
SECTION = "opie/games"
LICENSE     = "GPLv2+"
AUTHOR      = "Helge Plehn"
HOMEPAGE    = "http://hexatrolic.i-networx.de/"
APPNAME     = "labyrinth"


SRC_URI = "http://sources.openembedded.org/labyrinth-0.7-zecke1.tar.gz"

S = "${WORKDIR}/${APPNAME}"

LIC_FILES_CHKSUM = "file://labyrinth.cpp;beginline=8;endline=11;md5=34fa96606fe174b0bc9d6f39dd117f65"

do_install () {
	install -d ${D}${palmtopdir}/apps/Games/
	install -d ${D}${palmtopdir}/pics/${APPNAME}/
	install -d ${D}${palmtopdir}/share/games/${APPNAME}/

	install -m 0644 ${S}/pics/*.png ${D}${palmtopdir}/pics/${APPNAME}/
	install -m 0644 ${S}/${APPNAME}.desktop ${D}${palmtopdir}/apps/Games
	install -m 0644 ${S}/labyrinth.record ${D}${palmtopdir}/share/games/${APPNAME}/
}


inherit opie

SRC_URI[md5sum] = "027e5fd07dd6bd6c1f25161a266a0646"
SRC_URI[sha256sum] = "547088fbbc3c3f4e60544dca8500c5f7097911427fd7dd04ad082db03f117001"
