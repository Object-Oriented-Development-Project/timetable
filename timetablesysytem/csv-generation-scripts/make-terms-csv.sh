#!/bin/bash

# CSV file name
file="terms.csv"

# Write headers
echo "MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY" > "$file"

# Example data as arrays
MONDAY=()
TUESDAY=()
WEDNESDAY=()
THURSDAY=()
FRIDAY=()

# Loop through data and append to CSV
for i in "${!id@]}"; do
    echo "${id[i]},${module[i]},${lecturer[i]},${students[i]},${year[i]}" >> "$file"
done