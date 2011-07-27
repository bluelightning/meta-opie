DESCRIPTION = "Pickboard input method"
SECTION = "opie/inputmethods"
PRIORITY = "optional"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
APPNAME = "qpickboard"

S = "${WORKDIR}/pickboard"

inherit opie

pkg_postinst() {
#!/bin/sh
if [ -n "$D" ]; then exit 1; fi
if pidof -s qpe >/dev/null; then
  ${bindir}/qcop QPE/TaskBar "reloadApplets()"
else
  exit 0
fi
}

pkg_postrm() {
#!/bin/sh
if [ -n "$D" ]; then exit 1; fi
${bindir}/qcop QPE/TaskBar "reloadInputMethods()"
}


do_install() {
        install -d ${D}${libdir}/
        install -d ${D}${includedir}/
        install -m 0755 libqpickboard.so ${D}${libdir}/
        install pickboardcfg.h ${D}${includedir}/
        install pickboardpicks.h ${D}${includedir}/
}

# FILES plugins/inputmethods/libqpickboard.so*
