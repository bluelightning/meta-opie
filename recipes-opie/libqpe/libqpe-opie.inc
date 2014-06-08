DESCRIPTION = "Base library for the Qt/Embedded based palmtop environments"
HOMEPAGE = "http://www.trolltech.com"
AUTHOR = "The Trolls"
SECTION = "opie/libs"
LICENSE = "GPLv2"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
DEPENDS = "uicmoc-native virtual/libqte2 sysfsutils"
PROVIDES = "virtual/libqpe1"
INC_PR = "r11"
S = "${WORKDIR}/library"

inherit palmtop

python __anonymous() {
    # This doesn't need to be in this recipe specifically, but it's as good
    # a place as any since it has to be parsed if Opie is going to be built
    if not bb.data.getVar("OPIE_VERSION", d, True):
        bb.warn("OPIE_VERSION has not been set; if you are going to build Opie, you need to 'require' an appropriate .inc file from meta-opie/conf/distro/include")
}

OE_QMAKE_CXXFLAGS := "${@oe_filter_out('-fno-rtti', '${OE_QMAKE_CXXFLAGS}', d)}"
OE_QMAKE_CXXFLAGS += "-I${S}/include"
QMAKE_PROFILES = "library.pro"
EXTRA_QMAKEVARS_PRE += "CONFIG+=LIBQPE_WITHROHFEEDBACK"
EXTRA_QMAKEVARS_POST += "DESTDIR= DEFINES+=LIBQPE_NO_INLINE_IMAGES"

CXXFLAGS_append = " -frtti -DOPIE_NO_ERASE_RECT_HACKFIX -DOPIE_NEW_MALLOC"

do_compile() {
        TEMP_INCDIR=${S}/include/
        mkdir -p ${TEMP_INCDIR}/qpe \
                 ${TEMP_INCDIR}/qtopia \
                 ${TEMP_INCDIR}/opie \
                 ${TEMP_INCDIR}/opie2 \
                 ${TEMP_INCDIR}/qtopia/private
        for i in ${S}/*.h
        do
                install -m 0644 $i ${TEMP_INCDIR}/qpe/`basename $i`
                install -m 0644 $i ${TEMP_INCDIR}/qtopia/`basename $i`
                install -m 0644 $i ${TEMP_INCDIR}/qtopia/private/`basename $i`
        done
        for i in ${S}/backend/*.h
        do
                install -m 0644 $i ${TEMP_INCDIR}/qpe/`basename $i`
                install -m 0644 $i ${TEMP_INCDIR}/qtopia/`basename $i`
                install -m 0644 $i ${TEMP_INCDIR}/qtopia/private/`basename $i`
        done
        rm -f ${TEMP_INCDIR}/qtopia/*_p.h # remove private stuff out of qtopia
        oe_runmake
}

do_install() {
        oe_libinstall -so libqpe ${D}${libdir}

        install -d ${D}${includedir}/qpe \
               ${D}${includedir}/qtopia/private

        for i in ${S}/*.h
        do
                install -m 0644 $i ${D}${includedir}/qpe/`basename $i`
                install -m 0644 $i ${D}${includedir}/qtopia/`basename $i`
                install -m 0644 $i ${D}${includedir}/qtopia/private/`basename $i`
        done
        for i in ${S}/backend/*.h
        do
                install -m 0644 $i ${D}${includedir}/qpe/`basename $i`
                install -m 0644 $i ${D}${includedir}/qtopia/`basename $i`
                install -m 0644 $i ${D}${includedir}/qtopia/private/`basename $i`
        done
        rm -f ${D}${includedir}/qtopia/*_p.h # remove private stuff out of qtopia
}
