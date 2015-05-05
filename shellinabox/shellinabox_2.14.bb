DESCRIPTION = "Web-based AJAX terminal emulator"
HOMEPAGE = "http://code.google.com/p/shellinabox/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=a193d25fdef283ddce530f6d67852fa5"

PR = "r0"

SRC_URI = "http://shellinabox.googlecode.com/files/shellinabox-${PV}.tar.gz \
        file://shellinabox.service \
"

SRC_URI[md5sum] = "6c63b52edcebc56ee73a108e7211d174"
SRC_URI[sha256sum] = "4126eb7070869787c161102cc2781d24d1d50c8aef4e5a3e1b5446e65d691071"

inherit autotools

do_configure () {
    ./configure --prefix=${prefix}
}

do_install_append () {
    install -d ${D}${systemd_unitdir}/system/
    install -m 0644 ${WORKDIR}/shellinabox.service ${D}${systemd_unitdir}/system/
}

FILES_${PN} += "${sysconfdir} \
                ${systemd_unitdir}/system/shellinabox.service \
"

inherit systemd

SYSTEMD_SERVICE_${PN} = "shellinabox.service"
