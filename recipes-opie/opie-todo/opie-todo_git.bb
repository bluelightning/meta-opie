require ${PN}.inc

inherit opie_git
PR = "r2"

SRC_URI = "${OPIE_GIT};protocol=git;subpath=core/pim/todo;name=first \
           ${OPIE_GIT};protocol=git;subpath=apps \
           file://unbreak-logging.patch"
