DESCRIPTION = "Opie Bluetooth library"
SECTION = "opie/libs"
DEPENDS = "libopie2"
LICENSE = "GPLv2"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

S = "${WORKDIR}/lib"

inherit opie

do_install() {
    oe_libinstall -so libopietooth1 ${D}${libdir}
    install -d ${D}${includedir}/opietooth/
    install -m 0644 *.h ${D}${includedir}/opietooth/
}
