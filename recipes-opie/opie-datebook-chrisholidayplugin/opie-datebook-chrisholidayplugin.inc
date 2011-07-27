DESCRIPTION = "Opie datebook christian holidays plugin"
SECTION = "opie/datebook"
PRIORITY = "optional"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
RDEPENDS_${PN} = "opie-datebook"
APPNAME = "chrisholidayplugin"

S = "${WORKDIR}/christian"

inherit opie
