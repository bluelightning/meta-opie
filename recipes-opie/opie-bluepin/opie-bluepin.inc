DESCRIPTION = "Opie BluePin"
SECTION = "opie/applications"
DEPENDS = "libopietooth1"
LICENSE = "GPLv2"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
APPNAME = "bluepin"
APPTYPE = "binary"

S = "${WORKDIR}/blue-pin"

inherit opie
