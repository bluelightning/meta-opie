DESCRIPTION = "Set the system time - utilizing ntpdate, if available."
SECTION = "opie/settings"
LICENSE = "LGPLv2+"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/LGPL-2.0;md5=03f2b9deed35802bc1aae2ae3dc6d9ed"
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
