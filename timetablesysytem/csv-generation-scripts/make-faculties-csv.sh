#!/bin/bash

# CSV file name
file="faculties.csv"

# Write headers
echo "Faculty ID, Building" > "$file"

# Example data as arrays
id=("CSIS" "ENG" "SCI")
name=("Computer Science and Information Systems" "Engineering" "Science")
building=("CSG" "EG" "KBG")

# Loop through data and append to CSV
for i in "${!id@]}"; do
    echo "${id[i]},${name[i]},${faculty[i]}" >> "$file"
done