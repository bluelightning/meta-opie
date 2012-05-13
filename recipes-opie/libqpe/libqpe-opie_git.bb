require ${PN}.inc

inherit opie_git
PR = "${INC_PR}.1"

SRC_URI = "${OPIE_GIT};protocol=git;subpath=library;name=first \
           file://fix-titleheight.patch \
           file://unbreak-logging-2.patch \
           file://no-include-pro.patch \
          "
