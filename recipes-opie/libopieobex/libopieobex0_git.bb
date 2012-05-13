require libopieobex0.inc
inherit opie_git
PR = "r9"

SRC_URI = "${OPIE_GIT};protocol=git;subpath=core/obex;name=first \
           ${OPIE_GIT};protocol=git;subpath=pics \
           file://disable-bt-check-git.patch"
