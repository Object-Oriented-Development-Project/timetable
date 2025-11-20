#!/bin/bash

# CSV file name
file="rooms.csv"

# Write headers
echo "Room ID, Room Type, Capacity, Building" > "$file"

# Example data as arrays
id=()
type=()
capacity=()
faculty=()

# Loop through data and append to CSV
for i in "${!id@]}"; do
    echo "${id[i]},${type[i]},${capacity[i]},${faculty[i]}" >> "$file"
done