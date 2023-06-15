#/bin/bash

# Check whether today is a working day or not
# Working day - Mon-Fri
day=`date +%A`

if [[ "$day"="Saturday" || "$day"="Sunday" ]]; then
    echo "It is not a working day"
fi

