PR .= ".1"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " \
  file://0001-WIP-Python-3.12-support-for-removal-of-imp-module.patch \
"

include python3-package-split.inc
