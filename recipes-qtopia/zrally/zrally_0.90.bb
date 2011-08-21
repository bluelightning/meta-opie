DESCRIPTION = "ZRally is a top view race game which offers the player mulitple \
tracks and multiple skill levels."
SECTION = "opie/games"
LICENSE = "GPLv2+"
AUTHOR = "Kevin Greenhaw <kevin_greenhaw@email.com>"
HOMEPAGE = "http://zrally.sourceforge.net/zrally.html"
APPNAME = "zrally"
APPTYPE = "binary"
APPDESKTOP = "${WORKDIR}"

SRC_URI = "${SOURCEFORGE_MIRROR}/zrally/zrally_0.90_src.tar.gz;subdir=${BPN}-${PV} \
file://dir.patch;striplevel=0"

LIC_FILES_CHKSUM = "file://COPYING;md5=cbbd794e2a0a289b9dfcc9f513d1996e \
                    file://src/zrally.cpp;beginline=9;endline=16;md5=8e0469de3d41b77e1dbbd8a6c242bd8d"

inherit opie

do_install () {
	install -d ${D}${palmtopdir}/pics/${APPNAME}/track_pics/
	install -m 0644 track_pics/*.png ${D}${palmtopdir}/pics/${APPNAME}/track_pics/
	install -m 0644 track_pics/ZRallyIcon.png ${D}${palmtopdir}/pics/
}


SRC_URI[md5sum] = "7084c0d2b28108563ca45e5ec1533ba1"
SRC_URI[sha256sum] = "c4fb0477fdc110b63d867ae2a46cca7913fa6a0ca8bf574c7189329bea91dcdf"
