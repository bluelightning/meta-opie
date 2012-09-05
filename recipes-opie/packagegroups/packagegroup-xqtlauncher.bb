DESCRIPTION = "Tasks for xqtlauncher stuff"
SECTION = "opie/base"
LICENSE = "MIT"
PR = "r2"

inherit packagegroup

LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

PACKAGES = "packagegroup-xqtlauncher packagegroup-xqtlauncher-blackbox"

#xkbd is currently needed becuse of a bug at xqt2
RDEPENDS_packagegroup-xqtlauncher = "xqtlauncher \
                                                   xkbd \
                                                   "

#
# xqtlauncher with blackbox as wm
#

RDEPENDS_packagegroup-xqtlauncher-blackbox = "xqtlauncher-blackbox-config \
                                     "
python __anonymous() {
    # For backwards compatibility after rename
    packages = d.getVar("PACKAGES", True).split()
    for pkg in packages:
        d.appendVar("RPROVIDES_%s" % pkg, pkg.replace("packagegroup-", "task-"))
        d.appendVar("RREPLACES_%s" % pkg, pkg.replace("packagegroup-", "task-"))
        d.appendVar("RCONFLICTS_%s" % pkg, pkg.replace("packagegroup-", "task-"))
}

