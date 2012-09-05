DESCRIPTION = "Tasks for OPIE stuff"
SECTION = "opie/base"
LICENSE = "MIT"

PR = "r2"

inherit packagegroup

LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

PACKAGES = "packagegroup-opie-apps packagegroup-opie-extra-apps"

RDEPENDS_packagegroup-opie-apps = "opie-advancedfm opie-bartender opie-calculator \
                  opie-checkbook opie-clock \
                  opie-console opie-embeddedkonsole \
                  opie-eye opie-ftp opie-gutenbrowser \
                  opie-helpbrowser opie-irc opie-keypebble opie-odict \
                  opie-oxygen opie-rdesktop opie-reader opie-remote \
                  opie-sheet opie-tableviewer opie-tinykate \
                  opie-wellenreiter opie-write opie-zsafe"

#
# additional things for a >= 24mb distribution
#

RDEPENDS_packagegroup-opie-extra-apps = "opie-calculator opie-checkbook opie-mail opie-eye \
                        opie-rdesktop opie-wellenreiter opie-irc \
                        opie-mediaplayer2 \
                        qpdf2"
# konqueror-embedded

python __anonymous() {
    # For backwards compatibility after rename
    packages = d.getVar("PACKAGES", True).split()
    for pkg in packages:
        d.appendVar("RPROVIDES_%s" % pkg, pkg.replace("packagegroup-", "task-"))
        d.appendVar("RREPLACES_%s" % pkg, pkg.replace("packagegroup-", "task-"))
        d.appendVar("RCONFLICTS_%s" % pkg, pkg.replace("packagegroup-", "task-"))
}

