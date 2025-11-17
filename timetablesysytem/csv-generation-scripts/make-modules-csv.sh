#!/bin/bash

# CSV file name
file="modules.csv"

# Write headers
echo "id, lecturer, students, lecture hours, lab hours, tutorial hours" > "$file"

# Example data as arrays
id=()
lecturer()
studentGroup=()
lectureHours=()
labHours=()
tutorialHours=()
# Loop through data and append to CSV
for i in "${!names[@]}"; do
    echo "${id[i]},${lecturer[i]},${studentGroup[i]},${lectureHours[i]},${labHours=()[i]},${tutorialHours[i]}," >> "$file"
done