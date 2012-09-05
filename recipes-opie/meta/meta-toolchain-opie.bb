PR = "r3"
TOOLCHAIN_HOST_TASK = "nativesdk-packagegroup-opie-toolchain-host packagegroup-cross-canadian-${TRANSLATED_TARGET_ARCH}"
TOOLCHAIN_TARGET_TASK = "packagegroup-opie-toolchain-target"
TOOLCHAIN_OUTPUTNAME = "${SDK_NAME}-toolchain-opie-${DISTRO_VERSION}"

require recipes-core/meta/meta-toolchain.bb

QT_TOOLS_PREFIX = "${SDKPATHNATIVE}${bindir_nativesdk}"

toolchain_create_sdk_env_script_append() {

    echo 'export OE_QMAKE_CC=${TARGET_PREFIX}gcc' >> $script
    echo 'export OE_QMAKE_CFLAGS="-DQWS $CFLAGS"' >> $script
    echo 'export OE_QMAKE_CXX=${TARGET_PREFIX}g++' >> $script
    echo 'export OE_QMAKE_LDFLAGS="$LDFLAGS"' >> $script
    echo 'export OE_QMAKE_AR=${TARGET_PREFIX}ar' >> $script
    echo 'export OE_QMAKE_STRIP="echo"' >> $script
    echo 'export OE_QMAKE_UIC=${QT_TOOLS_PREFIX}/uic2' >> $script
    echo 'export OE_QMAKE_MOC=${QT_TOOLS_PREFIX}/moc2' >> $script
    echo 'export OE_QMAKE_CXXFLAGS="-fno-exceptions -fno-rtti -DQWS $CXXFLAGS"' >> $script
    echo 'export OE_QMAKE_LINK="${TARGET_PREFIX}g++"' >> $script
    echo 'export OE_QMAKE_INCDIR_QT="${SDKTARGETSYSROOT}${includedir}/qte"' >> $script
    echo 'export OE_QMAKE_LIBDIR_QT="${SDKTARGETSYSROOT}${libdir}"' >> $script
    echo 'export OE_QMAKE_LIBS_QT="qte"' >> $script
    echo 'export OE_QMAKE_LIBS_X11=""' >> $script

    echo 'export QMAKESPEC=${SDKPATHNATIVE}${datadir}/qmake/linux-oe-g++' >> $script
}
