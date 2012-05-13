require ${PN}.inc

inherit opie_git

SRC_URI = "${OPIE_GIT};protocol=git;subpath=core/pim/datebook/plugins/national;name=first \
           ${OPIE_GIT};protocol=git;subpath=etc/nationaldays "
