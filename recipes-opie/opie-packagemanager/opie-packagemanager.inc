DESCRIPTION = "Opie Package Manager"
SECTION = "opie/settings"
LICENSE = "LGPLv2+"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/LGPL-2.0;md5=03f2b9deed35802bc1aae2ae3dc6d9ed"
DEPENDS = "opkg"
APPNAME = "packagemanager"

S = "${WORKDIR}/${APPNAME}"

inherit opie

EXTRA_QMAKEVARS_PRE += "LIBIPK_INC_DIR=${STAGING_INCDIR}/libopkg"
export CONFIG_LIBOPK_DEP=y

do_install() {
    install -d ${D}${palmtopdir}/pics/${APPNAME}
    install -m 0644 ${WORKDIR}/pics/${APPNAME}/*.png ${D}${palmtopdir}/pics/${APPNAME}/
}
