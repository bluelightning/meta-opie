require ${PN}.inc

inherit opie_git
PR = "r5"

SRC_URI = "${OPIE_GIT};protocol=git;subpath=inputmethods/multikey;name=first \
           ${OPIE_GIT};protocol=git;subpath=share \
           file://fix-rpath.patch"

#           file://friendly-button-names.patch"
