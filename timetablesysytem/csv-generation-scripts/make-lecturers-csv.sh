#!/bin/bash

# CSV file name
file="lecturers.csv"

# Write headers
echo "id, name, faculty" > "$file"

# Example data as arrays
id=()
name=()
faculty=()

# Loop through data and append to CSV
for i in "${!id@]}"; do
    echo "${id[i]},${name[i]},${faculty[i]}" >> "$file"
done