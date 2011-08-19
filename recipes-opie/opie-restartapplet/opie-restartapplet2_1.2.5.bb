DESCRIPTION = "Restart Applet"
SECTION = "opie/applets"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
APPNAME = "restartapplet"

SRC_URI = "http://sources.openembedded.org/opie-1.2.5-split_core_applets_restartapplet2.tar.bz2;name=split_core_applets_restartapplet2 \
           http://sources.openembedded.org/opie-1.2.5-split_apps.tar.bz2;name=split_apps"
SRC_URI[split_core_applets_restartapplet2.md5sum] = "d5fedf3676bc08e865cc12750c11467a"
SRC_URI[split_core_applets_restartapplet2.sha256sum] = "85a622e7ad4767b065f6ea3464af7d9f839f440bc8fa6bbeab6571a7ab66623f"
SRC_URI[split_apps.md5sum] = "c765d13427e4dc8ee396e4dfed2dbe73"
SRC_URI[split_apps.sha256sum] = "0fea454d8d286f7febc7449e4a06f73e941e8b22e9bab904a32e57f35479862a"

S = "${WORKDIR}/restartapplet2"

inherit opie

# FILES plugins/applets/librestartapplet.so*
do_install() {
}

