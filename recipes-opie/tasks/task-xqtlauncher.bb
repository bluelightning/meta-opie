DESCRIPTION = "Tasks for xqtlauncher stuff"
SECTION = "opie/base"
LICENSE = "MIT"
PR = "r1"

inherit task

LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

PACKAGES = "task-xqtlauncher task-xqtlauncher-blackbox"

#xkbd is currently needed becuse of a bug at xqt2
RDEPENDS_task-xqtlauncher = "xqtlauncher \
                                                   xkbd \
                                                   "

#
# xqtlauncher with blackbox as wm
#

RDEPENDS_task-xqtlauncher-blackbox = "xqtlauncher-blackbox-config \
                                     "

