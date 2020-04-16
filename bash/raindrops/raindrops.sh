#!/usr/bin/env bash

main() {
  if ! (( $1 % 3 )); then
    result+="Pling"
  fi
  if ! (( $1 % 5 )); then
    result+="Plang"
  fi
  if ! (( $1 % 7 )); then
    result+="Plong"
  fi

  if [[ -z $result ]]; then 
    result=$1
  fi

  echo $result
}

main "$@"

##########################################################

#digit_regex='^-?[0-9]+$'
#
#if (( $# != 1 ))  || ! [[ "$1" =~ $digit_regex ]]; then
#    exit 1
#fi
#
#number=$1
#output=""
#
#if (( $number % 3 == 0 )); then
#    output="Pling"
#fi
#if (( $number % 5 == 0 )); then
#    output+="Plang"
#fi
#if (( $number % 7 == 0 )); then
#    output+="Plong"
#fi
#
#if [[ -z $output ]]; then
#    output="$number"
#fi
#
#echo "$output"

##########################################################

#main() {
#    str=""
#    number="$1"
#
#    (( $number%3 == 0 )) && str+="Pling"
#    (( $number%5 == 0 )) && str+="Plang"
#    (( $number%7 == 0 )) && str+="Plong"
#
#    [[ -z $str ]] && echo "$number" || echo "$str"
#}
#
#main "$@"
