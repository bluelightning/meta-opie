require ${PN}.inc

PV = "${OPIE_GIT_PV}"
PR = "${INC_PR}.1"

SRC_URI = "${OPIE_GIT};protocol=git;subpath=library \
           file://fix-titleheight.patch \
           file://unbreak-logging-2.patch \
           file://no-include-pro.patch \
          "
