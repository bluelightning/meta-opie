require opie-securityplugin-blueping.inc

inherit opie_git

SRC_URI = "${OPIE_GIT};protocol=git;subpath=noncore/securityplugins/blueping;name=first \
           ${OPIE_GIT};protocol=git;subpath=pics "

