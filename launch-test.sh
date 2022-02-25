#!/data/data/com.termux/files/usr/bin/sh

pkg='com.termux.launch'
root=`git rev-parse --show-toplevel`

export CLASSPATH=`realpath ${root}/app/${pkg}.apk`
exec /system/bin/app_process / "$pkg.Main" $@
