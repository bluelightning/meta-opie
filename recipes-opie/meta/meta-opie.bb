DESCRIPTION = "Meta-package for Opie"
SECTION = "opie/base"
PR = "r35"
LICENSE = "MIT"

RDEPENDS_${PN} = "packagegroup-opie-applets packagegroup-opie-apps packagegroup-opie-base \
            packagegroup-opie-base-applets packagegroup-opie-base-apps \
            packagegroup-opie-base-decorations packagegroup-opie-base-inputmethods \
            packagegroup-opie-base-pim packagegroup-opie-base-settings \
            packagegroup-opie-base-styles \
            ${@base_contains("COMBINED_FEATURES", "bluetooth", "packagegroup-opie-bluetooth", "",d)} \
            packagegroup-opie-datebookplugins packagegroup-opie-decorations \
            packagegroup-opie-extra-apps packagegroup-opie-extra-settings \
            packagegroup-opie-extra-styles packagegroup-opie-extra-games \
            ${@base_contains("COMBINED_FEATURES", "irda", "packagegroup-opie-irda", "",d)} \
            packagegroup-opie-games packagegroup-opie-inputmethods \
            packagegroup-opie-multimedia packagegroup-opie-pim packagegroup-opie-settings \
            packagegroup-opie-styles packagegroup-opie-todayplugins packagegroup-opie-wlan"

inherit meta
