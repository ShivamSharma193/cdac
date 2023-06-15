#!/bin/bash

exit=0 # 0 means true anything else is false
while ( exit $exit )
do 
echo ""
read -p  "0.  Exit 1. Hollow Diamond 2. Hollow Pyramid 3. Hollow Triangle " i
echo ""
case $i in
    "0")
        exit=1 
    ;;
    1)

    # Hollow Diamond -------------------------------
        read -p "Number mid row " n

        for ((i=0;i<n;i++))  #Upper
        do
        	for ((j=0;j<2*n-1;j++ )) 
            do
               if [[ $j = $((n-i-1)) || $j = $((n+i-1)) ]]  # For boundary
               then
                   echo -n "*"
               else
                   echo -n " "
               fi
           done
           echo ""
        done
        for ((i=n-2;i>=0;i--))  # Lower
        do
        	for ((j=0;j<2*n-1;j++ ))
        	            do
               if [[ $j = $((n-i-1)) || $j = $((n+i-1)) ]] # For boundary
               then
                   echo -n "*"
               else
                   echo -n " "
               fi
           done
           echo ""
        done
    ;;


    "2")
    # Hollow Pyramid ---------------------------------
        read -p "Rows " rows
        for ((i=0;i<rows-1;i++))
        do
        	for ((j=0;j<2*rows-1;j++ ))  
        	do
        		if [[ $j = $((rows-i-1)) || $j = $((rows+i-1)) ]]  #For boundary
        		then
        			echo -n "*"
        		else
        			echo -n " "
        		fi
        	done
        	echo ""
        done
        for ((j=0;j<rows;j++))
        do
        	echo -n "* "
        done
    ;;
    "3")
    #Hollow Triangle ---------------------------------
        read -p "Rows " rows
        for (( i=0 ; i<rows ; i++))
        do
		        if [[ $i = 0 ]]
		        then
           		for (( j=0 ; j<rows-i ; j++ ))
            		do
				        echo -n "*"
			        done
		        else
		            for (( j=0 ; j<rows-i ; j++ ))
		            do

				        if [[ $j != 0 && $j != $(($rows-$i-1)) ]]
				        then
					        echo -n " "
				        else
					        echo -n "*"
				        fi
			        done
		        fi
	        echo ""
        done
    ;;
	esac
done
