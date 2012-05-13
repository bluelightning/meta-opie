require ${PN}.inc

inherit opie_git
PR = "r3"

SRC_URI = "${OPIE_GIT};protocol=git;subpath=core/applets/irdaapplet;name=first \
           ${OPIE_GIT};protocol=git;subpath=pics \
           ${OPIE_GIT};protocol=git;subpath=sounds \
           ${OPIE_GIT};protocol=git;subpath=apps \
	  "
