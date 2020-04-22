#!/usr/bin/env bash

main() {
  [[ $# != 1 ]] && exit 1

  sum=0
  for i in `seq 1 ${#1}`
  do
    (( sum+=${1:i-1:1}**${#1} ))
  done

  [[ $sum == $1 ]] && echo "true" && exit 0
  echo "false"
}

main "$@"
