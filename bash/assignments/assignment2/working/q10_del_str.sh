#/bin/bash
read -p "Enter a string " str
read -p "Enter file to be copied " file

sed  "s/${str}//g" "$file" > `echo ${file}.out`
echo "File saved as ${file}.out"
