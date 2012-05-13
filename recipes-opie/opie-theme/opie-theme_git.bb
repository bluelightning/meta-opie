require ${PN}.inc
PR = "r1"

inherit opie_git

SRC_URI = "${OPIE_GIT};protocol=git;subpath=noncore/styles/theme;name=first \
	${OPIE_GIT};protocol=git;subpath=plugins/styles "
