SUMMARY = "Machine-specific images for System Info"
# Dummy section so we don't get app symlink
SECTION = "opie/base"
LICENSE = "GPLv2"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
APPNAME = "sysinfo"

S = "${WORKDIR}/pics"

inherit opie

do_configure() {
	:
}

MACHINEPIC = "${MACHINE}"
MACHINEPIC_h3600 = "ipaq3600"
MACHINEPIC_h3800 = "ipaqh3800h3900"
MACHINEPIC_h3900 = "ipaqh3800h3900"
MACHINEPIC_h4000 = "ipaqh4100"
MACHINEPIC_h2200 = "ipaqh2200"
MACHINEPIC_h1910 = "ipaqh1900"
MACHINEPIC_h1940 = "ipaqh1900"
MACHINEPIC_rx1950 = "ipaqh4100"
MACHINEPIC_hx4700 = "ipaqhx4700"
MACHINEPIC_h5000 = "ipaqh5000"
MACHINEPIC_akita = "zaurusc700"
MACHINEPIC_c7x0 = "zaurusc700"
MACHINEPIC_spitz = "zaurusc700"
MACHINEPIC_collie = "zaurus5500"
MACHINEPIC_poodle = "zaurus5500"
MACHINEPIC_jornada6xx = "jornada720"
MACHINEPIC_jornada7xx = "jornada720"

do_install() {
	install -d ${D}${palmtopdir}/pics/${APPNAME}/
	if [ -f "${WORKDIR}/pics/${APPNAME}/${MACHINEPIC}.png" ] ; then
		install -m 0644 ${WORKDIR}/pics/${APPNAME}/${MACHINEPIC}.png ${D}${palmtopdir}/pics/${APPNAME}/
	fi
}

PACKAGES = "${PN}"
PACKAGE_ARCH = "${MACHINE_ARCH}"

