DESCRIPTION = "Tasks for programs running on Qt/Embedded based Palmtop Environents like Opie and Qtopia."
SECTION = "opie/base"
LICENSE = "MIT"
PR = "r10"

inherit packagegroup

PACKAGES = "packagegroup-qpe-applets packagegroup-qpe-games packagegroup-qpe-inputmethods \
	packagegroup-qpe-multimedia packagegroup-qpe-emulators packagegroup-qpe-applications \
	packagegroup-qpe-fonts packagegroup-qpe-settings"

RDEPENDS_packagegroup-qpe-applets = "\
    subapplet \
    tasklistapplet"

RDEPENDS_packagegroup-qpe-applications = "\
    camera-assistant \
    cumulus \
    dviviewer \
    freenote \
    inkwp \
    iqnotes \
    justreader \
    keyring \
    klimt \
    kstars-embedded \
    ktimetrackerpi \
    mileage \
    militaryalphabet \
    petitepainture \
    pocketcellar \
    poqetpresenter \
    portabase \
    qpdf2 \
    qpealarmclock \
    qpe-gaim \
    qpegps \
    qpe-nmap \
    qplot \
    qpphoto \
    resistorui \
    shopper \
    sliderulez \
    timesleuth \
    txdrug \
    tximage \
    ubahnnav \
    visiscript \
    xqt2 \
    zbedic \
    zbench \
    zgscore \
    zipsc \
    zlapspeed \
    zroadmap \
    zshopi"

RDEPENDS_packagegroup-opie-decorations = "\
    opie-deco-flat \
    opie-deco-liquid \
    opie-deco-polished"

RDEPENDS_packagegroup-qpe-games = "\
    aliens \
    aliens-qt \
    atomic \
    billiardz \
    brickout \
    checkers \
    crossword \
    fish \
    froot \
    gemdropx \
    glider \
    hexatrolic \
    iaimaster \
    icebloxx \
    knights \
    labyrinth \
    mahjongg \
    maki \
    nmm \
    pairs \
    pdamaze \
    pipeman \
    pipepanic \
    powermanga \
    puzz-le \
    qfish2 \
    qmatrix \
    shisensho \
    sokoban \
    tickypip \
    tickypip-levels \
    tron \
    vectoroids \
    win4 \
    zauralign \
    zddice \
    ziq \
    zmerlin \
    zrally \
    zrev7 \
    zsubhunt \
    ztappy \
    zudoku"

RDEPENDS_packagegroup-qpe-inputmethods = "\
    custominput \
    flexis-zaurus \
    irk-targus \
    irk-belkin"

RDEPENDS_packagegroup-qpe-multimedia = "\
    mplayer \
    sidplayer \
    xmms-embedded"

RDEPENDS_packagegroup-kdepim = "\
    kopi \
    kapi \
    kopi-applet"

RDEPENDS_packagegroup-qpe-emulators = "scummvm"

RDEPENDS_packagegroup-qpe-fonts = "\
    qpf-bitstream-vera-large \
    qpf-bitstream-vera-sans-mono-huge \
    qpf-freemono \
    qpf-freeserif \
    ttf-gentium \
    qpf-hunkysans \
    qpf-hunkyserif \
    qpf-qte \
    qpf-helvetica \
    qpf-unifont \
    qpf-utopia \
    qpf-terminus"

RDEPENDS_packagegroup-qpe-settings += "\
    qclockchange"

