require ${PN}.inc

inherit opie_git
PR = "r2"

DEPENDS = "opkg"

EXTRA_QMAKEVARS_PRE += "LIBIPK_INC_DIR=${STAGING_INCDIR}/libopkg"

SRC_URI = "${OPIE_GIT};protocol=git;subpath=noncore/settings/${APPNAME};name=first \
           ${OPIE_GIT};protocol=git;subpath=pics \
           ${OPIE_GIT};protocol=git;subpath=apps"
