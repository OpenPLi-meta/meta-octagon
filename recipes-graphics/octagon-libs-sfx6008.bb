SRCDATE = "20221013"

require octagon-libs.inc

SRC_URI:append = " \
    file://libjpeg.so.8.2.2 \
"

do_install:append() {
    install -d ${D}${libdir}
    install -m 0755 ${WORKDIR}/libjpeg.so.8.2.2 ${D}${libdir}/
    ln -s libjpeg.so.8.2.2 ${D}${libdir}/libjpeg.so.8
}


SRC_URI[md5sum] = "6f214074a463e4c04265fbbec8636d63"
SRC_URI[sha256sum] = "0bae3d5e9621bf959b6e1b00d9a744f2eea61986c0c9e07ff752e84fc13192d5"
