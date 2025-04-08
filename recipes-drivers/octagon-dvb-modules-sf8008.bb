KV = "4.4.35"
SRCDATE = "20240104"

require octagon-dvb-modules-hisi.inc

# copy some drivers from uClan to work around bugs not fixed
SRC_URI += " file://driver-hotfix.tar.gz"

SRC_URI[md5sum] = "f0e71fe842adb602b6c6d9a2493cd941"
SRC_URI[sha256sum] = "7ee73faf8874f674e45e680a0355a2ac60289a17d5f0c63eeafc85d3489ed7aa"
