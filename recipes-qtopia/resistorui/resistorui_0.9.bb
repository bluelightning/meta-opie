DESCRIPTION = "A tool to calculate Ohm resistor values"
SECTION = "opie/applications"
LICENSE = "GPLv2"
HOMEPAGE = "http://www.pellicosystems.com/zaurus/applications/index.html"
APPNAME = "resistorUI"
APPTYPE = "binary"
APPDESKTOP = "${S}"
PR = "r1"

SRC_URI = "http://www.pellicosystems.com/zaurus/applications/resistorUI_1.5.0-0.9_armSRC.zip"
S = "${WORKDIR}/ResistorUI"

LIC_FILES_CHKSUM = "file://mainwin.ui;beginline=8;endline=16;md5=16eb84e98dce724b78e7abc8457c06a2"

inherit opie

do_install () {
	install -d ${D}${palmtopdir}/pics/
	install -m 0644 resistorUI.png ${D}${palmtopdir}/pics/

}

SRC_URI[md5sum] = "3ef812023466905883a19a22ead8615c"
SRC_URI[sha256sum] = "467910e5f6b6e137db93a1ccaf668d4146c3dd27dfa0f368b2a20a0a14a23592"
