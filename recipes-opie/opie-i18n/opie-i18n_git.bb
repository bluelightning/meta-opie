require ${PN}.inc

inherit opie_git
PR = "r1"

SRC_URI = "${OPIE_GIT};protocol=git;subpath=i18n;name=first \
	   ${OPIE_GIT};protocol=git;subpath=etc/dict"
