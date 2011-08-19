DESCRIPTION = "Opie Launcher and Taskbar"
SECTION = "opie/base"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
APPNAME = "qpe"

S = "${WORKDIR}/pics"

inherit opie

# Wallpaper and welcome splash
PIXMAP_SIZE 		= ""
PIXMAP_SIZE_c7x0 	= "-640x480"
PIXMAP_SIZE_spitz	= "-640x480"
PIXMAP_SIZE_akita	= "-640x480"
PIXMAP_SIZE_tosa 	= "-480x640"
PIXMAP_SIZE_simpad 	= "-800x600"
PIXMAP_SIZE_asus730     = "-480x640"
PIXMAP_SIZE_htcuniversal= "-480x640"
PIXMAP_SIZE_hx4700      = "-480x640"
PIXMAP_SIZE_palmz31     = "-160x160"
PIXMAP_SIZE_palmz71     = "-320x320"
PIXMAP_SIZE_palmz72     = "-320x320"
PIXMAP_SIZE_palmt650    = "-320x320"
PIXMAP_SIZE_palmt680    = "-320x320"
PIXMAP_SIZE_palmt3      = "-320x480"
PIXMAP_SIZE_palmt5      = "-320x480"
PIXMAP_SIZE_palmtx      = "-320x480"
PIXMAP_SIZE_palmld      = "-320x480"

AVAILABLE_SIZES         = "240x240 240x320 320x320 320x480 480x320 480x640 640x480 800x600"

do_configure() {
        :
}

do_install() {
        install -d ${D}${palmtopdir}/pics/launcher
	
        # Allow us to be lazy with the loop below
        mv ${WORKDIR}/pics/launcher/firstuse.jpg ${WORKDIR}/pics/launcher/firstuse-240x320.jpg
        mv ${WORKDIR}/pics/launcher/opie-background.jpg ${WORKDIR}/pics/launcher/opie-background-240x320.jpg

        for res in ${AVAILABLE_SIZES}; do
                install -m 0644 ${WORKDIR}/pics/launcher/firstuse-${res}.jpg ${D}${palmtopdir}/pics/launcher/firstuse-${res}.jpg
                install -m 0644 ${WORKDIR}/pics/launcher/opie-background-${res}.jpg ${D}${palmtopdir}/pics/launcher/opie-background-${res}.jpg
        done
}

python __anonymous () {
    reslist = bb.data.getVar('AVAILABLE_SIZES', d, True).split()
    dir = bb.data.expand('${palmtopdir}/pics/launcher/', d)
    ft = bb.data.expand('${palmtopdir}/pics/*/*-%s.*', d)
    pn = bb.data.getVar('PN', d, 1)
    for res in reslist:
        bb.data.setVar('FILES_%s-%s' % (pn,res), ft % res, d )
        postinst = ''
        postinst = 'update-alternatives --install %sfirstuse.jpg opie-firstuse-pixmap %sfirstuse-%s.jpg 50\n' % (dir,dir,res)
        postinst += 'update-alternatives --install %sopie-background.jpg opie-background-pixmap %sopie-background-%s.jpg 50\n' % (dir,dir,res)
        bb.data.setVar('pkg_postinst_%s-%s' % (pn,res),postinst, d)
        prerm = ''
        prerm = 'update-alternatives --remove opie-firstuse-pixmap %sfirstuse-%s.jpg 50\n' % (dir,res)
        prerm += 'update-alternatives --remove opie-background-pixmap %sopie-background-%s.jpg 50\n' % (dir,res)
        bb.data.setVar('pkg_prerm_%s-%s' % (pn,res),prerm, d)
}

PACKAGE_ARCH = "all"
PACKAGES = "${PN}-dbg ${PN}-240x240 ${PN}-240x320 ${PN}-320x320 ${PN}-320x480 ${PN}-480x320 ${PN}-480x640 ${PN}-640x480 ${PN}-800x600"
RPROVIDES_${PN}-240x240 = "opie-taskbar-images"
RPROVIDES_${PN}-240x320 = "opie-taskbar-images"
RPROVIDES_${PN}-320x320 = "opie-taskbar-images"
RPROVIDES_${PN}-320x480 = "opie-taskbar-images"
RPROVIDES_${PN}-480x320 = "opie-taskbar-images"
RPROVIDES_${PN}-480x640 = "opie-taskbar-images"
RPROVIDES_${PN}-640x480 = "opie-taskbar-images"
RPROVIDES_${PN}-800x600 = "opie-taskbar-images"
