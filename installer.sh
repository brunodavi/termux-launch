#!/bin/bash

# installer directory
dir_installer=`dirname ${0}`

# install command with permission read and execute
installer() {
  install -m +rx "${dir_installer}/$1" "${PREFIX}/bin"
}

install_launch() {
  installer command/launch
  echo launch installed in:
  echo " ${PREFIX}/bin/launch"
}

main() {
  install_launch
}

main
