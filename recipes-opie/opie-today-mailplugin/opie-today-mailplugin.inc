DESCRIPTION = "Mail plugin for Today"
SECTION = "opie/today"
LICENSE = "GPLv2"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
DEPENDS = "opie-today opie-mailapplet"
RDEPENDS_${PN} = "opie-today opie-mailapplet"
APPNAME = "todaymailplugin"


S = "${WORKDIR}/mail"

inherit opie
