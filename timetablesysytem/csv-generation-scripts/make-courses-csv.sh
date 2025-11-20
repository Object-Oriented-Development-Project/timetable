#!/bin/bash

# CSV file name
file="courses-list.csv"

# Write headers
echo "Course ID, No. Years, Student Group, Faculty" > "$file"

# Example data as arrays
id=()
numberOfYears=()
students=()
faculty=()

# Loop through data and append to CSV
for i in "${!id@]}"; do
    echo "${id[i]},${numberOfYears[i]},${students[i]},${faculty[i]}" >> "$file"
done