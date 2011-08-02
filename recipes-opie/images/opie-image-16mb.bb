LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

IMAGE_LINGUAS = ""

DEPENDS = "task-boot task-opie-16mb"

ANGSTROM_EXTRA_INSTALL ?= ""
IMAGE_INSTALL = "task-boot \
                    dropbear \
                    task-opie-16mb-base \
                    task-opie-16mb-applets \
                    task-opie-16mb-inputmethods \
                    task-opie-16mb-settings \
                    task-opie-16mb-apps \
                    task-opie-16mb-pim \
                    ${ANGSTROM_EXTRA_INSTALL} "

inherit image

# Create /etc/timestamp during image construction to give a reasonably sane default time setting
ROOTFS_POSTPROCESS_COMMAND += "rootfs_update_timestamp ; "

