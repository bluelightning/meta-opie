DESCRIPTION = "A Qtopia/Opie Input Method plugin for the Flexis FX100 Keyboard."
SECTION = "opie/inputmethods"
LICENSE = "GPLv2+"
PR = "r1"

SRC_URI = "http://sources.openembedded.org/flexis-zaurus-${PV}.tar.bz2"
S = "${WORKDIR}/flexis-zaurus"

LIC_FILES_CHKSUM = "file://COPYING;md5=7d6c006a4b4407c6ca5cd5e78b6e62bc \
                    file://flexisinput.cpp;beginline=6;endline=18;md5=88d7aab223ecb253e1c6613b3682a024"

inherit palmtop

EXTRA_QMAKEVARS_POST += "CONFIG-=qtopia"

do_install() {
	oe_libinstall libqflexis ${D}${palmtopdir}/plugins/inputmethods/
}

SRC_URI[md5sum] = "e7737236f1eccadd4cf8cfcc0c82e005"
SRC_URI[sha256sum] = "ca7653a03f562057098c9fb956de34021a14017c2a44eedd3ab0963dc877e7e5"
