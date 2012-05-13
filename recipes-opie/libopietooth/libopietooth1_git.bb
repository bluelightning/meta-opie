SRC_URI = "${OPIE_GIT};protocol=git;subpath=noncore/net/opietooth/lib;name=first"
inherit opie_git
PR = "r2"

require libopietooth1.inc
