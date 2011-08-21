DESCRIPTION = "A frontend for the nmap port scanner, Qt/Embedded Palmtop Environment"
SECTION = "opie/applications"
LICENSE = "GPLv2"
RDEPENDS_${PN} = "nmap"
PR = "r1"

SRC_URI = "http://www.bluelightning.org/qpe-nmap/files/qpe-nmap-${PV}.tar.bz2"

APPNAME = "qpe-nmap"
APPTYPE = "binary"
APPDESKTOP = "${WORKDIR}"

S = "${WORKDIR}/qpe-nmap"

LIC_FILES_CHKSUM = "file://COPYING;md5=878e3965c7b52d85827c75f5a2f3b314"

inherit opie

do_install () {
    install -d ${D}${palmtopdir}/pics/${APPNAME}/
    install -m 0644 ${WORKDIR}/qpe-nmap/ipk/opt/QtPalmtop/pics/qpe-nmap.png ${D}${palmtopdir}/pics/
    install -d ${D}${palmtopdir}/apps/Applications/
    install -m 0644 ${WORKDIR}/qpe-nmap/ipk/opt/QtPalmtop/apps/Applications/qpe-nmap.desktop ${D}${palmtopdir}/apps/Applications/
}


SRC_URI[md5sum] = "82d20f06942324af7fc4ce302efb1028"
SRC_URI[sha256sum] = "5ea7f9188aa221f004db1688713f35199adf3075d0b54f2bffa2461e9f11ee05"
