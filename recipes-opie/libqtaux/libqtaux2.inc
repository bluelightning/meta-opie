DESCRIPTION = "Qt/Embedded 2 Auxilliary libraries"
HOMEPAGE = "http://opie.sourceforge.net"
SECTION = "opie/libs"
LICENSE = "GPLv2"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

INC_PR = "r4"

S = "${WORKDIR}/libqtaux"

inherit opie

do_compile() {
        oe_runmake DESTDIR=${S}
}

do_install() {
        install -d ${D}${includedir}/opie2
        for i in `find . -name "*.h"`
        do
                install -m 0644 $i ${D}${includedir}/opie2/`basename $i`
        done

        oe_libinstall -so libqtaux2 ${D}${libdir}
}
