DESCRIPTION = "Sound settings dialog"
SECTION = "opie/settings"
LICENSE = "GPLv2"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
APPNAME = "sound"


S = "${WORKDIR}/${APPNAME}"

inherit opie

# FILES plugins/application/libsound.so* bin/sound apps/Settings/Sound.desktop
