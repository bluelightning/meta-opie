require ${PN}.inc

inherit opie_git
PR = "r1"

SRC_URI = "${OPIE_GIT};protocol=git;subpath=core/applets/screenshotapplet;name=first \
           ${OPIE_GIT};protocol=git;subpath=apps                          \
	   ${OPIE_GIT};protocol=git;subpath=pics "
