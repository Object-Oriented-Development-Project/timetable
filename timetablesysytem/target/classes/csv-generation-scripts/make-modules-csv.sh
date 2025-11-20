#!/bin/bash

# CSV file name
file="modules.csv"

# Write headers
echo "Module ID, Lecturer, Student Group, Lecture Hours, Lab Hours, Tutorial hours" > "$file"

# Example data as arrays
id=("CS4141" "CS4012" "CS4221" "ET4011" "MS4111" "CS4142" "CS4182" "CS4222" "ET4012" "MA4052" "CS4013" "CS4101" "CS4115" "CS4182")
lecturer=("L001" "L002" "L003" "L007" "L008" "L001" "L004" "L005" "L007" "L008" "L001" "L002" "L003" "L004")
studentGroup=(120 120 120 120 120 120 120 120 120 120 315 110 95 120)
lectureHours=(2 2 2 2 2 2 2 2 2 2 2 2 2 2)
labHours=(2 1 2 1 0 2 2 2 1 0 2 2 1 2)
tutorialHours=(1 2 0 1 2 1 1 0 1 2 1 1 1 1)
# Loop through data and append to CSV
for i in "${!id@]}"; do
    echo "${id[i]},${lecturer[i]},${studentGroup[i]},${lectureHours[i]},${labHours[i]},${tutorialHours[i]}," >> "$file"
done