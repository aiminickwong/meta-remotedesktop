# meta-remotedesktop
This is a yocto layer includes remote desktop applications, remmina + spice plugin, spice-protocol, spice and spice-gtk. 
SPICE_VERSION=0.12.7
SPICE-PROTOCOL_VERSION=0.12.11
SPICE-GTK=0.32

Download this layer into poky source folder and update them into the conf/bblayer.conf in your build directory.
To final image build, edit conf/layer.conf in your build directory and append IMAGE_INSTALL_append =+ "remmina" at the end of the file and run $bitbake core-image-sato or; build the recipe independantly with $bitbake -c [build | configure | clean | fetch] pkgname .e.g. bitbake -c build remmina
