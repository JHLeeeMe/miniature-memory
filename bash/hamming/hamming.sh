#!/usr/bin/env bash

main() {
  (( $# != 2 )) && echo "Usage: hamming.sh <string1> <string2>" && exit 1
  (( ${#1} != ${#2} )) && echo "left and right strands must be of equal length" && exit 1

  cnt=0
  for i in `seq 1 ${#1}`
  do
    [[ "${1:$i-1:1}" != "${2:$i-1:1}" ]] && (( cnt++ ))
  done

  echo $cnt
}

main "$@"
