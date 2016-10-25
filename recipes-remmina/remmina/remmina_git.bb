DESCRIPTION="A GTK+ RDP, VNC, XDMCP and SSH client"
HOMEPAGE="https://github.com/FreeRDP/Remmina"
SECTION = "x11/network"
PR = "r0"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=aeb712ea742b1aa682b641735e72afa3"

DEPENDS = "gtk+ libgcrypt libpthread-stubs webkitgtk vte libunique libssh libvncserver libxkbfile freerdp telepathy-glib avahi avahi-ui spice-protocol spice-gtk"

SRC_URI="git://github.com/FreeRDP/Remmina;protocol=http;branch=next"
SRCREV="aeaae3988a15b6c906c86c29c55b7032e39b90d0"
S= "${WORKDIR}/git"

EXTRA_OECMAKE ="-DWITH_AVAHI=OFF \
                -DWITH_GCRYPT=ON \
                -DWITH_APPINDICATOR=OFF \
               "  
FILES_${PN} += "\
    ${datadir}/remmina/* \
    ${datadir}/appdata/* \
    ${datadir}/applications/* \
    ${datadir}/icons/* \
    ${datadir}/locale/* \
    ${bindir}/remmina \
    ${libdir}/pkgconfig/* \
    ${libdir}/remmina/* \
    ${includedir}/remmina/* \
    "
inherit gettext pkgconfig gtk-icon-cache autotools cmake
