DESCRIPTION = "Bluetooth daemon for Opie"
SECTION = "opie/base"
LICENSE = "GPLv2"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
APPNAME = "opiebluetoothd"

S = "${WORKDIR}/opiebluetoothd"

inherit opie

do_install() {
    # Section is "base" so this has to be done manually
    install -d ${D}${bindir}
    install -m 0755 ${S}/opiebluetoothd ${D}${bindir}/opiebluetoothd
}

