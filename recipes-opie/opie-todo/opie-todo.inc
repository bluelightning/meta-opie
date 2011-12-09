DESCRIPTION = "Todo list manager"
SECTION = "opie/pim"
LICENSE = "LGPLv2+"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/LGPL-2.0;md5=9427b8ccf5cf3df47c29110424c9641a"
RDEPENDS_${PN} = "opie-pics"
APPNAME = "todolist"


S = "${WORKDIR}/todo"

inherit opie

# FILES plugins/application/libtodolist.so* bin/todolist apps/1Pim/todo.desktop
