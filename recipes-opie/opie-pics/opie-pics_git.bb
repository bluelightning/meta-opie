require ${PN}.inc

inherit opie_git
PR = "r2"

SRC_URI = "${OPIE_GIT};protocol=git;subpath=pics;name=first \
           ${OPIE_GIT};protocol=git;subpath=pics-hires"
