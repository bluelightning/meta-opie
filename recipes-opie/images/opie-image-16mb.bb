IMAGE_LINGUAS = ""

DEPENDS = "packagegroup-boot packagegroup-opie-16mb"

ANGSTROM_EXTRA_INSTALL ?= ""
IMAGE_INSTALL = "packagegroup-core-boot \
                    dropbear \
                    packagegroup-opie-16mb-base \
                    packagegroup-opie-16mb-applets \
                    packagegroup-opie-16mb-inputmethods \
                    packagegroup-opie-16mb-settings \
                    packagegroup-opie-16mb-apps \
                    packagegroup-opie-16mb-pim \
                    ${ANGSTROM_EXTRA_INSTALL} "

inherit image

# Create /etc/timestamp during image construction to give a reasonably sane default time setting
ROOTFS_POSTPROCESS_COMMAND += "rootfs_update_timestamp ; "

