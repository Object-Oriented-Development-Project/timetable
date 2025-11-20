file="admins.csv"

# Write headers
echo "ID , e-mail , Password" > "$file"

# Example data as arrays
id=("0001")
email=("admin@ul.ie")
password=("adminULdotIE")

# Loop through data and append to CSV
for i in "${!id[@]}"; do
    echo "${id[i]},${email[i]},${password[i]}" >> "$file"
done