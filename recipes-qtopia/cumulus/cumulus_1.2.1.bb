DESCRIPTION = "A flightcomputer application for Qt/E based Palmtop Environments"
SECTION = "opie/applications"
LICENSE = "GPL"
APPTYPE = "binary"
APPNAME = "cumulus"
APPDESKTOP = "${S}"
PR = "r1"

SRC_URI = "http://www.kflog.org/fileadmin/user_upload/cumulus_downloads/${PV}/cumulus-${PV}.src.tar.bz2 \
	file://open_max.patch"
S = "${WORKDIR}/cumulus_${PV}/cumulus"

LIC_FILES_CHKSUM = "file://../COPYING;md5=cbbd794e2a0a289b9dfcc9f513d1996e \
                    file://main.cpp;beginline=10;endline=13;md5=ed0dbbe8a528ed308f02acc5e0658e3f"

inherit opie

export OE_QMAKE_LINK="${CXX}"
EXTRA_QMAKEVARS_POST += "INCLUDEPATH+=-I."

#
# nasty hack since cumulus doesn't obey the qmake standard which requires just one .pro file per directory
#
do_compile() {
	echo "#define SHARP_PDA_WARNSOUND 4" >sharp_char.h
	qmake -makefile -spec ${QMAKESPEC} -after ${EXTRA_QMAKEVARS_POST} cumulus.pro
	oe_runmake
	qmake -makefile -spec ${QMAKESPEC} -after ${EXTRA_QMAKEVARS_POST} gpsClient.pro
	oe_runmake
}

do_install() {
        install -d ${D}${palmtopdir}/pics/mapicons \
                   ${D}${palmtopdir}/pics/mapicons/small \
                   ${D}${palmtopdir}/pics/mapicons/windarrows \
                   ${D}${palmtopdir}/bin
        install -m 0644 ../cumulus.png ${D}${palmtopdir}/pics/cumulus.png
        install -m 0644 map-icons/*.png ${D}${palmtopdir}/pics/mapicons
        install -m 0644 map-icons/*.xpm ${D}${palmtopdir}/pics/mapicons
        install -m 0644 map-icons/small/*.png ${D}${palmtopdir}/pics/mapicons/small
        install -m 0644 map-icons/small/*.xpm ${D}${palmtopdir}/pics/mapicons/small
        install -m 0644 map-icons/windarrows/*.png ${D}${palmtopdir}/pics/mapicons/windarrows

	install -m 0755 gpsClient ${D}${palmtopdir}/bin/
}

SRC_URI[md5sum] = "a13e49376594c51fbfa74067f8d14d45"
SRC_URI[sha256sum] = "e3ed263ee98971674f3f3cf55e42b7f2e79755b0f931f8a105676108185e8010"
