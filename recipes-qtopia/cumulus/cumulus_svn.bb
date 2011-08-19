DESCRIPTION = "A flightcomputer application for Qt/E based Palmtop Environments"
SECTION = "opie/applications"
LICENSE = "GPL"
APPTYPE = "binary"
APPNAME = "cumulus"
APPDESKTOP = "${S}"
PV = "1.3.1+svn"
PR = "r0"

SRC_URI = "http://www.kflog.org/fileadmin/user_upload/cumulus_snapshots/CumulusQt2-snapshot.tbz"
S = "${WORKDIR}/CumulusQt2/cumulus"

LIC_FILES_CHKSUM = "file://../COPYING;md5=cbbd794e2a0a289b9dfcc9f513d1996e \
                    file://cumulusapp.cpp;beginline=15;endline=22;md5=8e0469de3d41b77e1dbbd8a6c242bd8d"

inherit opie

DEFAULT_PREFERENCE = "-1"

export OE_QMAKE_LINK="${CXX}"
EXTRA_QMAKEVARS_POST += "INCLUDEPATH+=-I."

do_configure() {
	:
}

#
# nasty hack since cumulus doesn't obey the qmake standard which requires just one .pro file per directory
#
do_compile() {
	echo "#define SHARP_PDA_WARNSOUND 4" >sharp_char.h
	qmake -makefile -spec ${QMAKESPEC} -after ${EXTRA_QMAKEVARS_POST} cumulusOpie.pro
	oe_runmake
	echo "#define SHARP_PDA_WARNSOUND 4" >sharp_char.h
	cd ../gpsClient
	qmake -makefile -spec ${QMAKESPEC} -after ${EXTRA_QMAKEVARS_POST} gpsClientOpie.pro
	oe_runmake
}

do_install() {
        install -d ${D}${palmtopdir}/pics/cumulus \
                   ${D}${palmtopdir}/pics/cumulus/small \
                   ${D}${palmtopdir}/pics/cumulus/windarrows \
                   ${D}${palmtopdir}/bin
        install -m 0644 ../cumulus.png ${D}${palmtopdir}/pics/cumulus/cumulus.png
        install -m 0644 map-icons/*.png ${D}${palmtopdir}/pics/cumulus
        install -m 0644 map-icons/*.xpm ${D}${palmtopdir}/pics/cumulus
        install -m 0644 map-icons/small/*.png ${D}${palmtopdir}/pics/cumulus/small
        install -m 0644 map-icons/small/*.xpm ${D}${palmtopdir}/pics/cumulus/small
        install -m 0644 map-icons/windarrows/*.png ${D}${palmtopdir}/pics/cumulus/windarrows

	install -m 0755 gpsClient ${D}${palmtopdir}/bin/
}

SRC_URI[md5sum] = "99ccf3e29a44c1323ce33c2d81fe4f2e"
SRC_URI[sha256sum] = "ef93516854e08b79436f8153004d3e6e613e05adc08c43c8c71efaf466db3422"
