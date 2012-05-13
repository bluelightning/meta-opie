# Class for Opie git recipes to ensure they get the correct PV
# Relies on OPIE_GIT_PV and OPIE_SRCREV being set (see
# conf/distro/include/preferred-opie-git-versions.inc) 

# Note: you will need to ensure the first entry in SRC_URI pointing
# to the Opie git repository has name=first

PV = "${OPIE_GIT_PV}${SRCPV}"

SRCREV = "${OPIE_SRCREV}"
SRCREV_FORMAT = "first"

