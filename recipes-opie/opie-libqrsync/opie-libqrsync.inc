DESCRIPTION = "Qt wrapper for librsync"
SECTION = "opie/base"
PRIORITY = "optional"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

S = "${WORKDIR}/rsync"

inherit opie

do_install() {
        oe_libinstall -a libqrsync ${D}${libdir}/
        install -d ${D}${includedir}/
        install -m 0644 qrsync.h ${D}${includedir}/
}
