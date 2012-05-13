require ${PN}.inc

inherit opie_git
PR = "r5"

SRC_URI = "${OPIE_GIT};protocol=git;subpath=core/opiealarm;name=first \
           file://01opiealarm \
	   file://dirdefines-git.patch "
