DESCRIPTION = "Volume applet"
SECTION = "opie/applets"
LICENSE = "GPLv2"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
APPNAME = "volumeapplet"


S = "${WORKDIR}/${APPNAME}"

inherit opie

pkg_postinst_${PN}() {
#!/bin/sh
if [ -n "$D" ]; then exit 1; fi
if pidof -s qpe >/dev/null; then
  ${bindir}/qcop QPE/TaskBar "reloadApplets()"
fi
}

pkg_postrm_${PN}() {
#!/bin/sh
${bindir}/qcop QPE/TaskBar "reloadApplets()"
 if [ -n "$D" ]; then false; fi
}

# FILES plugins/applets/libvolumeapplet.so*
do_install() {
}

