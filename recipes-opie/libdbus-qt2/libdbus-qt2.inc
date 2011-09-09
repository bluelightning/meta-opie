DESCRIPTION = "Qt/Embedded 2.x D-Bus bindings"
SECTION = "opie/libs"
DEPENDS = "virtual/libqte2 dbus"
LICENSE = "AFL-2 | GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=e87638276ebede5c3fd39c39e09df2db \
                    file://COPYING.AFL;md5=ff3ca8d67fd7be53acb2a88e1e8a99ba \
                    file://COPYING.GPL;md5=5c213a7de3f013310bd272cdb6eb7a24"

S = "${WORKDIR}/${PN}"

inherit palmtop

EXTRA_QMAKEVARS_POST += "DESTDIR= "

do_configure_prepend() {
    sed -i 's!.*$(OPIEDIR)/include.pro.*!!' libdbus-qt2.pro
}

do_install() {
    oe_libinstall -so libdbus-qt2 ${D}${libdir}
    install -d ${D}${includedir}/dbus/
    install -m 0644 dbus/*.h ${D}${includedir}/dbus/
}
