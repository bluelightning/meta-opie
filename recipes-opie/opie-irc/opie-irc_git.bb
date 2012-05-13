require ${PN}.inc

inherit opie_git
PR = "r3"

SRC_URI = "${OPIE_GIT};protocol=git;subpath=noncore/net/opieirc;name=first \
           ${OPIE_GIT};protocol=git;subpath=help \
           ${OPIE_GIT};protocol=git;subpath=apps \
	   ${OPIE_GIT};protocol=git;subpath=pics"
