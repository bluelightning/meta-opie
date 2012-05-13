require ${PN}.inc

inherit opie_git

SRC_URI = "${OPIE_GIT};protocol=git;subpath=core/applets/restartapplet;name=first \
           ${OPIE_GIT};protocol=git;subpath=apps"
