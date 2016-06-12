DESCRIPTION = "Tasks for small OPIE image"
SECTION = "opie/base"
LICENSE = "MIT"
PR = "r7"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

PACKAGES = "packagegroup-opie-16mb-base \
            packagegroup-opie-16mb-applets \
            packagegroup-opie-16mb-inputmethods \
            packagegroup-opie-16mb-settings \
            packagegroup-opie-16mb-apps \
            packagegroup-opie-16mb-pim \
           "

#
# Dependencies to get the launcher up and running
#
RDEPENDS_packagegroup-opie-16mb-base = "opie-init opie-alarm opie-qcop opie-qss opie-quicklauncher \
                           opie-taskbar opie-pics opie-sounds opie-freetype opie-taskbar-images-240x320 \
                           ttf-dejavu-sans ttf-dejavu-sans-mono"

#
# things for reasonable bootstrap image
#
RDEPENDS_packagegroup-opie-16mb-applets = "opie-aboutapplet opie-clockapplet opie-suspendapplet \
                                   opie-homeapplet opie-rotateapplet \
		                   opie-brightnessapplet opie-volumeapplet \
                                   opie-screenshotapplet \
    ${@bb.utils.contains("COMBINED_FEATURES", "irda", "opie-irdaapplet", "",d)} \
    ${@bb.utils.contains("MACHINE_FEATURES", "apm", "opie-batteryapplet", "",d)} \
    ${@bb.utils.contains("COMBINED_FEATURES", "pcmcia", "opie-cardapplet", "",d)} \
    ${@bb.utils.contains("MACHINE_FEATURES", "keyboard", "opie-vtapplet opie-logoutapplet", "",d)}"

#
# clamshell models can benefit from the autorotate applet
#
RDEPENDS_packagegroup-opie-16mb-applets_append_c7x0   = " opie-autorotateapplet"
RDEPENDS_packagegroup-opie-16mb-applets_append_spitz  = " opie-autorotateapplet"
RDEPENDS_packagegroup-opie-16mb-applets_append_akita  = " opie-autorotateapplet"

RDEPENDS_packagegroup-opie-16mb-inputmethods = "opie-multikey"

# FIXME opie-packagemanager should be here but it doesn't build at the moment
RDEPENDS_packagegroup-opie-16mb-settings = "opie-light-and-power opie-appearance \
                           opie-systemtime opie-networksettings opie-button-settings \
                           opie-icon-reload opie-launcher-settings opie-security \
                           opie-securityplugin-pin"

RDEPENDS_packagegroup-opie-16mb-apps = "opie-console opie-clock opie-backup opie-sysinfo \
                       opie-advancedfm"

RDEPENDS_packagegroup-opie-16mb-pim = "opie-addressbook opie-datebook opie-drawpad \
                      opie-search opie-textedit opie-today opie-todo"


python __anonymous() {
    # For backwards compatibility after rename
    packages = d.getVar("PACKAGES", True).split()
    for pkg in packages:
        d.appendVar("RPROVIDES_%s" % pkg, pkg.replace("packagegroup-", "task-"))
        d.appendVar("RREPLACES_%s" % pkg, pkg.replace("packagegroup-", "task-"))
        d.appendVar("RCONFLICTS_%s" % pkg, pkg.replace("packagegroup-", "task-"))
}

