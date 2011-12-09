DESCRIPTION = "IrDA obex support library"
SECTION = "opie/libs"
LICENSE = "LGPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/LGPL-2.0;md5=9427b8ccf5cf3df47c29110424c9641a"
DEPENDS = "libopietooth1 opie-taskbar openobex"
RDEPENDS_${PN} = "openobex-apps"
APPNAME = "obex"

S = "${WORKDIR}/obex"

inherit opie

EXTRA_QMAKEVARS_POST += "INCLUDEPATH+=${STAGING_INCDIR}/opietooth"

do_install() {
	install -d ${D}${palmtopdir}/pics/${APPNAME}/ ${D}${palmtopdir}/plugins/obex/
	install -m 0644 ${WORKDIR}/pics/backup/check.png ${D}${palmtopdir}/pics/${APPNAME}/
	install -m 0644 ${WORKDIR}/pics/${APPNAME}/*.png ${D}${palmtopdir}/pics/${APPNAME}/
	oe_libinstall -so libopieobex ${D}${palmtopdir}/plugins/obex/
}

FILES_${PN} = "${palmtopdir}/plugins/obex/ ${palmtopdir}/pics/obex/"
FILES_${PN}-dev = "${palmtopdir}/plugins/obex/lib*.so"
