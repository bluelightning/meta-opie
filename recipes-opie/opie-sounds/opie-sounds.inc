DESCRIPTION = "Common Opie Sounds"
SECTION = "opie/base"
PRIORITY = "optional"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

S = "${WORKDIR}/sounds"

SOUNDS = "alarm touchsound keysound"

do_install() {
        install -d ${D}${palmtopdir}/sounds/
        for i in ${SOUNDS}
        do
                install $i.wav ${D}${palmtopdir}/sounds/$i.wav
        done
}

FILES_${PN} = "${palmtopdir}"
