DESCRIPTION = "RSS aggregator for Qtopia"
SECTION = "opie/applications"
LICENSE = "GPLv2+"
AUTHOR = "Joe Rumsey <joe@rumsey.org>"
HOMEPAGE = "http://corsair.sf.net/"
RDEPENDS_${PN} = "opie-pics"

PR = "r2"

inherit palmtop

SRC_URI = "${SOURCEFORGE_MIRROR}/corsair/corsair-${PV}.tar.gz \
           file://corsair-opie.patch"

S = "${WORKDIR}/corsair"

LIC_FILES_CHKSUM = "file://COPYING;md5=eb723b61539feef013de476e68b5c50a \
                    file://main.cpp;beginline=5;endline=17;md5=8eb5203ac0642eb7d4ca61622b845f6e"

do_configure() {
}

do_compile() {
	oe_runmake LIBS="-l${QT_LIBRARY} -lqpe"
}

do_install() {
        install -d ${D}${palmtopdir}/pics/
        install -d ${D}${palmtopdir}/apps/Applications/
        install -d ${D}${palmtopdir}/bin
        install -m 0644 ${S}/Corsair.png ${D}${palmtopdir}/pics/
        install -m 0644 ${S}/corsair.desktop ${D}${palmtopdir}/apps/Applications/
        install -m 0644 ${S}/icons/newfeed.png ${S}/icons/get.png ${D}${palmtopdir}/pics/
        install -m 0755 ${S}/corsair ${D}${palmtopdir}/bin/
}

SRC_URI[md5sum] = "91dd4c6b5650aef03b293aa9a6f54d49"
SRC_URI[sha256sum] = "db3782e57882a36ac42b69097a817dc3e2a4031cacb815a4e4a1115da108e519"
