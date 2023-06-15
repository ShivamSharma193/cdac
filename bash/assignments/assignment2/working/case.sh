#/bin/bash

PS3="Select which operation you want to do "
select op in "Make a file" "Display contents" "Copy the file" "Rename the file" "Delete the file" "Exit"
do
	echo -e "You hase selected $op\n"

	case $op in
		"Make a file")
			read -p "Enter a filename " file 
			if [  -f $file ] ; then
				echo -e "File already exists\n"
			else
				read -p "Enter some data " data
				echo "$data" >$file 
#				read tmp
				cat $file 
				echo -e "Sucess\n"
			fi
	;;
		"Display contents")
			read -p "Enter a file name " file
			if [ -f $file ] ; then
				echo "File content start from nextline "
				cat $file
				echo -e "\n File content shown successfully\n"
			else 
				echo -e "File does not exists.\n"
			fi
	;;
		"Copy the file")
			read -p "Enter a source file " sfile
			if [[ -f $sfile && -r $sfile ]] ; then
				read -p "Enter a target file " tfile
				if [ ! -f $tfile ] ; then
					cp $sfile $tfile
					echo -e "$sfile copied to $tfile Successfully\n"
				fi
			else 
				echo -e "Source file does not exist\n"
			fi
	;;
		"Rename the file")
			read -p "Enter a source file " sfile
			if [[ -f $sfile && -r $sfile ]] ; then
				read -p "Enter a target file " tfile
				if [ ! -f $tfile ] ; then
					mv $sfile $tfile
					echo -e "File $sfile renamed to $tfile  Successfully \n"
				fi
			else
				echo -e "Source file does not exist\n"
			fi

	;;
		"Delete the file")
			read -p "Enter a filename " file
			if [ -f $file ] ; then
				if [ -w $file ] ; then
					read -p "Do you want to delete this file : $file (y or n) " ans
					if [ "$ans" = "y" ] ; then
						rm $file
						echo -e "File removed Successfully \n"
					fi
				fi
			else
				echo -e "File does not exist\n"
			fi
	;;
		*)
			echo "Exit"
			break
	;;


	esac

done


