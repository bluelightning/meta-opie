DESCRIPTION = "Qt/Embedded bindings for the Scintilla source code editor component"
SECTION = "opie/libs"
LICENSE = "GPLv2"
PR = "r1"

SRC_URI = "http://www.mneuroth.de/privat/zaurus/qscintilla-${PV}_zaurus.tar.gz \
           file://no-external-lexers.patch;patchdir=..;striplevel=0"

S = "${WORKDIR}/qscintilla-${PV}/qt"

LIC_FILES_CHKSUM = "file://../LICENSE;md5=cbbd794e2a0a289b9dfcc9f513d1996e \
                    file://ScintillaQt.cpp;beginline=8;endline=20;md5=c90be97c814ae9c8f916f058622079d5"

inherit opie

QMAKE_PROFILES = "qscintilla.pro"

EXTRA_QMAKEVARS_POST += "INCLUDEPATH+=${S}/patches \
                         DEFINES+=ZPATCH DEFINES+=ZAURUS \
			 HEADERS-=qextscintillaprinter.h \
			 SOURCES-=qextscintillaprinter.cpp \
			 SOURCES+=patches/qsettings.cpp \
			 SOURCES+=patches/qsettings_unix.cpp \
			 HEADERS+=patches/qsettings.h"

PARALLEL_MAKE = ""

do_install() {
	install -d ${D}${libdir} ${D}${includedir}
	oe_libinstall -so libqscintilla ${D}${libdir}
	install -m 0644 qextscintilla*.h ${D}${includedir}/
}

FILES_${PN} = "${libdir}"

SRC_URI[md5sum] = "999d3a8b916cd1ef13a66843f6f26db7"
SRC_URI[sha256sum] = "e828dc4aaa7948eafee343e70190dd8003498d50d9258d75d47f05f9970683db"
