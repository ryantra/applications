SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"


RDEPENDS_${PN} = "python3-dbus"

S = "${WORKDIR}/gattd-${PV}"

do_install () {
	install -d ${D}${bindir}
	install -m 0755 ${S}/*.py ${D}${bindir}
}

FILES_${PN} += "${bindir}/*.py"
