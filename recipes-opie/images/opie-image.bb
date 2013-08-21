LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

IMAGE_LINGUAS = ""

DEPENDS = "packagegroup-base packagegroup-opie"

IMAGE_FEATURES += "ssh-server-dropbear"

ANGSTROM_EXTRA_INSTALL ?= ""
IMAGE_INSTALL = "packagegroup-core-boot packagegroup-base ${ROOTFS_PKGMANAGE} \
		    packagegroup-opie-base packagegroup-opie-base-applets \
		    packagegroup-opie-base-inputmethods packagegroup-opie-base-apps \
		    packagegroup-opie-base-settings packagegroup-opie-base-decorations \
		    packagegroup-opie-base-styles packagegroup-opie-base-pim \
		    packagegroup-opie-extra-settings \
  ${@base_contains("COMBINED_FEATURES", "bluetooth", "packagegroup-opie-bluetooth", "",d)} \
  ${@base_contains("COMBINED_FEATURES", "irda", "packagegroup-opie-irda", "",d)} \
                    ${ANGSTROM_EXTRA_INSTALL} "

inherit core-image

