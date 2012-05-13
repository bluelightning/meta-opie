require ${PN}.inc

inherit opie_git
PR = "r5"

SRC_URI = "${OPIE_GIT};protocol=git;subpath=noncore/settings/networksettings;name=first \
           ${OPIE_GIT};protocol=git;subpath=pics \
           ${OPIE_GIT};protocol=git;subpath=apps \
           ${OPIE_GIT};protocol=git;subpath=root \
          "
