require opie-securityplugin-pin.inc

inherit opie_git

SRC_URI = "${OPIE_GIT};protocol=git;subpath=noncore/securityplugins/pin;name=first \
           ${OPIE_GIT};protocol=git;subpath=pics "

