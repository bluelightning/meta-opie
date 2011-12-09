DESCRIPTION = "Qt-based class wrapper of libetpan"
SECTION = "opie/libs"
LICENSE = "LGPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/LGPL-2.0;md5=9427b8ccf5cf3df47c29110424c9641a"
DEPENDS = "libetpan"

S = "${WORKDIR}/libmailwrapper"

inherit opie

do_install() {
    oe_libinstall -so libmailwrapper ${D}${libdir}
    install -d ${D}${includedir}/libmailwrapper/
    install -m 0664 ${S}/maildefines.h ${D}${includedir}/libmailwrapper/
    install -m 0664 ${S}/settings.h ${D}${includedir}/libmailwrapper/
    install -m 0664 ${S}/statusmail.h ${D}${includedir}/libmailwrapper/
    install -m 0664 ${S}/abstractmail.h ${D}${includedir}/libmailwrapper/
    install -m 0664 ${S}/mailtypes.h ${D}${includedir}/libmailwrapper/
}
