#!/usr/bin/env bash

main() {
  [[ $# != 1 ]] && exit 1
  [[ $1 == 0 || $1 < 0 ]] && echo "Error: Only positive numbers are allowed" && exit 1

  input=$1
  cnt=0
  while [[ $input != 1 ]]; do
    (( cnt += 1 ))

    if (( input % 2 == 0 )); then
      (( input /= 2 ))
    else
      (( input = 3 * input + 1 ))
    fi
  done

  echo $cnt
}

main "$@"

#!/usr/bin/env bash
#num=$1; counter=0
#[ $num -lt 1 ] && { echo "Error: Only positive numbers are allowed" ; exit 1 ; }
#
#while [ $num -ne 1 ]; do
#    (( counter++ ))
#    (( $num % 2 == 0 )) && (( num /= 2 )) || (( num = $num * 3 + 1 ))
#done
#
#echo $counter
