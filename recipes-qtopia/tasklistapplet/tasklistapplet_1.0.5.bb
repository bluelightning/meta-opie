DESCRIPTION = "TaskList Applet"
SECTION = "opie/applets"
LICENSE = "GPLv2+"
HOMEPAGE = "http://sourceforge.net/projects/subapplet/"

PR = "r1"

SRC_URI = "${SOURCEFORGE_MIRROR}/subapplet/tasklist-105.tar.gz"

S = "${WORKDIR}/TaskList-1.0.5"

LIC_FILES_CHKSUM = "file://LICENSE;md5=393a5ca445f6965873eca0259a17f833 \
                    file://tasklistappletimpl.cpp;beginline=6;endline=18;md5=31e6c1441632f6ca6a025a94331158a2"

inherit palmtop

#QMAKE_PROFILES = "subapplet.pro"

do_install() {
    install -d ${D}${palmtopdir}/plugins/applets ${D}${palmtopdir}/pics/tasklist/
    install -m 0644 icons/*.png ${D}${palmtopdir}/pics/tasklist/
    oe_libinstall -so -C rel/opt/Qtopia/plugins/applets libtasklistapplet ${D}${palmtopdir}/plugins/applets/
}

pkg_postinst() {
#!/bin/sh
if pidof -s qpe >/dev/null; then
  /usr/bin/qcop QPE/TaskBar "reloadApplets()"
else
  exit 0
fi
 if [ -n "$D" ]; then false; fi
}

pkg_postrm() {
#!/bin/sh
/usr/bin/qcop QPE/TaskBar "reloadApplets()"
 if [ -n "$D" ]; then false; fi
}

SRC_URI[md5sum] = "dc62a061d83cf72d1eca7e8ae2c8e1a6"
SRC_URI[sha256sum] = "4078c44beebfd298995983b9e2ea189167a1ab081d96a7c485a67b65a974e878"
