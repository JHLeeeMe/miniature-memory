#!/usr/bin/env bash

main() {
  (( $# != 1 )) && exit 1

  for i in `echo "${1^^}" | sed "s/[^'A-Z]/ /g"`
  do
    answer+="${i:0:1}"
  done

  echo "${answer}"
}

main "$@"
