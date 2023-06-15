#/bin/bash

read  -p "Enter two numbers on which operations are to be performed " x y
PS3="Enter operation to be performed "

select operation in "Addition" "Substraction" "Multiplication" "Division" "Exit"
do
	echo "The operation you selected is $operation "
break
done
#echo $operation
if [ "$operation" == "Addition" ] ; then
	echo "$x + $y" |bc 
elif [ "$operation" == "Substraction" ] ; then
	echo "$x - $y" |bc 
elif [ "$operation" == "Multiplication" ] ; then
	echo "$x * $y" |bc 
elif [ "$operation" == "Division" ]; then
	echo "scale=2; $x / $y" |bc 
elif [ "$operation" == "Exit" ];then
	echo "Exiting the program"
fi
