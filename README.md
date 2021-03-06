# Termux:Launch

Launch apps on android, Inspired by @GlitchYou [termux-launch](https://github.com/GlitchYou/termux-launch)

## Install

> When [app installed by releases](https://github.com/brunodavi/termux-launch/releases)

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

<details>
<summary>Examples</summary>

```bash
# load apps
$ launch -u
loading... apps (3/123)
```

```bash
# start google play store
$ launch -a play_store
staring play_store...
```

```bash
# show settings google play store
$ launch -i play_store
opeing play_store settings...
```

</details>

## Compile Apk

I used [buildApk](https://github.com/BuildAPKs/buildAPKs) in termux

> All actions must be performed in `termux-app/app/`

```bash
# compile termux-launch
build.one.bash
```

```bash
# open and install apk in termux
termux-open com.termux.launch.apk
```

```bash
# run apk without installing
../launch-test.sh -arg
```
