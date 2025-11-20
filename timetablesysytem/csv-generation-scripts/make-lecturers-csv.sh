#!/bin/bash

# CSV file name
file="lecturers.csv"

# Write headers
echo "ID, Name, Faculty" > "$file"

# Example data as arrays
id=()
name=()
faculty=()

# Loop through data and append to CSV
for i in "${!id@]}"; do
    echo "${ID[i]},${Name[i]},${Faculty[i]}" >> "$file"
done