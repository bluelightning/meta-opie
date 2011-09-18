SECTION = "base"
DESCRIPTION = "Ethernet manufacturer database"
LICENSE = "PD"
SRCDATE = "${PV}"
SRCREV = "ff794de4991efa6403b2368edba6eb4e63d8d449"

PR = "r2"

inherit allarch

SRC_URI = "${OPIE_GIT};protocol=git;subpath=etc"
S = "${WORKDIR}/etc"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/PD;md5=b3597d12946881e13cb3b548d1173851"

do_install() {
	install -d ${D}${sysconfdir}
	install -m 0644 manufacturers ${D}${sysconfdir}/
}
