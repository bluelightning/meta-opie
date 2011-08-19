DESCRIPTION = "Opie native i18n tool lupdate"
SECTION = "opie/base"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
DEPENDS = "uicmoc3-native"

S = "${WORKDIR}/opie-lupdate"

inherit native qmake qt3e

export OE_QMAKE_LINK="${CXX}"
EXTRA_QMAKEVARS_POST_append = "LIBS+=-ldl "
EXTRA_QMAKEVARS_POST_append = "CONFIG-=thread "

do_install() {
    install -d ${D}${bindir}/
    install -m 0755 opie-lupdate ${D}${bindir}/
}
