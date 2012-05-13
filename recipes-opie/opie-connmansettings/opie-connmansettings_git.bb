require ${PN}.inc
inherit opie_git
PR = "r0"

SRC_URI = "${OPIE_GIT};protocol=git;subpath=noncore/net/connman/settings;name=first \
           ${OPIE_GIT};protocol=git;subpath=apps \
           ${OPIE_GIT};protocol=git;subpath=pics"
