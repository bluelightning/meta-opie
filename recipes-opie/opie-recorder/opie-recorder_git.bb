require ${PN}.inc

inherit opie_git

PR = "r1"

SRC_URI = "${OPIE_GIT};protocol=git;subpath=noncore/multimedia/opierec;name=first \
           ${OPIE_GIT};protocol=git;subpath=pics \
           ${OPIE_GIT};protocol=git;subpath=apps"

DEPENDS = "libopiecore2 libopieui2 libopiemm2"
