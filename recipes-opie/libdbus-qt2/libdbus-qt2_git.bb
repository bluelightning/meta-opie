SRC_URI = "${OPIE_GIT};protocol=git;subpath=libdbus-qt2;name=first"
inherit opie_git
PR = "r0"

require libdbus-qt2.inc
