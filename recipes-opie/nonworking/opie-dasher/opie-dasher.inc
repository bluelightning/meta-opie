DESCRIPTION = "Dasher text input method"
SECTION = "opie/inputmethods"
LICENSE = "GPLv2"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
APPNAME = "qdasher"


S = "${WORKDIR}/dasher"

inherit opie

pkg_postinst() {
#!/bin/sh
if [ -n "$D" ]; then exit 1; fi
if pidof -s qpe >/dev/null; then
  /opt/QtPalmtop/bin/qcop QPE/TaskBar "reloadInputMethods()"
else
  exit 0
fi

}

pkg_postrm() {
#!/bin/sh
if [ -n "$D" ]; then exit 1; fi
/opt/QtPalmtop/bin/qcop QPE/TaskBar "reloadInputMethods()"
}

# FILES plugins/inputmethods/libqdasher.so* share/dasher/alphabet.xml
# FILES share/dasher/training_*.txt
do_install() {
	install -d ${D}${palmtopdir}/share/dasher/
	install -m 0644 ${WORKDIR}/share/dasher/alphabet.xml ${D}${palmtopdir}/share/dasher/
	for f in ${WORKDIR}/share/dasher/training_*.txt
	do
#		echo Installing Dasher Language $f
		[ -f $f ] && install -m 0644 $f ${D}${palmtopdir}/share/dasher/
	done
}

PACKAGES += " opie-dasher-english "

FILES_opie-dasher = "${palmtopdir}/plugins/inputmethods/libqdasher.so*"
FILES_opie-dasher-english = "${palmtopdir}/share/dasher/training_english_GB.txt"

