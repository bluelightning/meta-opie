DESCRIPTION = "Tasks for OPIE stuff"
SECTION = "opie/base"
LICENSE = "MIT"
PR = "r3"

inherit packagegroup

LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

PACKAGES = "packagegroup-opie-applets packagegroup-opie-inputmethods packagegroup-opie-styles \
            packagegroup-opie-decorations packagegroup-opie-multimedia packagegroup-opie-wlan \
            packagegroup-opie-settings packagegroup-opie-pim packagegroup-opie-datebookplugins \
            packagegroup-opie-todayplugins"

#
# all OPIE stuff
#
RDEPENDS_packagegroup-opie-applets = "opie-aboutapplet opie-autorotateapplet opie-batteryapplet \
                     opie-bluetoothapplet opie-brightnessapplet \ 
                     opie-clipboardapplet opie-clockapplet opie-homeapplet \
                     opie-irdaapplet opie-lockapplet opie-logoutapplet \
                     opie-mailapplet opie-memoryapplet opie-multikeyapplet \
                     opie-networkapplet opie-notesapplet opie-cardapplet \
                     opie-pyquicklaunchapplet opie-restartapplet \
                     opie-restartapplet2 opie-rotateapplet \
                     opie-screenshotapplet opie-suspendapplet opie-vmemo \
                     opie-volumeapplet opie-vtapplet opie-zkbapplet \
                     "
RDEPENDS_packagegroup-opie-inputmethods = "opie-dvorak opie-handwriting \
                          opie-handwriting-classicset opie-jumpx opie-keyboard \
                          opie-keyview opie-kjumpx opie-multikey opie-unikeyboard"

RDEPENDS_packagegroup-opie-styles = "opie-style-flat opie-style-fresh opie-style-liquid opie-style-metal \
                    opie-style-web opie-style-phase opie-theme"

RDEPENDS_packagegroup-opie-decorations = "opie-deco-flat opie-deco-liquid opie-deco-polished"

RDEPENDS_packagegroup-opie-multimedia = "opie-mediaplayer1 \
                        ${@base_conditional('ENTERPRISE_DISTRO', '1', '', 'opie-mediaplayer1-libmadplugin', d)} \
                        opie-mediaplayer1-libmodplugin \
                        opie-mediaplayer1-libtremorplugin \
                        opie-mediaplayer1-libwavplugin \
                        opie-mediaplayer2 \
                        opie-mediaplayer2-skin-default \
                        opie-mediaplayer2-skin-default-landscape \
                        opie-mediaplayer2-skin-pod \
                        opie-mediaplayer2-skin-techno \
                        opie-powerchord opie-recorder opie-tonleiter"

RDEPENDS_packagegroup-opie-settings = "opie-appearance opie-aqpkg opie-backup opie-button-settings \
                      opie-citytime opie-confeditor opie-doctab \
                      opie-formatter opie-language opie-launcher-settings \
                      opie-light-and-power opie-mediummount opie-networksettings \
                      opie-packagemanager opie-security opie-sshkeys opie-sysinfo \
                      opie-systemtime opie-icon-reload opie-vmemo-settings"

RDEPENDS_packagegroup-opie-pim = "packagegroup-opie-base-pim packagegroup-opie-todayplugins packagegroup-opie-datebookplugins \
                 opie-mail opie-pimconverter"

RDEPENDS_packagegroup-opie-datebookplugins = "opie-datebook-birthdayplugin \
                            opie-datebook-chrisholidayplugin \
                            opie-datebook-nationalholidayplugin"

RDEPENDS_packagegroup-opie-todayplugins = "opie-today-addressbookplugin opie-today-datebookplugin \
                          opie-today-fortuneplugin opie-today-mailplugin \
                          opie-today-stocktickerplugin opie-today-todolistplugin \
                          opie-today-weatherplugin"

RDEPENDS_packagegroup-opie-wlan = "wireless-tools opie-wellenreiter opie-networksettings-wlanplugin"

