#!/bin/bash

read r0
r1=true
for ((r2 = $r0-2; r2 > 1; r2 -= 2)); do
	r3=$r0
	while [[ r3 -gt 0 ]]; do
		r3=$(($r3-$r2))
	done
	if [[ r3 -eq 0 ]]; then
		r1=false
	fi
done
echo $r1
read r7