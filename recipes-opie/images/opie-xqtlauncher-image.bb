require opie-image.bb

DEPENDS += "packagegroup-xqtlauncher"

export IMAGE_BASENAME = "opie-xqtlauncher-image"

IMAGE_INSTALL += "packagegroup-xqtlauncher packagegroup-xqtlauncher-blackbox"
