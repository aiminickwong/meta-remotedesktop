DESCRIPTION = "SPICE Protocol Headers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b37311cb5604f3e5cc2fb0fd23527e95"
PR = "r0"


SRC_URI = "http://spice-space.org/download/releases/${PN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "422bf0bc1eb34c8af3479a78b28e969b"
SRC_URI[sha256sum] ="22bae438bfb6c3245b195755c3f55e72c1f2bfae6f39c905b576fcb6c79b6330"

inherit autotools pkgconfig
