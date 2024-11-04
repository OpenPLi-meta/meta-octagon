FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

PACKAGE_ARCH := "${MACHINE_ARCH}"

SRC_URI:append:sfx6008 = " \
	file://libjpeg.so.8.2.2 \
"

SRC_URI:append:sx88v2 = " \
	file://libjpeg.so.8.2.2 \
"

do_install:append:sfx6008() {
	install -d ${D}${libdir}
	install -m 0755 ${WORKDIR}/libjpeg.so.8.2.2 ${D}${libdir}/
	ln -s libjpeg.so.8.2.2 ${D}${libdir}/libjpeg.so.8
}

do_install:append:sx88v2() {
	install -d ${D}${libdir}
	install -m 0755 ${WORKDIR}/libjpeg.so.8.2.2 ${D}${libdir}/
}

