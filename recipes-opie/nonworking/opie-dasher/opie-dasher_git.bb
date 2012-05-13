require ${PN}.inc
PR = "r2"

inherit opie_git

SRC_URI = "${OPIE_GIT};protocol=git;subpath=inputmethods/dasher;name=first \
           ${OPIE_GIT};protocol=git;subpath=share "
