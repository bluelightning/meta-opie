DESCRIPTION = "Zauralign - a game for one player. The player has to align pieces to remove them from the \
board fighting against new pieces which appear after each move."
SECTION = "opie/games"
LICENSE = "GPLv2+"

PR = "r1"

SRC_URI = "http://sources.openembedded.org/zauralign-${PV}.tar.gz"
S = "${WORKDIR}/zauralign"

inherit palmtop

LIC_FILES_CHKSUM = "file://LICENSE;md5=4c4bc67b93b226b9295ca016dfed1b7c \
                    file://main.cpp;beginline=1;endline=10;md5=c6c2cad0797b7930358ca67868b3305d"

TARGET_CFLAGS += "-DNO_DEBUG"
export OE_QMAKE_LINK="${CXX}"

do_install() {
        install -d ${D}${palmtopdir}/apps/Games \
        	   ${D}${palmtopdir}/pics/zauralign \
        	   ${D}${palmtopdir}/bin
        install -m 0755 zauralign ${D}${palmtopdir}/bin/
	install -m 0644 zauralign.png ${D}${palmtopdir}/pics/
	install -m 0644 zauralign.desktop ${D}${palmtopdir}/apps/Games/
	cp -pPR pics/* ${D}${palmtopdir}/pics/zauralign/
}

SRC_URI[md5sum] = "c159a55ecc3ba800445d4bb73d0925e6"
SRC_URI[sha256sum] = "f849da3eec59b22599a806d59e81729ba9234fc2318335804d45d9dce23fb532"
