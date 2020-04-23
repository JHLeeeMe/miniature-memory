#!/usr/bin/env bash

main() {
  [[ $# != 1 ]] && exit 1

  # "A B ... Z"
  AtoZ=`echo {A..Z}` 

  # ${AtoZ,,[ABC]} is "a b c D E ... Z"
  [[ ${AtoZ,,["${1^^}"]} == ${AtoZ,,} ]] && echo "true" && exit 0 
  echo "false"
}

main "$@"
