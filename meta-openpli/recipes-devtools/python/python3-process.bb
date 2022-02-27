SUMMARY = "Python process list module"
SECTION = "devel/python"
PRIORITY = "optional"
SRCNAME = "process"

include python3-package-split.inc
require classes/python3-compileall.inc

require conf/license/license-gplv2.inc

inherit setuptools3-base

PV = "1.0"
PKGV = "1.0"

SRC_URI = "file://process.py"

S = "${WORKDIR}"

PACKAGES = "${PN} ${PN}-src"

FILES:${PN} = "${PYTHON_SITEPACKAGES_DIR}/process.pyc"
FILES:${PN}-src = "${PYTHON_SITEPACKAGES_DIR}/process.py"

do_install() {
    install -d ${D}${PYTHON_SITEPACKAGES_DIR}
    install -m 644 ${S}/process.py ${D}${PYTHON_SITEPACKAGES_DIR}/
}
