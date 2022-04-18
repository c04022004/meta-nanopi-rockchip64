DESCRIPTION="Upstream's U-boot configured for allwinner devices"
AUTHOR = "Dimitris Tassopoulos <dimtass@gmail.com>"

require u-boot-rockchip64.inc

UBOOT_VERSION = "2021.07"

SRCREV = "840658b093976390e9537724f802281c9c8439f5"
PV = "v${UBOOT_VERSION}+git${SRCPV}"