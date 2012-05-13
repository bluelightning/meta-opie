require ${PN}.inc

inherit opie_git

PR = "r1"

SRC_URI = "${OPIE_GIT};protocol=git;subpath=core/applets/vmemo;name=first \
           ${OPIE_GIT};protocol=git;subpath=apps"

DEPENDS = "libopiecore2 libopieui2 libopiemm2"
