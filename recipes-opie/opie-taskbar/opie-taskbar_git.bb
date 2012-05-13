require ${PN}.inc
inherit opie_git
PR = "r22"

SRC_URI = "${OPIE_GIT};protocol=git;subpath=core/apps/calibrate;name=first \
           ${OPIE_GIT};protocol=git;subpath=noncore/settings/mediummount \
           ${OPIE_GIT};protocol=git;subpath=core/launcher \
           ${OPIE_GIT};protocol=git;subpath=pics \
           ${OPIE_GIT};protocol=git;subpath=apps \
           ${OPIE_GIT};protocol=git;subpath=root \
           ${OPIE_GIT};protocol=git;subpath=etc \
           file://nomax.patch;striplevel=3 \
           file://no-builtin-qss-startup-2.patch \
           file://kbdlocks-runtime.patch \
           file://server-pro-git.patch \
           file://force-firstuse-calibrate.patch \
          "

