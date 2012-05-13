require ${PN}.inc

inherit opie_git
PR = "${INC_PR}.0"

SRC_URI = "${OPIE_GIT};protocol=git;subpath=libopie2;name=first \
           file://include.pro"

# libdbus-qt2 is needed for new bluez4 support
DEPENDS += "libdbus-qt2"

# FIXME remove this!
SRC_URI_append_poodle = " file://poodle-2.6-hotkeys.patch"
