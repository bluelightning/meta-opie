DESCRIPTION = "Opie native i18n tool lrelease"
SECTION = "opie/base"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
DEPENDS = "uicmoc3-native"
INC_PR = "r1"

S = "${WORKDIR}/opie-lrelease"

inherit native qmake qt3e

export OE_QMAKE_LINK="${CXX}"
EXTRA_QMAKEVARS_POST_append = "LIBS+=-ldl"

do_install() {
        install -d ${D}${bindir}/
        install -m 0755 opie-lrelease ${D}${bindir}/
}

NATIVE_INSTALL_WORKS = "1"
