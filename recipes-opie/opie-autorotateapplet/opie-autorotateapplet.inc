DESCRIPTION = "Applet to disable the automatic screen rotation on Zaurus C-models"
SECTION = "opie/applets"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
APPNAME = "autorotateapplet"


S = "${WORKDIR}/${APPNAME}"

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
${bindir}/qcop QPE/TaskBar "reloadApplets()"
}

# FILES plugins/applets/libautorotateapplet.so* pics/autorotate/*.png
do_install() {
	install -d ${D}${palmtopdir}/pics/autorotate/
	install -m 0655 ${WORKDIR}/pics/autorotate/*.png ${D}${palmtopdir}/pics/autorotate/
}
