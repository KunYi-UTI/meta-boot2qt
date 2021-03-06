#############################################################################
##
## Copyright (C) 2014 Digia Plc and/or its subsidiary(-ies).
##
## This file is part of the Qt Enterprise Embedded Scripts of the Qt
## framework.
##
## $QT_BEGIN_LICENSE$
## Commercial License Usage Only
## Licensees holding valid commercial Qt license agreements with Digia
## with an appropriate addendum covering the Qt Enterprise Embedded Scripts,
## may use this file in accordance with the terms contained in said license
## agreement.
##
## For further information use the contact form at
## http://www.qt.io/contact-us.
##
##
## $QT_END_LICENSE$
##
#############################################################################

# kernel image files are not needed in the image
RDEPENDS_kernel-base = ""

do_configure_prepend() {
	# FunctionFS for adb
	echo "CONFIG_USB_FUNCTIONFS=m"  >> ${WORKDIR}/defconfig

	# Enable USB serial support
	echo "CONFIG_USB_SERIAL=m"              >> ${WORKDIR}/defconfig
	echo "CONFIG_USB_SERIAL_GENERIC=y"      >> ${WORKDIR}/defconfig
	echo "CONFIG_USB_SERIAL_FTDI_SIO=m"     >> ${WORKDIR}/defconfig
	echo "CONFIG_USB_SERIAL_PL2303=m"       >> ${WORKDIR}/defconfig
}
