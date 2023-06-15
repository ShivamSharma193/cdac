#/bin/bash

read -p "Enter an Integer " x
echo -n "The factorial of $x is "
fact=$x

while [ $x -gt 1 ]
do
    fact=`echo "$fact*($x-1)" | bc`
    x=$(( x-1 ))
done
echo  $fact


