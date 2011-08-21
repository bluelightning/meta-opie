DESCRIPTION = "Tx Image Viewer"
SECTION = "opie/applications"
LICENSE = "GPLv2+"
HOMEPAGE = "http://community.zaurus.com/projects/tximage/"
PR = "r2"

SRC_URI = "http://www.openzaurus.org/mirror/tximage-${PV}.tar.gz \
           file://gcc3.patch \
           file://gcc4.patch"

LIC_FILES_CHKSUM = "file://COPYING;md5=cbbd794e2a0a289b9dfcc9f513d1996e \
                    file://tximage.cpp;beginline=7;endline=20;md5=6227398c467a07965e07127f15bf4ef8"

inherit palmtop

do_install() {
        install -d ${D}${palmtopdir}/apps/Applications \
        	   ${D}${palmtopdir}/pics \
        	   ${D}${palmtopdir}/bin
        install -D -m 755 tximage ${D}${palmtopdir}/bin/tximage
        install -D -m 644 imageviewer.desktop ${D}${palmtopdir}/apps/Applications/tximage.desktop
        cp -pPR tximage.png ${D}${palmtopdir}/pics/
}

SRC_URI[md5sum] = "eca63798136caeeaf7fd4b24c3e10783"
SRC_URI[sha256sum] = "88b11a3e89db847e1db51e6f2b0c69e2afa0035fb4a47f523d264765eedb2958"
