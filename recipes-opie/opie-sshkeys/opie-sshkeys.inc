DESCRIPTION = "Utility for managing ssh-agent keys"
SECTION = "opie/settings"
LICENSE = "GPLv2+"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
RDEPENDS_${PN} = "ssh opie-sh-ssh-askpass"
APPNAME = "sshkeys"


S = "${WORKDIR}/${APPNAME}"

inherit opie

# FILES bin/sshkeys apps/Settings/sshkeys.desktop pics/sshkeys/sshkeys.png
do_install() {
        install -d ${D}${palmtopdir}/pics/${APPNAME}/
        install -m 0644 ${WORKDIR}/pics/${APPNAME}/*.png ${D}${palmtopdir}/pics/${APPNAME}/
}

