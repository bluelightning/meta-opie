require ${PN}.inc

inherit opie_git
PR = "${INC_PR}.0"

SRC_URI = "${OPIE_GIT};protocol=git;subpath=libqtaux;name=first"
