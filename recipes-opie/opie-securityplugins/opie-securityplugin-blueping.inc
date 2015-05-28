DESCRIPTION = "Blueping plugin for opie-security authentication. \
This is a bluetooth-based authentication plugin (you need \
to have another Bluetooth device around to use it)."
RDEPENDS_${PN} += "${@bb.utils.contains('DISTRO_FEATURES','bluez5','bluez5','bluez4',d)}"
APPNAME = "multiauthbluepingplugin"

include opie-securityplugin.inc

S = "${WORKDIR}/blueping"

do_install() {
        install -d ${D}${palmtopdir}/pics/security/
        install -m 0644 ${WORKDIR}/pics/security/bluepingplugin.png ${D}${palmtopdir}/pics/security/
}

