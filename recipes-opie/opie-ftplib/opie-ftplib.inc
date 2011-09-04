DESCRIPTION = "Opie FTP Library"
SECTION = "opie/libs"
LICENSE = "LGPLv2+"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/LGPL-2.0;md5=03f2b9deed35802bc1aae2ae3dc6d9ed"
I18N_FILES = "libftplib.ts"
APPNAME = "opie-ftplib"

S = "${WORKDIR}/ftplib"

inherit opie

do_install() {
    oe_libinstall -so libftplib ${D}${libdir}
    install -d ${D}${includedir}
    install -m 0664 ${S}/ftplib.h ${D}${includedir}
}
