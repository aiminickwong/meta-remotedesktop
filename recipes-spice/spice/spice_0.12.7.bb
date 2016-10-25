DESCRIPTION = "SPICE as is the Simple Protocol for Independent Computing Environments"
LICENSE = "GPLv2+"
PR = "r0"

DEPENDS = "jpeg cyrus-sasl glib-2.0 celt051 pixman"

LIC_FILES_CHKSUM = "file://COPYING;md5=4fbd65380cdd255951079008b364516c"

SRC_URI = "http://spice-space.org/download/releases/${PN}-${PV}.tar.bz2"

SRC_URI[md5sum] = "28d4294e6d055de3b6ce5b8f2b7ca03b"
SRC_URI[sha256sum] ="1c8e96cb9e833e23372e2f461508135903b697fd8c6daff565e9e87f6d2f6aba"
inherit autotools pkgconfig

EXTRA_OECONF = "--disable-smartcard"
PACKAGECONFIG[client] = "--enable-client"
PACKAGECONFIG[gui] = "--enable-gui"
PACKAGECONFIG[opengl] = "--enable-opengl"
