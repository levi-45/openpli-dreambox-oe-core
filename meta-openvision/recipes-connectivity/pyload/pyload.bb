DESCRIPTION = "pyLoad is a fast, lightweight and full featured download manager for many One-Click-Hoster"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=771b8e6a919776fe37ed773d332a7207"
HOMEPAGE = "http://pyload.org/"

RDEPENDS:${PN} = "\
  python3-compression \
  python3-db \
  python3-email \
  python3-html \
  python3-imaging \
  python3-numbers \
  python3-pprint \
  python3-pycrypto \
  python3-pycurl \
  python3-sqlite3 \
  python3-terminal \
  python3-unixadmin \
  python3-xmlrpc \
"
RRECOMMENDS:${PN} = "unrar"

PV = "0.5.0"

inherit update-rc.d setuptools3

SRC_URI = "git://github.com/pyload/pyload.git;branch=main \
	file://pyload.init \
"

S = "${WORKDIR}/git"

FILES:${PN} = "/usr/* /etc/*"

INITSCRIPT_NAME = "${PN}"
INITSCRIPT_PARAMS = "defaults 60 "

do_compile() {
	python3 -m compileall ${S}
}

do_install:append() {
	install -d ${D}/etc/init.d
	install -m 0755 ${WORKDIR}/pyload.init ${D}/etc/init.d/pyload
}

include python-package-split.inc
