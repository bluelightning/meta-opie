DESCRIPTION = "Simulates any 2 of: DG, CDI for VOR1, CDI for VOR2, ADF, RMI \
while you drag an NDB, 2 VORs and an airplane around in an overhead view."
SECTION = "opie/applications"
LICENSE = "GPLv2"
APPTYPE = "binary"
APPDESKTOP = "../Qtopia/opt/QtPalmtop/apps/Applications"

inherit opie

SRC_URI = "http://sources.openembedded.org/insttrain-${PV}.tgz \
           file://gcc3.patch"
S = "${WORKDIR}/insttrain-${PV}/src"

LIC_FILES_CHKSUM = "file://../LICENSE.GPL;md5=e4b548a2ac0ab71019d381e8ff18b4a9 \
                    file://main.cpp;beginline=9;endline=15;md5=eb3e8332c3795a921bd7a6ea7449dc33"

QMAKE_PROFILES = "rmi.pro"

do_install() {
	install -d ${D}${palmtopdir}/pics/
	install -m 0644 ../Qtopia/opt/QtPalmtop/pics/*.png ${D}${palmtopdir}/pics/
}


SRC_URI[md5sum] = "2cec5b79969d0fc64c510edfe7113319"
SRC_URI[sha256sum] = "2dd29e066dece7062cb30daeedad7e5baa0b5cb993c67ba700ebacd6e0212487"
