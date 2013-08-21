inherit qmake_base

DEPENDS_prepend = "qmake-native "

export QMAKESPEC
export OE_QMAKE_UIC="${STAGING_BINDIR_NATIVE}/uic2"
export OE_QMAKE_MOC="${STAGING_BINDIR_NATIVE}/moc2"
export OE_QMAKE_QMAKE="${STAGING_BINDIR_NATIVE}/qmake"
export OE_QMAKE_CXXFLAGS="-fno-exceptions -fno-rtti ${CXXFLAGS}"
export OE_QMAKE_LINK="${CCLD}"
export OE_QMAKE_INCDIR_QT="${STAGING_INCDIR}/qte"
export OE_QMAKE_LIBDIR_QT="${STAGING_LIBDIR}"
export OE_QMAKE_LIBS_QT="qte"
export OE_QMAKE_LIBS_X11=""
export OE_QMAKE_LCONVERT = "doesnotexist"
export OE_QMAKE_LRELEASE = "${STAGING_BINDIR_NATIVE}/lrelease"
export OE_QMAKE_LUPDATE = "${STAGING_BINDIR_NATIVE}/lupdate"
export OE_QMAKE_XMLPATTERNS = "doesnotexist"

