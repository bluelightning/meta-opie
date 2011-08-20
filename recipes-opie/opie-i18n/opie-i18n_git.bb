require ${PN}.inc

PV = "${OPIE_GIT_PV}"
PR = "r1"

SRC_URI = "${OPIE_GIT};protocol=git;subpath=i18n \
	   ${OPIE_GIT};protocol=git;subpath=etc/dict"
