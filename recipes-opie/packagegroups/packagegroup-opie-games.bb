DESCRIPTION = "Tasks for OPIE stuff"
SECTION = "opie/base"
LICENSE = "MIT"
PR = "r2"

inherit packagegroup

PACKAGES = "packagegroup-opie-games packagegroup-opie-extra-games"

RDEPENDS_packagegroup-opie-games = "opie-backgammon opie-bounce opie-buzzword opie-fifteen \
                   opie-go opie-kbill opie-kcheckers opie-kpacman opie-mindbreaker \
                   opie-minesweep opie-oyatzee opie-parashoot opie-qasteroids \
                   opie-sfcave opie-snake opie-solitaire opie-tetrix opie-tictac \
                   opie-wordgame opie-zlines opie-zsame"

#
# additional things for a >= 24mb distribution
#

RDEPENDS_packagegroup-opie-extra-games = "opie-parashoot opie-mindbreaker opie-fifteen opie-tictac \
                         opie-tetrix"

python __anonymous() {
    # For backwards compatibility after rename
    packages = d.getVar("PACKAGES", True).split()
    for pkg in packages:
        d.appendVar("RPROVIDES_%s" % pkg, pkg.replace("packagegroup-", "task-"))
        d.appendVar("RREPLACES_%s" % pkg, pkg.replace("packagegroup-", "task-"))
        d.appendVar("RCONFLICTS_%s" % pkg, pkg.replace("packagegroup-", "task-"))
}

