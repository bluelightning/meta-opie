DESCRIPTION = "Painting program. Small picture editor."
HOMEPAGE = "http://zaurus.colognearts.de/qpphoto/"
SECTION = "opie/applications"
LICENSE = "GPLv2"
APPNAME = "qpPhoto"
APPTYPE = "binary"
APPDESKTOP = "${S}"

PR = "r0"

inherit opie

SRC_URI = "http://sources.openembedded.org/qpPhoto_1.0.2_src.tar.gz \
           file://draw.patch \
           file://drawview.patch \
           file://drawwidget.patch "

LIC_FILES_CHKSUM = "file://LICENSE.GPL;md5=e4b548a2ac0ab71019d381e8ff18b4a9 \
                    file://qpPhoto.cpp;beginline=8;endline=11;md5=9fa1e19adf19df036b8209aa847f2f36"


S = "${WORKDIR}/qpPhoto_1.0.2"

do_compile() {
	export STAGING_BINDIR=${STAGING_BINDIR}
	oe_runmake clean
	oe_runmake
}

do_install() {
#	install -d ${D}${palmtopdir}/apps/Applications
	install -d ${D}${palmtopdir}/pics
#	install -d ${D}${bindir}

	install -m 0644 qpPhoto.png ${D}${palmtopdir}/pics
#	install -m 0644 qpPhoto.desktop ${D}${palmtopdir}/apps/Applications
#	install -m 0755 qpPhoto ${D}${bindir}
}

# FILES_${PN} = " ${palmtopdir}/apps/Applications/qpPhoto.desktop ${palmtopdir}/pics/qpPhoto.png ${bindir}/qpPhoto "

SRC_URI[md5sum] = "c3c806bd2910e6c49617acb230eee306"
SRC_URI[sha256sum] = "ba2d98c4fabb31a66a66a235a5bbc9cb9e8a2c6f3939e71826d8763a8e7e3c0d"
