require ${PN}.inc
inherit opie_git
PR = "r1"

RDEPENDS_${PN} += "opie-bluetoothd"

SRC_URI = "${OPIE_GIT};protocol=git;subpath=noncore/net/opietooth/manager;name=first \
           ${OPIE_GIT};protocol=git;subpath=apps \
           ${OPIE_GIT};protocol=git;subpath=pics"
