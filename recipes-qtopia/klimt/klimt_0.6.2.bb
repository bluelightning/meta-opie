DESCRIPTION = "Klimt is a software OpenGL rendering library for Qt/Embedded based Palmtop Environments"
SECTION = "opie/libs"
LICENSE = "GPL"

SRC_URI = "${SOURCEFORGE_MIRROR}/klimt/klimt-src-${PV}.zip"
do_unpack[depends] += "unzip-native:do_populate_sysroot"
S = "${WORKDIR}/klimt/build/LinuxQTE"

LIC_FILES_CHKSUM = "file://../../../LICENSE.GPL;md5=fdafc691aa5fb7f8e2a9e9521fef771b \
                    file://../../src/klMain.cpp;beginline=11;endline=22;md5=9e4ee606ac0def9411d0134aab33c8f4"


EXTRA_QMAKEVARS_POST += " QMAKE_CXXFLAGS+=-fpermissive"

inherit opie

do_install() {
	oe_libinstall -so libKlimt ${D}${palmtopdir}/lib
	cp -pPR ${S}/../../include/* ${D}${palmtopdir}/include
}
SRC_URI[md5sum] = "78e39bf91d9f1df0b996b4fb19216883"
SRC_URI[sha256sum] = "52611d3b99f1031c241f9728ccd207ab661946e4c4204b9610373cfff87a2475"

