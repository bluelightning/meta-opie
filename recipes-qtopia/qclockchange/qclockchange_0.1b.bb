DESCRIPTION = "Program that allows you to set the CCCR registers on PXA Zauruses."
SECTION = "opie/settings"
LICENSE = "GPL"
AUTHOR = "piro <piro400@occn.zaq.ne.jp>"
HOMEPAGE = "http://piro.sytes.net/~piro/zaurus/"
APPTYPE="binary"
PR = "r0"

SRC_URI = "http://piro.sytes.net/~piro/zaurus/etc/qclockchange-${PV}.tar.gz \
	   file://qclockchange.png \
	   file://qclockchange.desktop "

# No license files present in the source distribution, assume GPL based on LICENSE above
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

inherit palmtop

do_install() {
	install -d ${D}${palmtopdir}/bin/ \
               ${D}${palmtopdir}/pics \
               ${D}${palmtopdir}/apps/Settings

	install -m 0755 bin/qclockchange ${D}${palmtopdir}/bin/qclockchange
	install -m 0644 ${WORKDIR}/qclockchange.png ${D}${palmtopdir}/pics/qclockchange.png
	install -m 0644 ${WORKDIR}/qclockchange.desktop ${D}${palmtopdir}/apps/Settings/qclockchange.desktop
}

SRC_URI[md5sum] = "4131497c414c7fedae1df58cab2ddfa3"
SRC_URI[sha256sum] = "8cb7000f55ab124d5fe928960c3c9a059faf4f374981b88e74ac0cdb7904c98a"
