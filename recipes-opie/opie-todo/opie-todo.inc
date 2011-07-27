DESCRIPTION = "Todo list manager"
SECTION = "opie/pim"
PRIORITY = "optional"
LICENSE = "GPL"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
RDEPENDS_${PN} = "opie-pics"
APPNAME = "todolist"


S = "${WORKDIR}/todo"

inherit opie

# FILES plugins/application/libtodolist.so* bin/todolist apps/1Pim/todo.desktop
