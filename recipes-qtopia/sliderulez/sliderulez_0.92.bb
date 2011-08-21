DESCRIPTION = "Sliderulez is an advanced RPN pocket calculator."
HOMEPAGE = "http://www.gelhaus.net/cgi-bin/showpage.py?zaurus/+sliderulez.html"
AUTHOR = "Matthew Gelhaus"
SECTION = "opie/applications"
LICENSE = "GPL"
PR = "r0"

APPTYPE = "binary"
APPDESKTOP = "pkg/opt/QtPalmtop/apps/Applications"

SRC_URI = "http://www.gelhaus.net/zaurus/sliderulez-${PV}.tar.gz"

# No license files present in the source distribution, although there are
# is one notice embedded in the HTML documentation confirming it is GPL;
# however it's not really practical to checksum that in this case
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

inherit opie

EXTRA_QMAKEVARS_POST += "TARGET=sliderulez"

do_configure_prepend() {
	rm -rf "*.o Makefile"
}


do_install() {
	install -d ${D}${palmtopdir}/pics
	install -m 0644 pkg/opt/QtPalmtop/pics/SlideRuleZ.png ${D}${palmtopdir}/pics/
}

SRC_URI[md5sum] = "9b48fc595d7291fa8edddfafba2cb7a9"
SRC_URI[sha256sum] = "28a6af2d1490374de26084e346bbd227586c0f6232dcf4cfebf80413adc7d932"
