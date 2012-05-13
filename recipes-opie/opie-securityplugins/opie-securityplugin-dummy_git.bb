require opie-securityplugin-dummy.inc

inherit opie_git

SRC_URI = "${OPIE_GIT};protocol=git;subpath=noncore/securityplugins/dummy;name=first \
           ${OPIE_GIT};protocol=git;subpath=pics "

