#/bin/bash

read -p "Enter a filename " file
read -p "Enter an integer " x

head -n $x  ${file}

if  test -f "$file"  ;then
	echo "File exists"
else
	echo "File does not exist"
fi

if [ -r "$file" ] ; then
	echo "File is readable"
else 
	echo "File is not readable"
fi

#f_len=${#file}
#line=`wc -l $file`
#echo $f_len
#echo ${{line:$f_len}}
