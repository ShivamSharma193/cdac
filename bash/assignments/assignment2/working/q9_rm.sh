#/bin/bash

read -p "Enter filename " file
cp $file /home/user1/backup/${file}.backup
rm $file
