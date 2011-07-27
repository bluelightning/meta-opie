DESCRIPTION = "Developer Examples for Opie"
SECTION = "opie/base"
PRIORITY = "optional"
DEPENDS = "opie-networksettings"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
APPTYPE = "binary"

S = "${WORKDIR}/examples"

inherit opie

do_install() {
        install -d ${D}${palmtopdir}/bin/

        for i in `find . -perm 0755 -type f`
        do
                install -m 0755 $i ${D}${palmtopdir}/bin/`basename $i`
        done
}

