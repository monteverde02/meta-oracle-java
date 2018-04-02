PV_UPDATE = "131"
BUILD_NUMBER = "11"

require oracle-jse-jdk.inc

SRC_URI = "http://localhost/jdk-8u${PV_UPDATE}-linux-x64.tar.gz"

SRC_URI[md5sum] = "75b2cb2249710d822a60f83e28860053"
SRC_URI[sha256sum] = "62b215bdfb48bace523723cdbb2157c665e6a25429c73828a32f00e587301236"

COMPATIBLE_HOST = "(x86_64.*-linux)"
