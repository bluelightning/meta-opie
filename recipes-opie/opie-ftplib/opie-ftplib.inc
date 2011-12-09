DESCRIPTION = "Opie FTP Library"
SECTION = "opie/libs"
LICENSE = "LGPLv2+"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/LGPL-2.0;md5=9427b8ccf5cf3df47c29110424c9641a"
I18N_FILES = "libftplib.ts"
APPNAME = "opie-ftplib"

S = "${WORKDIR}/ftplib"

inherit opie

do_install() {
    oe_libinstall -so libftplib ${D}${libdir}
    install -d ${D}${includedir}
    install -m 0664 ${S}/ftplib.h ${D}${includedir}
}
