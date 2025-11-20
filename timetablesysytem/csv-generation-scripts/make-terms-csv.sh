#!/bin/bash

# CSV file name
file="terms.csv"

# Write headers
echo "id, module, lecturer, students, year" > "$file"

# Example data as arrays
module=()
lecturer()
students=()
year()

# Loop through data and append to CSV
for i in "${!id@]}"; do
    echo "${id[i]},${module[i]},${lecturer[i]},${students[i]},${year[i]}" >> "$file"
done