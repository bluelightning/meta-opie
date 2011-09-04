DESCRIPTION = "Clock applet"
SECTION = "opie/applets"
LICENSE = "GPLv2"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
APPNAME = "clockapplet"


S = "${WORKDIR}/${APPNAME}"

inherit opie

pkg_postinst() {
#!/bin/sh
if [ -n "$D" ]; then exit 1; fi
if pidof -s qpe >/dev/null; then
  ${bindir}/qcop QPE/TaskBar "reloadApplets()"
fi
}

pkg_postrm() {
#!/bin/sh
${bindir}/qcop QPE/TaskBar "reloadApplets()"
 if [ -n "$D" ]; then false; fi
}

# FILES plugins/applets/libclockapplet.so*
do_install() {
}

# FILES plugins/applets/libclockapplet.so* pics/clockapplet/*.png
do_install() {
        install -d ${D}${palmtopdir}/pics/clockapplet/
        install -m 0644 ${WORKDIR}/pics/clockapplet/*.png ${D}${palmtopdir}/pics/clockapplet/
}

