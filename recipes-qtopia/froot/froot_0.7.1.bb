DESCRIPTION = "Froot is a game like frozen bubbles"
SECTION = "opie/games"
APPNAME = "froot"
APPTYPE = "binary"
APPDESKTOP = "${S}"
LICENSE = "GPLv2+"
PR = "r2"

SRC_URI = "http://www.shaderwrangler.com/froot/froot-${PV}.tar.gz"
S = "${WORKDIR}/froot-${PV}"

LIC_FILES_CHKSUM = "file://COPYING;md5=cbbd794e2a0a289b9dfcc9f513d1996e \
                    file://main.cpp;beginline=10;endline=16;md5=e4b04b981a74f06f863e6d7995e46b64"

inherit opie

do_install() {
    install -d ${D}${palmtopdir}/help/html
    install -d ${D}${palmtopdir}/pics/froot
    install -m 0644 Froot.png ${D}${palmtopdir}/pics/
    install -m 0644 help/html/froot.html ${D}${palmtopdir}/help/html/
    install -m 0644 pics/froot/*.png ${D}${palmtopdir}/pics/froot/
}

SRC_URI[md5sum] = "ac310580a6a54b692b977e11a0e80242"
SRC_URI[sha256sum] = "210a55754c4ff0fa4143c22334a22bb2768f0c8ded2f6efa60144ea1b0abed6a"
