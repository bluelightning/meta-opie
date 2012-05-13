require ${PN}.inc

inherit opie_git

PR = "r2"

SRC_URI = "${OPIE_GIT};protocol=git;subpath=noncore/applets/cardapplet;name=first \
           ${OPIE_GIT};protocol=git;subpath=pics \
           ${OPIE_GIT};protocol=git;subpath=sounds \
           ${OPIE_GIT};protocol=git;subpath=apps \
           ${OPIE_GIT};protocol=git;subpath=etc"
