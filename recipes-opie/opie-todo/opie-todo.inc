DESCRIPTION = "Todo list manager"
SECTION = "opie/pim"
LICENSE = "LGPLv2+"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/LGPL-2.0;md5=03f2b9deed35802bc1aae2ae3dc6d9ed"
RDEPENDS_${PN} = "opie-pics"
APPNAME = "todolist"


S = "${WORKDIR}/todo"

inherit opie

# FILES plugins/application/libtodolist.so* bin/todolist apps/1Pim/todo.desktop
