require ${PN}.inc

inherit opie_git

SRC_URI = "${OPIE_GIT};protocol=git;subpath=inputmethods/kjumpx;name=first \
	   ${OPIE_GIT};protocol=git;subpath=pics"
