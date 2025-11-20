#!/bin/bash

# CSV file name
file="students.csv"

# Write headers
echo "ID, Name, Course, Year" > "$file"

# Example data as arrays
id=()
name=()
course=()
year=()

# Loop through data and append to CSV
for i in "${!id@]}"; do
    echo "${id[i]},${name[i]},${course[i]},${year[i]}" >> "$file"
done