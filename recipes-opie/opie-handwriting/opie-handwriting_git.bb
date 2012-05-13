require ${PN}.inc

inherit opie_git
PR = "r2"

SRC_URI = "${OPIE_GIT};protocol=git;subpath=inputmethods/handwriting;name=first \
	${OPIE_GIT};protocol=git;subpath=etc/qimpen"
