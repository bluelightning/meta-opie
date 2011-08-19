DESCRIPTION = "Mpeg video file plugin using libmad"
SECTION = "opie/codecs"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
DEPENDS = "opie-mediaplayer1"
RDEPENDS_${PN} = "opie-mediaplayer1"
PV = "${OPIE_GIT_PV}"
PR = "r2"
APPNAME = "mpeg3plugin"

SRC_URI = "${OPIE_GIT};protocol=git;subpath=core/multimedia/opieplayer"

S = "${WORKDIR}/opieplayer/libmpeg3"

inherit opie

EXTRA_QMAKEVARS_POST += "DEFINES+=USE_FIXED_POINT"

# FILES plugins/codecs/libmpeg3plugin.so
