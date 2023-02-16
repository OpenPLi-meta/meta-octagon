SRCDATE = "20221203"

require octagon-libs.inc

SRC_URI_append = " \
    file://libjpeg.so.8.2.2 \
"

do_install_append() {
    install -d ${D}${libdir}
    install -m 0755 ${WORKDIR}/libjpeg.so.8.2.2 ${D}${libdir}/
    ln -s libjpeg.so.8.2.2 ${D}${libdir}/libjpeg.so.8
}


SRC_URI[md5sum] = "7d293c9b9df1485e1585da52ea8a3ddb"
SRC_URI[sha256sum] = "b79a35af10fe423b0e549521f944ca6fa00b55003c815e76dce30872be0dd927"
