# Termux:Launch

Launch apps on android, Inspired by @GlitchYou [termux-launch](https://github.com/GlitchYou/termux-launch)

## Install

> When [app installed by releases](#)

```bash
git clone https://github.com/brunodavi/termux-launch
cd termux-launch

# install command 'launch'
./installer.sh
```

## How to use

```textpain
Usage:
  Launch apps on android

    -a --app     <app_name>      -- open app
    -i --info    <app_name>      -- open app settings
    -p --package <app_package>   -- open app from package
    -u --update                  -- load all apps
    -h --help                    -- show help
```

## Compile Apk

I used [buildApk](https://github.com/BuildAPKs/buildAPKs) in termux

```bash
# in termux-launch/
cd app

build.one.bash
```

```bash
# open apk in termux
termux-open com.termux.launch.apk
```
