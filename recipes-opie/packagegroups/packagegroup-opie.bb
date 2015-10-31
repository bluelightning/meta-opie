DESCRIPTION = "Tasks for OPIE stuff"
SECTION = "opie/base"
LICENSE = "MIT"

PR = "r18"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

PROVIDES = "packagegroup-opie-everything"

PACKAGES = "packagegroup-opie-base \
            packagegroup-opie-base-applets packagegroup-opie-base-apps \
            packagegroup-opie-base-decorations packagegroup-opie-base-inputmethods \
            packagegroup-opie-base-pim packagegroup-opie-base-settings \
            packagegroup-opie-base-styles packagegroup-opie-base-todayplugins \
            packagegroup-opie-extra-settings \
            packagegroup-opie-extra-styles \
  ${@base_contains("COMBINED_FEATURES", "bluetooth", "packagegroup-opie-bluetooth", "",d)} \
  ${@base_contains("COMBINED_FEATURES", "irda", "packagegroup-opie-irda", "",d)} \
           "

RDEPENDS_packagegroup-opie-everything := "${PACKAGES}"

PACKAGES += "packagegroup-opie-everything"

#
# Dependencies to get the launcher up and running
#
RDEPENDS_packagegroup-opie-base = "opie-init opie-alarm opie-qcop opie-qss opie-quicklauncher \
                           opie-taskbar opie-pics opie-sounds opie-freetype \
                           ttf-dejavu-sans ttf-dejavu-sans-mono"
MACHINE_DISPLAY_WIDTH_PIXELS ?= "240"
MACHINE_DISPLAY_HEIGHT_PIXELS ?= "320"
# Recommend both landscape and portrait backgrounds
RRECOMMENDS_packagegroup-opie-base = "opie-taskbar-images-${MACHINE_DISPLAY_WIDTH_PIXELS}x${MACHINE_DISPLAY_HEIGHT_PIXELS} \
                              opie-taskbar-images-${MACHINE_DISPLAY_HEIGHT_PIXELS}x${MACHINE_DISPLAY_WIDTH_PIXELS}"

#
# things for reasonable bootstrap image
#
RDEPENDS_packagegroup-opie-base-applets = "opie-aboutapplet opie-clockapplet opie-suspendapplet \
                                   opie-homeapplet opie-rotateapplet \
		                   opie-brightnessapplet opie-volumeapplet \
                                   opie-screenshotapplet \
    ${@base_contains("COMBINED_FEATURES", "irda", "opie-irdaapplet", "",d)} \
    ${@base_contains("MACHINE_FEATURES", "apm", "opie-batteryapplet", "",d)} \
    ${@base_contains("COMBINED_FEATURES", "pcmcia", "opie-cardapplet", "",d)} \
    ${@base_contains("MACHINE_FEATURES", "keyboard", "opie-vtapplet opie-logoutapplet", "",d)}"

#
# clamshell models can benefit from the autorotate applet
#
RDEPENDS_packagegroup-opie-base-applets_append_c7x0   = " opie-autorotateapplet"
RDEPENDS_packagegroup-opie-base-applets_append_spitz  = " opie-autorotateapplet"
RDEPENDS_packagegroup-opie-base-applets_append_akita  = " opie-autorotateapplet"

RDEPENDS_packagegroup-opie-base-inputmethods = "opie-multikey opie-handwriting opie-handwriting-classicset"

RDEPENDS_packagegroup-opie-base-apps = "opie-console opie-clock opie-citytime opie-backup opie-sysinfo \
                       opie-advancedfm opie-textedit"

# FIXME opie-packagemanager should be here but doesn't build at the moment
RDEPENDS_packagegroup-opie-base-settings = "opie-light-and-power opie-appearance \
                           opie-systemtime opie-networksettings opie-button-settings \
                           opie-icon-reload opie-launcher-settings opie-security \
                           opie-securityplugin-pin"

#
# That settings can be removed and device will be still usable
#
RDEPENDS_packagegroup-opie-extra-settings = "opie-language opie-doctab opie-mediummount \
    ${@base_contains("DISTRO_FEATURES", "wifi", "opie-networksettings-wlanplugin", "",d)} \
    ${@base_contains("DISTRO_FEATURES", "ppp", "opie-networksettings-pppplugin", "",d)} \
			    "

RDEPENDS_packagegroup-opie-base-decorations = "opie-deco-flat opie-deco-liquid opie-deco-polished"

RDEPENDS_packagegroup-opie-base-styles = "opie-style-flat opie-style-fresh opie-style-web opie-style-phase"

#
# Those styles are big and does not look good on QVGA screen
#
RDEPENDS_packagegroup-opie-extra-styles = "opie-style-liquid opie-style-metal"

RDEPENDS_packagegroup-opie-base-todayplugins = "opie-today-addressbookplugin opie-today-datebookplugin \
                               opie-today-todolistplugin"

RDEPENDS_packagegroup-opie-base-pim = "opie-addressbook opie-datebook opie-drawpad \
                      opie-search opie-notes opie-today opie-todo \
                      packagegroup-opie-base-todayplugins \
                      opie-datebook-birthdayplugin"

BLUEZ = "${@bb.utils.contains('DISTRO_FEATURES','bluez5','bluez5','bluez4',d)}"
RDEPENDS_packagegroup-opie-bluetooth = "${BLUEZ} obexftp obexpush libopieobex0 \
                       opie-bluetoothmanager opie-bluetoothapplet"

RDEPENDS_packagegroup-opie-irda = "irda-utils libopieobex0 obexftp obexpush"

python __anonymous() {
    # For backwards compatibility after rename
    packages = d.getVar("PACKAGES", True).split()
    for pkg in packages:
        d.appendVar("RPROVIDES_%s" % pkg, pkg.replace("packagegroup-", "task-"))
        d.appendVar("RREPLACES_%s" % pkg, pkg.replace("packagegroup-", "task-"))
        d.appendVar("RCONFLICTS_%s" % pkg, pkg.replace("packagegroup-", "task-"))
}

