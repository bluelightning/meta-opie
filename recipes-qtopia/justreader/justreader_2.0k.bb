DESCRIPTION = "An E-Books reader for Qt/Embedded based Palmtop Environments"
SECTION = "opie/applications"
LICENSE = "GPLv2+"
HOMEPAGE = "http://justreader.sourceforge.net/"
PR = "r3"

SRC_URI = "${SOURCEFORGE_MIRROR}/justreader/justreader_${PV}.tgz \
file://correct-settings-path.patch \
file://missing-include.patch"

S = "${WORKDIR}/TextReader2"

LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f \
                    file://main.cpp;beginline=9;endline=16;md5=8e0469de3d41b77e1dbbd8a6c242bd8d"

inherit palmtop

EXTRA_QMAKEVARS_POST += 'INCLUDEPATH+="${STAGING_INCDIR}/qpe" LIBS+=-lqpe'
export OE_QMAKE_LINK="${CXX}"

do_configure_prepend() {
	find . -name "Makefile"|xargs rm -f
}

do_install() {
	install -d ${D}${palmtopdir}/bin \
		   ${D}${palmtopdir}/pics/${PN}/ \
		   ${D}${palmtopdir}/apps/Applications
	install -m 0644 apps/Applications/justreader.desktop ${D}${palmtopdir}/apps/Applications/
	install -m 0755 bin/justreader ${D}${palmtopdir}/bin/
	install -m 0644 pics/* ${D}${palmtopdir}/pics/justreader/
}

SRC_URI[md5sum] = "74b2b89b12668cbbbb093b6343e9f52d"
SRC_URI[sha256sum] = "55b0dd7ac3f9860a4cba0797213fdaa898b77f3228612e3499d54e6fe6144514"
