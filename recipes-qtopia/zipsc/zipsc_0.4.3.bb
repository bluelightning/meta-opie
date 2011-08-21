DESCRIPTION = "IP/Subnet calculator for Qt/Embedded based Palmtop Environments"
SECTION = "opie/applications"
LICENSE = "GPL"
HOMEPAGE = "http://www.warmi.net/zaurus/zipsc.shtml"
PR = "r2"

SRC_URI = "http://www.warmi.net/zaurus/files/zipsc_${PV}.tar.gz \
           file://gcc3.patch"
S = "${WORKDIR}/zipsc_${PV}"

LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f \
                    file://MainWindow.cpp;beginline=15;endline=19;md5=1e2b6c4dbd3bcb988345670af91dec14"


inherit palmtop

do_install() {
        install -d ${D}${palmtopdir}/bin \
                   ${D}${palmtopdir}/apps/Applications \
                   ${D}${palmtopdir}/pics \
                   ${D}${palmtopdir}/pics/zipsc
        install -m 0755 zipsc ${D}${palmtopdir}/bin/
        install -m 0644 Qtopia/opt/QtPalmtop/pics/zipsc.png ${D}${palmtopdir}/pics/
        install -m 0644 Qtopia/opt/QtPalmtop/pics/zipsc/*.png_ ${D}${palmtopdir}/pics/zipsc/
        install -m 0644 Qtopia/opt/QtPalmtop/apps/Applications/zipsc.desktop ${D}${palmtopdir}/apps/Applications/
}

SRC_URI[md5sum] = "84c9037c144cb9a56137e2c218532ee1"
SRC_URI[sha256sum] = "a5e989f87fd85b66b2cea1246f14577cbef9a618abde2df2c17a04030fb6cda6"
