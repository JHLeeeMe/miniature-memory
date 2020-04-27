#!/usr/bin/env bash


main() {
  [[ $# != 2 ]] && exit 1

  if [[ $1 == "square_of_sum" ]]; then
    for i in `seq 1 $2`; do
      (( tmp += $i ))
    done
    (( result = $tmp**2 ))

  elif [[ $1 == "sum_of_squares" ]]; then
    for i in `seq 1 $2`; do
      (( result += $(( i**2 )) ))
    done

  elif [[ $1 == "difference" ]]; then
    for i in `seq 1 $2`; do
      (( tmp1 += $i ))
      (( tmp2 += $(( i**2 )) ))
    done
    (( result = $(( tmp1**2 )) - $tmp2 ))

  else 
    exit 1
  fi

  echo $result
}

main "$@"
