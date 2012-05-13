require ${PN}.inc

inherit opie_git
PR = "r3"

SRC_URI = "${OPIE_GIT};protocol=git;subpath=core/apps/qcop;name=first \
           file://unbreak-logging.patch"
