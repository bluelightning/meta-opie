DESCRIPTION = "Tasks for xqtlauncher stuff"
SECTION = "opie/base"
LICENSE = "MIT"
PR = "r1"

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

