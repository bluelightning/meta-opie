DESCRIPTION = "Opie device buttons settings dialog"
SECTION = "opie/settings"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
RDEPENDS_${PN} = "opie-button-settings-pics"
APPNAME = "buttonsettings"

S = "${WORKDIR}/button"

inherit opie

do_install() {
        install -d ${D}${palmtopdir}/pics/${APPNAME}/
	install -d ${D}${palmtopdir}/pics/devicebuttons/
        install -m 0644 ${WORKDIR}/pics/${APPNAME}/*.png ${D}${palmtopdir}/pics/${APPNAME}/
	install -m 0644 ${WORKDIR}/pics/devicebuttons/*.png ${D}${palmtopdir}/pics/devicebuttons/
}

PACKAGES_prepend = "opie-button-settings-pics "
PACKAGE_ARCH_opie-button-settings-pics = "${MACHINE_ARCH}"
FILES_opie-button-settings-pics = "${palmtopdir}/pics/devicebuttons/z*" 
FILES_opie-button-settings-pics_h1910 = "${palmtopdir}/pics/devicebuttons/ipaq*"
FILES_opie-button-settings-pics_h1940 = "${palmtopdir}/pics/devicebuttons/ipaq*"
FILES_opie-button-settings-pics_h3600 = "${palmtopdir}/pics/devicebuttons/ipaq*"
FILES_opie-button-settings-pics_h3900 = "${palmtopdir}/pics/devicebuttons/ipaq*"
FILES_opie-button-settings-pics_h4000 = "${palmtopdir}/pics/devicebuttons/ipaq*"
FILES_opie-button-settings-pics_h5000 = "${palmtopdir}/pics/devicebuttons/ipaq*"
FILES_opie-button-settings-pics_h6300 = "${palmtopdir}/pics/devicebuttons/ipaq*"
FILES_opie-button-settings-pics_hx2000 = "${palmtopdir}/pics/devicebuttons/ipaq*"
FILES_opie-button-settings-pics_hx4700 = "${palmtopdir}/pics/devicebuttons/ipaq*"
FILES_opie-button-settings-pics_simpad = "${palmtopdir}/pics/devicebuttons/simpad*"
