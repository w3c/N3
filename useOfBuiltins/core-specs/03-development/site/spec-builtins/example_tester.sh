#!/bin/bash

FILE=$1

if [ "${FILE}" == "" ]; then
    echo "usage: $0 file"
    exit 1 
fi

TMPFILE=${TMPDIR}/n3.test.$$

eye --quiet --nope --pass example_tester.n3 ${FILE} > ${TMPFILE} 2> /dev/null

if [ $? -eq 0 ]; then
    echo "OK : ${FILE} : syntax valid"
else
    echo "ERROR : ${FILE} : syntax not valid"
    exit 2
fi

grep ":examples :valid true." ${TMPFILE} > /dev/null 2>&1 

if [ $? -eq 0 ]; then
    echo "OK : ${FILE} : example valid"
else
    echo "ERROR : ${FILE} : example not valid"
    exit 3
fi

rm $TMPFILE
