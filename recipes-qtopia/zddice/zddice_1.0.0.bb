DESCRIPTION = "Zaurus D20 Gaming Dice for Qt/Embedded based Palmtop Environments"
SECTION = "opie/games"
LICENSE = "GPLv2"
PR = "r1"

SRC_URI = "http://www.cinlug.org/modules/Static_Docs/data/db/zddice/zddice_${PV}_arm.src.tar.gz \
           file://qtopia17.patch"
S = "${WORKDIR}/zddice-src"

LIC_FILES_CHKSUM = "file://GPL.txt;md5=1cfa72ff66994450fc8e5e3a4dd3200d \
                    file://zddice.cpp;beginline=1;endline=2;md5=5e4c092679908c60a9c2282f7d71012c "

inherit palmtop

EXTRA_QMAKEVARS_POST += 'TMAKE_LIBS-="-luuid" TMAKE_LIBS+="-lqpe" CONFIG+=qt CONFIG-=qtopia'

do_install() {
	install -d ${D}${palmtopdir}/{bin,pics,apps/Games}
        install -m 0755 zddice ${D}${palmtopdir}/bin/
	install -m 0644 images/zddice.png ${D}${palmtopdir}/pics/
	install -m 0644 zddice.desktop ${D}${palmtopdir}/apps/Games/
}

SRC_URI[md5sum] = "791e8986c6e16dcd1c9878126725e06b"
SRC_URI[sha256sum] = "eba57692dadd21df8d4afaea4daf8db5179c7398e11cd019fd462aa6947f4119"
