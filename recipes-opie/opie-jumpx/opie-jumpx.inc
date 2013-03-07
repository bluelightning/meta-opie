DESCRIPTION = "JumpX input method"
SECTION = "opie/inputmethods"
LICENSE = "GPLv2"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
APPNAME = "qjumpx"


S = "${WORKDIR}/jumpx"

inherit opie

pkg_postinst_${PN}() {
#!/bin/sh
if [ -n "$D" ]; then exit 1; fi
if pidof -s qpe >/dev/null; then
  /usr/bin/qcop QPE/TaskBar "reloadInputMethods()"
else
  exit 0
fi

}

pkg_postrm_${PN}() {
#!/bin/sh
if [ -n "$D" ]; then exit 1; fi
/usr/bin/qcop QPE/TaskBar "reloadInputMethods()"
}

# FILES plugins/inputmethods/libqjumpx.so* pics/jumpx
do_install() {
	install -d ${D}${palmtopdir}/pics/jumpx/
	install -m 0644 ${WORKDIR}/pics/jumpx/*.png ${D}${palmtopdir}/pics/jumpx/
}

