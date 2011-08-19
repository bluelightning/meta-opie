DESCRIPTION = "Opie FTP Library"
SECTION = "opie/libs"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
I18N_FILES = "libftplib.ts"
APPNAME = "opie-ftplib"

S = "${WORKDIR}/ftplib"

inherit opie

do_install() {
    oe_libinstall -so libftplib ${D}${libdir}
    install -d ${D}${includedir}
    install -m 0664 ${S}/ftplib.h ${D}${includedir}
}
