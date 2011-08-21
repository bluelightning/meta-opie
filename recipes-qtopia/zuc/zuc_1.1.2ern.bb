DESCRIPTION = "A Unit Conversion Tool"
SECTION = "opie/applications"
LICENSE = "GPLv2+"
APPTYPE = "binary"
APPNAME = "zuc"
APPDESKTOP = "${S}"
PR = "r4"

SRC_URI = "http://sources.openembedded.org/zuc_V${PV}.tar.gz;name=archive \
           http://nick.kreucher.net/zuc/zuc_units;name=units \
           file://fixed-include.patch"

S = "${WORKDIR}/zuc_V${PV}"

LIC_FILES_CHKSUM = "file://COPYING;md5=393a5ca445f6965873eca0259a17f833 \
                    file://zuc.cpp;beginline=7;endline=19;md5=3e5b2ee42c18a2c66e6674de61dfa7bd"

inherit opie

export OE_QMAKE_LINK="${CXX}"

do_configure_append() {
	echo "#define VERSION \""${PV}"\"" > version.h
	echo "#define BUILDTIME \""`date +%Y%m%d%H%M`"\"" >> version.h
}

do_install() {
	install -d ${D}${palmtopdir}/pics/
        install -m 0644 *.png ${D}${palmtopdir}/pics/
	install -d ${D}${palmtopdir}/etc/
	install -m 0644 ${WORKDIR}/zuc_units ${D}${palmtopdir}/etc/
}

SRC_URI[archive.md5sum] = "c4ed24fa825940f4803bd494fd9c12a6"
SRC_URI[archive.sha256sum] = "8e7d8d05bcc99203f4ca8231647b2a24d51b10abffeb00910cb6eeee85427f86"
SRC_URI[units.md5sum] = "0d4a28c847829208b0177483e174b3f5"
SRC_URI[units.sha256sum] = "3bc5735516b47874208b0efe23d498b8d43e51a140b3ff60683d5f1a951f50ac"
