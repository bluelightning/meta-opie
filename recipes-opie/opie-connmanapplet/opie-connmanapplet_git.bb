require ${PN}.inc

PV = "${OPIE_GIT_PV}"
PR = "r0"

SRC_URI = "${OPIE_GIT};protocol=git;subpath=noncore/net/connman/applet \
           ${OPIE_GIT};protocol=git;subpath=noncore/net/connman/settings \
           ${OPIE_GIT};protocol=git;subpath=pics"
