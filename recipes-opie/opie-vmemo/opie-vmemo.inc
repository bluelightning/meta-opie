DESCRIPTION = "Voice Memo Recorder Applet"
SECTION = "opie/applets"
LICENSE = "LGPLv2"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
RDEPENDS_${PN} = "opie-vmemo-settings"
I18N_FILES = "libvmemoapplet.ts"
APPNAME = "vmemoapplet"


S = "${WORKDIR}/vmemo"

inherit opie

pkg_postinst() {
#!/bin/sh
if pidof -s qpe >/dev/null; then
  /usr/bin/qcop QPE/TaskBar "reloadApplets()"
fi
 if [ -n "$D" ]; then exit 1; fi
}

pkg_postrm() {
#!/bin/sh
/usr/bin/qcop QPE/TaskBar "reloadApplets()"
 if [ -n "$D" ]; then exit 1; fi
}

# FILES plugins/applets/libvmemoapplet.so*
do_install() {
}

