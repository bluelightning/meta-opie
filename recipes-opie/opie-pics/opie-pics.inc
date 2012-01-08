DESCRIPTION = "Common Opie pictures usable from all applications"
SECTION = "opie/base"
LICENSE = "GPLv2"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
PR = "r2"

S = "${WORKDIR}"

inherit palmtop-defs

SHIP_INLINE_PICS = "yes"
INLINE_PICS = '${@base_conditional("GUI_MACHINE_CLASS", "bigscreen", "pics-hires/inline", "pics/inline", d)}'

do_install() {
	install -d ${D}${palmtopdir}/pics/addressbook/
	install -d ${D}${palmtopdir}/pics/datebook/
	install -d ${D}${palmtopdir}/pics/todo/
	install -d ${D}${palmtopdir}/pics/opie/
	install -m 0664 pics/*.png ${D}${palmtopdir}/pics/
	install -m 0664 pics/addressbook/*.png ${D}${palmtopdir}/pics/addressbook/
	install -m 0664 pics/datebook/*.png ${D}${palmtopdir}/pics/datebook/
	install -m 0664 pics/todo/*.png ${D}${palmtopdir}/pics/todo/	
	install -m 0664 pics/opie/*.png ${D}${palmtopdir}/pics/opie/	

	if [ "${SHIP_INLINE_PICS}" = "yes" ]; then
		install -m 0664 ${INLINE_PICS}/*.png ${D}${palmtopdir}/pics/
	fi
}

FILES_${PN} = "${palmtopdir}"
PACKAGE_ARCH = "${MACHINE_ARCH}"

