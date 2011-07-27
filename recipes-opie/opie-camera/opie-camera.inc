DESCRIPTION = "Opie Camera, Photo and Video Capturing Application for the Sharp CF-AG06 camera"
SECTION = "opie/applications"
PRIORITY = "optional"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
RDEPENDS_${PN} = "sharp-camera-support"
APPNAME = "camera"
APPTYPE = "binary"

COMPATIBLE_MACHINE = "collie"

S = "${WORKDIR}/camera"

EXTRA_QMAKEVARS_POST += "LIBS+=-L.."
PARALLEL_MAKE = ""

inherit opie

do_install() {
    install -d ${D}${palmtopdir}/pics/${APPNAME}
    install -d ${D}${palmtopdir}/lib/
    oe_libinstall -so libcamera ${D}${palmtopdir}/lib
    install -m 0755 capture ${D}${palmtopdir}/bin/
    install -m 0644 ${WORKDIR}/pics/${APPNAME}/*.png ${D}${palmtopdir}/pics/${APPNAME}/
}
