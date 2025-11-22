#!/bin/bash

# Target CSV file
file="terms.csv"

# Write headers
echo "Day, Time, Module Code, Class Type, Room, Lecturer, Course, Year, Term" > "$file"

# Example data as arrays
day=("MON" "MON" "MON" "MON" "MON" "MON" "MON" "MON" "MON" "MON" "MON" "MON" "TUE" "TUE" "TUE" "TUE" "TUE" "TUE" "TUE" "TUE" "TUE" "TUE" "TUE" "TUE" "WED" "WED" "WED" "WED" "WED" "WED" "WED" "WED" "WED" "WED" "WED" "WED" "THU" "THU" "THU" "THU" "THU" "THU" "THU" "THU" "THU" "THU" "THU" "THU" "FRI" "FRI" "FRI" "FRI" "FRI" "FRI" "FRI" "FRI" "FRI" "FRI" "FRI" "FRI")

time=("09:00-10:00" "10:00-12:00" "10:00-12:00" "12:00-13:00" "13:00-15:00" "13:00-15:00" "15:00-16:00" "15:00-17:00" "15:00-17:00" "16:00-17:00" "16:00-18:00" "16:00-18:00" "09:00-11:00" "09:00-11:00" "09:00-11:00" "11:00-12:00" "11:00-13:00" "13:00-14:00" "13:00-15:00" "14:00-15:00" "15:00-17:00" "15:00-17:00" "16:00-18:00" "16:00-18:00" "09:00-10:00" "09:00-11:00" "10:00-11:00" "11:00-13:00" "11:00-13:00" "13:00-14:00" "13:00-15:00" "14:00-15:00" "15:00-17:00" "15:00-17:00" "16:00-18:00" "16:00-18:00" "09:00-11:00" "09:00-11:00" "09:00-11:00" "11:00-12:00" "11:00-13:00" "12:00-13:00" "13:00-15:00" "13:00-15:00" "15:00-16:00" "15:00-17:00" "16:00-17:00" "16:00-18:00" "09:00-10:00" "09:00-11:00" "10:00-11:00" "11:00-13:00" "11:00-13:00" "13:00-14:00" "13:00-15:00" "14:00-15:00" "15:00-17:00" "15:00-17:00" "16:00-17:00" "16:00-18:00")

moduleCode=("CS4141" "CS4012" "ET4011" "CS4141" "CS4221" "ET4011" "CS4012" "CS4012" "MS4111" "MS4111" "CS4221" "CS4141" "CS4142" "CS4182" "ET4012" "CS4142" "MA4052" "CS4182" "CS4222" "MA4052" "CS4142" "ET4012" "CS4182" "CS4222" "CS4013" "CS4101" "CS4013" "CS4115" "CS4101" "CS4115" "CS4013" "CS4101" "CS4013" "CS4115" "CS4101" "CS4115" "CS4142" "CS4222" "ET4012" "ET4012" "MA4052" "CS4222" "CS4182" "CS4142" "CS4182" "CS4222" "MA4052" "CS4142" "ET4011" "MS4111" "ET4011" "CS4012" "CS4221" "CS4221" "CS4012" "CS4141" "MS4111" "ET4011" "CS4141" "CS4221")

classType=("tutorial" "lecture" "lecture" "tutorial" "lecture" "lab" "tutorial" "lab" "lecture" "tutorial" "lab" "lab" "lecture" "lecture" "lecture" "tutorial" "lecture" "tutorial" "lecture" "tutorial" "lab" "lab" "lab" "lab" "lecture" "lecture" "tutorial" "lecture" "lab" "tutorial" "lab" "tutorial" "tutorial" "lab" "lab" "tutorial" "lecture" "lecture" "lecture" "tutorial" "lecture" "tutorial" "lecture" "lab" "tutorial" "lab" "tutorial" "tutorial" "lecture" "lecture" "tutorial" "lecture" "lecture" "tutorial" "tutorial" "tutorial" "tutorial" "tutorial" "lab" "tutorial")

room=("CSG027" "CSG001" "CSG028" "CSG027" "CSG001" "EG002" "CSG028" "CS1044" "CSG029" "CSG027" "CS2044" "CS1045" "CSG001" "CSG028" "CSG029" "CSG027" "KBG12" "CSG028" "CSG001" "CSG027" "CS1044" "EG002" "CS2044" "CS3005b" "KBG12" "CSG001" "CSG027" "CSG028" "CS1044" "CSG029" "CS2044" "CSG027" "CSG028" "CS1045" "CS3005b" "CSG029" "CSG001" "CSG028" "CSG029" "CSG027" "KBG12" "CSG027" "CSG028" "CS1044" "CSG027" "CS2044" "CSG028" "CSG029" "CSG028" "CSG029" "CSG027" "CSG001" "CSG001" "CSG027" "CSG028" "CSG027" "CSG029" "CSG027" "CSG028" "CSG027")

lecturer=("L001" "L002" "L007" "L001" "L003" "L007" "L002" "L002" "L008" "L008" "L003" "L001" "L001" "L004" "L007" "L001" "L008" "L004" "L005" "L008" "L001" "L007" "L004" "L005" "L001" "L002" "L001" "L003" "L002" "L003" "L001" "L002" "L001" "L003" "L002" "L003" "L001" "L005" "L007" "L007" "L008" "L005" "L004" "L001" "L004" "L005" "L008" "L001" "L007" "L008" "L007" "L002" "L003" "L003" "L002" "L001" "L008" "L007" "L001" "L003")

course=("LM121" "LM121" "LM121" "LM121" "LM121" "LM121" "LM121" "LM121" "LM121" "LM121" "LM121" "LM121" "LM121" "LM121" "LM121" "LM121" "LM121" "LM121" "LM121" "LM121" "LM121" "LM121" "LM121" "LM121" "LM051" "LM051" "LM051" "LM051" "LM051" "LM051" "LM097" "LM097" "LM110" "LM110" "LM110" "LM110" "LM121" "LM121" "LM121" "LM121" "LM121" "LM121" "LM121" "LM121" "LM121" "LM121" "LM121" "LM121" "LM121" "LM121" "LM121" "LM121" "LM121" "LM121" "LM121" "LM121" "LM121" "LM121" "LM121" "LM121")

year=(1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1)

term=(1 1 1 1 1 1 1 1 1 1 1 1 2 2 2 2 2 2 2 2 2 2 2 2 1 1 1 1 1 1 1 1 1 1 1 1 2 2 2 2 2 2 2 2 2 2 2 2 1 1 1 1 1 1 1 1 1 1 1 1)

# Loop through data and append to CSV
for i in "${!day[@]}"; do
    echo "${day[i]},${time[i]},${moduleCode[i]},${classType[i]},${room[i]},${lecturer[i]},${course[i]},${year[i]},${term[i]}" >> "$file"
done