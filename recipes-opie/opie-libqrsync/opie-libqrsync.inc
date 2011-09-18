DESCRIPTION = "Qt wrapper for librsync"
SECTION = "opie/base"
LICENSE = "LGPLv2.1+"

S = "${WORKDIR}/rsync"

LIC_FILES_CHKSUM = "file://COPYING;md5=d8045f3b8f929c1cb29a1e3fd737b499"

inherit opie

do_install() {
        oe_libinstall -a libqrsync ${D}${libdir}/
        install -d ${D}${includedir}/
        install -m 0644 qrsync.h ${D}${includedir}/
}

# opie doesn't use staticdev packages and .a libraries
# This package is an exception, so include .a in -dev
FILES_${PN}-dev += "${libdir}/libqrsync.a"
