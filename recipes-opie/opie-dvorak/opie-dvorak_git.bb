require ${PN}.inc

inherit opie_git
PR = "r1"

SRC_URI = "${OPIE_GIT};protocol=git;subpath=inputmethods/dvorak;name=first \
           ${OPIE_GIT};protocol=git;subpath=inputmethods/pickboard \
	   file://fix-rpath.patch "
