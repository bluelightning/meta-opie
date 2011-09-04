DESCRIPTION = "Qt wrapper for librsync"
SECTION = "opie/base"
LICENSE = "GPLv2"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

S = "${WORKDIR}/rsync"

inherit opie

do_install() {
        oe_libinstall -a libqrsync ${D}${libdir}/
        install -d ${D}${includedir}/
        install -m 0644 qrsync.h ${D}${includedir}/
}

# opie doesn't use staticdev packages and .a libraries
# This package is an exception, so include .a in -dev
FILES_${PN}-dev += "${libdir}/libqrsync.a"
