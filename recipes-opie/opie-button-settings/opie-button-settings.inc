DESCRIPTION = "Opie device buttons settings dialog"
SECTION = "opie/settings"
LICENSE = "GPLv2"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
APPNAME = "buttonsettings"

S = "${WORKDIR}/button"

inherit opie

# Select which config file in the Opie source tree to use for each machine
OPIE_BUTTONCONFIG = ""
OPIE_BUTTONCONFIG_h1910  = "ipaq"
OPIE_BUTTONCONFIG_h1940  = "ipaq"
OPIE_BUTTONCONFIG_h2200  = "ipaq_norecord"
OPIE_BUTTONCONFIG_h3600  = "ipaq_h3600"
OPIE_BUTTONCONFIG_h3800  = "ipaq_old"
OPIE_BUTTONCONFIG_h3900  = "ipaq_old"
OPIE_BUTTONCONFIG_h5000  = "ipaq_old"
OPIE_BUTTONCONFIG_hx4700 = "ipaq"
OPIE_BUTTONCONFIG_h4000  = "ipaq"
OPIE_BUTTONCONFIG_rx1950 = "ipaq_rx1950"
OPIE_BUTTONCONFIG_rx3000 = "ipaq_norecord"
OPIE_BUTTONCONFIG_collie = "zaurus"
OPIE_BUTTONCONFIG_akita  = "zaurus_c700"
OPIE_BUTTONCONFIG_c7x0   = "zaurus_c700"
OPIE_BUTTONCONFIG_spitz  = "zaurus_c3xxx"
OPIE_BUTTONCONFIG_tosa   = "zaurus_6000"

do_install() {
	install -d ${D}${palmtopdir}/pics/${APPNAME}/
	install -d ${D}${palmtopdir}/pics/devicebuttons/
	install -m 0644 ${WORKDIR}/pics/${APPNAME}/*.png ${D}${palmtopdir}/pics/${APPNAME}/
	install -m 0644 ${WORKDIR}/pics/devicebuttons/*.png ${D}${palmtopdir}/pics/devicebuttons/

	if [ -d ${WORKDIR}/etc/buttons ] ; then
		if [ "${OPIE_BUTTONCONFIG}" != "" ] ; then
			# Yes, this is /etc in the Opie source, not sysconfdir
			install -d ${D}/etc
			install -m 0644 ${WORKDIR}/etc/buttons/${OPIE_BUTTONCONFIG} ${D}/etc/opie_buttons.conf
		fi
	fi
}

PACKAGE_ARCH = "${MACHINE_ARCH}"

PACKAGES =. "opie-button-settings-pics opie-button-settings-config "
RDEPENDS_${PN} = "opie-button-settings-pics"
RRECOMMENDS_${PN} = "opie-button-settings-config"

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

FILES_opie-button-settings-config = "/etc/opie_buttons.conf"
