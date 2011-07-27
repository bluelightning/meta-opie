DESCRIPTION = "KeyZ Applet"
SECTION = "opie/applets"
PRIORITY = "optional"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
APPNAME = "zkbapplet"
RDEPENDS_${PN} = "opie-pics"
I18N_FILES = "keyz-cfg.ts"



S = "${WORKDIR}/${APPNAME}"

inherit opie

do_install() {
        install -d ${D}${palmtopdir}/pics/
        install -d ${D}${palmtopdir}/share/zkb/
        install -m 0644 ${WORKDIR}/share/zkb/*xml* ${D}${palmtopdir}/share/zkb/
	install -m 0644 ${WORKDIR}/share/zkb/zkb.xml.sample ${D}${palmtopdir}/share/zkb/zkb.xml
        install -d ${D}${palmtopdir}/bin
        install -m 0755 ${S}/keyz-cfg ${D}${palmtopdir}/bin/
        install -d ${D}${palmtopdir}/apps/Settings
        install -m 0644 ${WORKDIR}/apps/Settings/keyz-cfg.desktop ${D}${palmtopdir}/apps/Settings/
}
