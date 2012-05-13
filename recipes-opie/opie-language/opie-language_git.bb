require ${PN}.inc

inherit opie_git

SRC_URI = "${OPIE_GIT};protocol=git;subpath=noncore/settings/language;name=first \
           ${OPIE_GIT};protocol=git;subpath=apps"
