DESCRIPTION = "Multiple language keyboard"
SECTION = "opie/inputmethods"
LICENSE = "GPLv2"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
DEPENDS = "libqtaux2 opie-pickboard"
RDEPENDS_${PN} = "opie-pics opie-pickboard"
RRECOMMENDS_${PN} = "opie-multikeyapplet"
APPNAME = "qmultikey"

S = "${WORKDIR}/multikey"

inherit opie

pkg_postinst() {
#!/bin/sh
if [ -n "$D" ]; then exit 1; fi
if pidof -s qpe >/dev/null; then
  ${bindir}/qcop QPE/TaskBar "reloadInputMethods()"
else
  exit 0
fi
}

pkg_postrm() {
#!/bin/sh
if [ -n "$D" ]; then exit 1; fi
${bindir}/qcop QPE/TaskBar "reloadInputMethods()"
}

# FILES plugins/inputmethods/libqmultikey.so* share/multikey/*

SRC_URI_append = " file://ru.keymap"

do_install() {
	install -d ${D}${palmtopdir}/share/multikey/
	install -m 0644 ${WORKDIR}/share/multikey/*.keymap ${D}${palmtopdir}/share/multikey/
	install -m 0644 ${WORKDIR}/share/multikey/README ${D}${palmtopdir}/share/multikey/
	install -m 0644 ${WORKDIR}/ru.keymap ${D}${palmtopdir}/share/multikey/
}

