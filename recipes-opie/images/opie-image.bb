LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

IMAGE_LINGUAS = ""

DEPENDS = "task-base task-opie"

IMAGE_FEATURES = "ssh-server-dropbear"

ANGSTROM_EXTRA_INSTALL ?= ""
IMAGE_INSTALL = "task-core-boot ${ROOTFS_PKGMANAGE} task-opie-base task-opie-base-applets \
		    task-opie-base-inputmethods task-opie-base-apps \
		    task-opie-base-settings task-opie-base-decorations \
		    task-opie-base-styles task-opie-base-pim \
		    task-opie-extra-settings \
  ${@base_contains("COMBINED_FEATURES", "bluetooth", "task-opie-bluetooth", "",d)} \
  ${@base_contains("COMBINED_FEATURES", "irda", "task-opie-irda", "",d)} \
                    ${ANGSTROM_EXTRA_INSTALL} "

inherit core-image

