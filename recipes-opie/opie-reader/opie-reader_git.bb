require ${PN}.inc

inherit opie_git
PR = "${INC_PR}.0"

SRC_URI = "${OPIE_GIT};protocol=git;subpath=noncore/apps/opie-reader;name=first \
           ${OPIE_GIT};protocol=git;subpath=pics \
           ${OPIE_GIT};protocol=git;subpath=apps"

