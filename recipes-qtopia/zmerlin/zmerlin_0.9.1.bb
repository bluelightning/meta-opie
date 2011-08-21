DESCRIPTION = "Puzzle Game for Qt/Embedded based palmtop environments."
SECTION = "opie/games"
LICENSE = "GPL"
PR = "r2"

SRC_URI = "http://www.linux-games.com/zmerlin/zmerlin.tar.gz"
S = "${WORKDIR}/zmerlin"

# This is thin but it's all we've got to go on...
LIC_FILES_CHKSUM = "file://ipk/CONTROL/control;beginline=8;endline=8;md5=cced8b49901709fa7b9968bb88dac559"

inherit palmtop

do_install() {
        install -d ${D}${palmtopdir}/bin \
                   ${D}${palmtopdir}/apps/Games \
                   ${D}${palmtopdir}/pics/zmerlin
        install -m 0755 zmerlin ${D}${palmtopdir}/bin/
        install -m 0644 ipk/opt/QtPalmtop/apps/Games/zmerlin.desktop ${D}${palmtopdir}/apps/Games/
        install -m 0644 ipk/opt/QtPalmtop/pics/zmerlin/*.png ${D}${palmtopdir}/pics/zmerlin/
}


SRC_URI[md5sum] = "ae1f9198544d1585f44dab7bab110ae3"
SRC_URI[sha256sum] = "28e73da5403faad322022e8fb327f99677841d26396a1a1f1e854c768b47cf7c"
