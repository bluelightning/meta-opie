DESCRIPTION = "Reload .desktop files on the fly"
SECTION = "opie/settings"
LICENSE = "GPLv2"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

PACKAGE_ARCH = "all"

SRC_URI = "file://icon-reload.desktop \
	   file://icon-reload.sh \
	   file://reload.png"

S = "${WORKDIR}"

inherit palmtop-defs

FILES_${PN} += "${palmtopdir}"

do_install() {		
	install -d ${D}${palmtopdir}/apps/Settings
	install -d ${D}${bindir}
	install -d ${D}${palmtopdir}/pics
	
	install -m 0644 ${WORKDIR}/icon-reload.desktop ${D}${palmtopdir}/apps/Settings
	install -m 0755 ${WORKDIR}/icon-reload.sh ${D}${bindir}
	sed -i -e 's,@bindir@,${bindir},g' ${D}${bindir}/icon-reload.sh
	install -m 0644 ${WORKDIR}/reload.png ${D}${palmtopdir}/pics	
}

