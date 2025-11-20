#!/bin/bash

# CSV file name
file="students.csv"

# Write headers
echo "ID, Name, Course, Year" > "$file"

# Example data as arrays
id=("S001" "S002" "S003" "S004" "S005" "S006" "S007" "S008" "S009" "S010" "S011" "S012" "S013" "S014" "S015")
name=("Alice Smith" "Bob Jones" "Charlie Brown" "Diana Prince" "Ethan Hunt" "Fiona Green" "George Lucas" "Hannah White" "Ian Malcolm" "Julia Roberts" "Kevin Hart" "Laura Palmer" "Mike Ross" "Nina Simone" "Oscar Wilde")
course=("LM121" "LM121" "LM121" "LM051" "LM051" "LM051" "LM097" "LM097" "LM110" "LM110" "LM086" "LM086" "LM051" "LM097" "LM110")
year=(1 1 1 1 1 2 1 2 1 3 1 2 3 4 2)

# Loop through data and append to CSV
for i in "${!id@]}"; do
    echo "${id[i]},${name[i]},${course[i]},${year[i]}" >> "$file"
done