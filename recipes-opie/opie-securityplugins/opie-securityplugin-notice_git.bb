require opie-securityplugin-notice.inc

inherit opie_git

SRC_URI = "${OPIE_GIT};protocol=git;subpath=noncore/securityplugins/notice;name=first \
           ${OPIE_GIT};protocol=git;subpath=pics "

