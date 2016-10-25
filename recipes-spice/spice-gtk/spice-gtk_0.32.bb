DESCRIPTION="spice client library using glib and gtk"
HOMEPAGE="https://github.com/SPICE/spice-gtk/"
SECTION = "x11/network"
PR = "r0"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4fbd65380cdd255951079008b364516c"

DEPENDS = "glib-2.0 m4 perl gtk+3 gtk+ libpthread-stubs libunique libssh libvncserver libxkbfile freerdp spice-protocol pixman celt051 cyrus-sasl"

SRC_URI = "http://spice-space.org/download/gtk/${PN}-${PV}.tar.bz2"

SRC_URI[md5sum] = "09930abb5ebe1b25b0f6988eb5716f98"
SRC_URI[sha256sum] ="4c48f4099335e0cd100854162a44070d34ed73dfcad2115e80c075013b49ee02"

inherit pkgconfig autotools gobject-introspection vala
PACKAGECONFIG[sasl] = "--with-cyrus-sasl,--without-cyrus-sasl,cyrus-sasl"
