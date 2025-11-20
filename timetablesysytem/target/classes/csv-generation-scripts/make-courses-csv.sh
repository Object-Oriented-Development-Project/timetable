#!/bin/bash

# CSV file name
file="courses.csv"

# Write headers
echo "Course ID, No. Years, Student Group, Faculty" > "$file"

# Example data as arrays
id=("LM121" "LM051" "LM097" "LM110" "LM086")
numberOfYears=(1 4 4 4 2)
students=(120 110 95 105 45)
faculty=("CSIS" "CSIS" "CSIS" "CSIS" "CSIS")

# Loop through data and append to CSV
for i in "${!id@]}"; do
    echo "${id[i]},${numberOfYears[i]},${students[i]},${faculty[i]}" >> "$file"
done