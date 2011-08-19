DESCRIPTION = "A datebook/appointment manager"
SECTION = "opie/pim"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
RDEPENDS_${PN} = "opie-pics"
APPNAME = "datebook"


S = "${WORKDIR}/${APPNAME}"

inherit opie

# FILES plugins/application/libdatebook.so* bin/datebook apps/1Pim/datebook.desktop
