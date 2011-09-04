DESCRIPTION = "Opie Network Settings"
SECTION = "opie/settings"
LICENSE = "GPLv2"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
PROVIDES = "opie-networksettings-pppplugin opie-networksettings-wlanplugin"
APPNAME = "networksettings"

S = "${WORKDIR}/${APPNAME}"

inherit opie

PARALLEL_MAKE = ""

EXTRA_QMAKEVARS_POST += "LIBS+=-L${S}"

do_install() {
        # Create dir for changedns and the opie-kppp peer
        install -d ${D}${bindir}/
        install -d ${D}${sysconfdir}/
        install -d ${D}${sysconfdir}/ppp/
        install -d ${D}${sysconfdir}/ppp/peers/

        install -d ${D}${palmtopdir}/pics/${APPNAME}/
        install -d ${D}${palmtopdir}/pics/Network/
        install -m 0644 ${WORKDIR}/pics/${APPNAME}/*.* ${D}${palmtopdir}/pics/${APPNAME}/
        install -m 0644 ${WORKDIR}/pics/Network/*.* ${D}${palmtopdir}/pics/Network/
        install -d ${D}${palmtopdir}/lib/
        oe_libinstall -so libinterfaces ${D}${libdir}
        install -d ${D}${palmtopdir}/plugins/networksettings/
        for plugin in kppp wlan
        do
                install lib$plugin.so ${D}${palmtopdir}/plugins/networksettings/
        done

        # install changedns script
        install -m 0755 ${WORKDIR}/root/usr/bin/changedns ${D}${bindir}/
        install -m 0644 ${WORKDIR}/root/etc/ppp/peers/opie-kppp ${D}${sysconfdir}/ppp/peers

        install -d ${D}${includedir}/interfaces/
        install -m 0644 interfaces/*.h ${D}${includedir}/interfaces/
}

PACKAGES =+ "opie-networksettings-pppplugin opie-networksettings-wlanplugin"
FILES_${PN} += " ${bindir}/changedns "
FILES_opie-networksettings-pppplugin = "${palmtopdir}/plugins/networksettings/libkppp.so ${sysconfdir}/ppp/peers/opie-kppp"
FILES_opie-networksettings-wlanplugin = "${palmtopdir}/plugins/networksettings/libwlan.so"
