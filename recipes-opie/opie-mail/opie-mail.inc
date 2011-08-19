DESCRIPTION = "Opie's mail and news client featuring POP3, IMAP and NNTP - with and without SSL."
SECTION = "opie/pim"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
DEPENDS = "libmailwrapper libetpan"
RDEPENDS_${PN} = "opie-pics"
APPNAME = "opiemail"


S = "${WORKDIR}/mail"

inherit opie

# FILES plugins/application/libopiemail.so* bin/opiemail apps/1Pim/mail.desktop pics/mail/*.png

do_install() {
	install -d ${D}${palmtopdir}/pics/mail/
	install -m 0644 ${WORKDIR}/pics/mail/*.png ${D}${palmtopdir}/pics/mail/
}

