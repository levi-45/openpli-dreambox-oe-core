SUMMARY = "yEnc module for Python"
SECTION = "devel/python"
DEPENDS = "python3"
PRIORITY = "optional"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=5858eb949cc6db7a2879a5eb38b3423a"

SRC_URI = "git://github.com/oe-mirrors/python3-yenc.git;protocol=https;branch=master"

SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit setuptools3 gitpkgv

include ${PYTHON_PN}-package-split.inc
