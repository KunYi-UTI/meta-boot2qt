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

DESCRIPTION = "Target packages for B2Qt on embedded Linux SDK"
PR = "r0"
ALLOW_EMPTY_${PN} = "1"
LICENSE = "CLOSED"

PACKAGES = "${PN}"

MACHINE_EXTRA_INSTALL_SDK ?= ""

RDEPENDS_${PN} += "\
    packagegroup-core-standalone-sdk-target \
    base-files \
    glib-2.0-dev \
    openssl-dev \
    libpng-dev \
    tiff-dev \
    alsa-dev \
    dbus-dev \
    freetype-dev \
    fontconfig-dev \
    gstreamer-dev \
    gst-plugins-base-dev \
    icu-dev \
    libxslt-dev \
    udev-dev \
    tslib-dev \
    hunspell-dev \
    libcap-dev \
    wpa-supplicant-dev \
    ${@base_contains("DISTRO_FEATURES", "bluetooth", "bluez4-dev", "", d)} \
    ${MACHINE_EXTRA_INSTALL_SDK} \
    "
