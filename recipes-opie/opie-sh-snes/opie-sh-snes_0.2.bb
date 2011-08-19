DESCRIPTION = "Displays a list of available ROMs for use with snes9x."
SECTION = "opie/shell"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

RDEPENDS_${PN} = "opie-sh"


PR = "r3"

FILES_${PN} = "/opt/QtPalmtop"

SRC_URI = "file://snes.desktop \
           file://snes.png \
	   file://opie-sh-snes.sh"


do_install() {

	for dir in apps apps/Games bin pics
	do
		install -d ${D}${palmtopdir}/$dir
	done

	install -m 755 ${WORKDIR}/opie-sh-snes.sh ${D}${palmtopdir}/bin
	install -m 644 ${WORKDIR}/*.png ${D}${palmtopdir}/pics
	install -m 644 ${WORKDIR}/*.desktop ${D}${palmtopdir}/apps/Games
}
