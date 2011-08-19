DESCRIPTION = "Qt-based class wrapper of libetpan"
SECTION = "opie/libs"
LICENSE = "LGPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/LGPL-2.0;md5=03f2b9deed35802bc1aae2ae3dc6d9ed"
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
