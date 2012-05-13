require ${PN}.inc

inherit opie_git

SRC_URI = "${OPIE_GIT};protocol=git;subpath=core/${APPNAME};name=first \
	   ${OPIE_GIT};protocol=git;subpath=core/apps/calibrate \
	   ${OPIE_GIT};protocol=git;subpath=core/launcher \
	   file://opie-session \
	   file://post-session \
	   file://pre-session \
	   file://opie-login.conf"
