DESCRIPTION = "Kpacman, the classical arcade game of Pacman"
SECTION = "opie/games"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
APPNAME = "kpacman"


S = "${WORKDIR}/${APPNAME}"

inherit opie

pkg_postinst() {
#!/bin/sh
if [ -n "$D" ]; then exit 1; fi

if [ ! -f $HOME/Settings/kpacman.conf ]
    exit 0
then
    cp /opt/QtPalmtop/share/kpacman/kpacman.conf $HOME/Settings/
fi
}

# FILES bin/kpacman apps/Games/kpacman.desktop pics/kpacman/kpacman.png share/kpacman
do_install() {
        install -d ${D}${palmtopdir}/pics/${APPNAME}/
        install -m 0644 ${WORKDIR}/pics/${APPNAME}/*.png ${D}${palmtopdir}/pics/${APPNAME}/
        install -d ${D}${palmtopdir}/share/${APPNAME}/fonts
        install -d ${D}${palmtopdir}/share/${APPNAME}/pics
        install -m 0644 ${WORKDIR}/share/${APPNAME}/*.conf ${D}${palmtopdir}/share/${APPNAME}/
        install -m 0644 ${WORKDIR}/share/${APPNAME}/fonts/*.xbm ${D}${palmtopdir}/share/${APPNAME}/fonts/
        install -m 0644 ${WORKDIR}/share/${APPNAME}/pics/*.xpm ${D}${palmtopdir}/share/${APPNAME}/pics/
}

