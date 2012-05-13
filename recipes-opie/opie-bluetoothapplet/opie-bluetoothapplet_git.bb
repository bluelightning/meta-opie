require ${PN}.inc

inherit opie_git
PR = "r3"

RDEPENDS_${PN} += "opie-bluetoothd"

SRC_URI = "${OPIE_GIT};protocol=git;subpath=noncore/net/opietooth/applet;name=first \
           ${OPIE_GIT};protocol=git;subpath=pics"
