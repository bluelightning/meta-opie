require ${PN}.inc

PV = "${OPIE_GIT_PV}"
PR = "r5"

SRC_URI = "${OPIE_GIT};protocol=git;subpath=core/opiealarm \
           file://01opiealarm \
	   file://dirdefines-git.patch "
