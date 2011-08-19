DESCRIPTION = "Set the system time - utilizing ntpdate, if available."
SECTION = "opie/settings"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
RRECOMMENDS_${PN} = "ntpdate"

APPNAME = "systemtime"


S = "${WORKDIR}/netsystemtime"

inherit opie

# FILES plugins/application/libsystemtime.so* bin/systemtime apps/Settings/systemtime.desktop etc/ntpservers pics/netsystemtime
do_install() {
        install -d ${D}${palmtopdir}/pics/netsystemtime/
        install -d ${D}${palmtopdir}/etc
        install -m 0644 ${WORKDIR}/pics/netsystemtime/*.png ${D}${palmtopdir}/pics/netsystemtime/
				install -m 0644 ${WORKDIR}/etc/ntpservers ${D}${palmtopdir}/etc
}

FILES_opie-systemtime_append = " /etc/ntpservers"
