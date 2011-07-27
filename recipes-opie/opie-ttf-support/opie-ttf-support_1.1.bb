DESCRIPTION = "Meta-package for Opie TTF support"
SECTION = "opie/fonts"
DEPENDS = "freetype"
LICENSE = "GPLv2"
PR = "r5"

SRC_URI = "file://update-qtttffontdir.c \
           file://02qtttffont-update"
S = "${WORKDIR}"

LIC_FILES_CHKSUM = "file://update-qtttffontdir.c;beginline=4;endline=7;md5=84d4335f8f9e85774e2a15b2dff91401"

# Seems to break linking
ASNEEDED = ""

do_compile() {
        ${CC} ${CFLAGS} ${LDFLAGS} -I${STAGING_INCDIR}/freetype2 -lfreetype -o update-qtttffontdir update-qtttffontdir.c
}

do_install() {
        install -d ${D}${sbindir}
        install -d ${D}${sysconfdir}/update-fonts-common.d/
        install -m 0755 update-qtttffontdir ${D}${sbindir}
        install -m 0755 02qtttffont-update ${D}${sysconfdir}/update-fonts-common.d/
        sed -i 's!@@SBINDIR@@!${sbindir}!g' ${D}${sysconfdir}/update-fonts-common.d/02qtttffont-update
        sed -i 's!@@PALMTOPDIR@@!${palmtopdir}!g' ${D}${sysconfdir}/update-fonts-common.d/02qtttffont-update
        sed -i 's!@@DATADIR@@!${datadir}!g' ${D}${sysconfdir}/update-fonts-common.d/02qtttffont-update
}

pkg_postinst() {
        ${sysconfdir}/update-fonts-common.d/02qtttffont-update
}
