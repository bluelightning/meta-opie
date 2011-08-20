DESCRIPTION = "Pressure-Sensitive Paint Program for Opie/Qtopia"
SECTION = "opie/applications"
HOMEPAGE = "http://sun.dhis.portside.net/~sakira/wiki/?LinuxZaurus.PetitePeinture+en"
LICENSE = "GPL"
APPTYPE = "binary"
APPNAME = "petitpeintu"
APPDESKTOP = "${WORKDIR}"

SRC_URI = "http://sun.dhis.portside.net/~sakira/archive/SPainter_${PV}_src.tar.gz \
           file://petitpeintu.desktop \
           file://petitpeintu.png "
S = "${WORKDIR}/SPainter"

# No license files present in the source distribution, assume GPL based on LICENSE above
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

inherit opie

QMAKE_PROFILES = "spainter.pro"

do_install() {
        install -d ${D}${palmtopdir}/pics
        install -m 0644 *.png ${D}${palmtopdir}/pics/
        install -m 0644 ${WORKDIR}/petitpeintu.png ${D}${palmtopdir}/pics/
}

SRC_URI[md5sum] = "fe2db3db71bbf37085b66b19d2f2e306"
SRC_URI[sha256sum] = "321c463bdec83c08bd771e27f43f6114ddf7a754c434eb818dea105377ed00b3"
