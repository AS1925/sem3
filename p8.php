.<?php
// Establish connection to the database
$conn = mysqli_connect("localhost", "root", "", "Company");

// Check connection
if (!$conn) {
    die("Connection failed: " . mysqli_connect_error());
}

// Fetch data from the employee table
$query = "SELECT * FROM employee";
$result = mysqli_query($conn, $query);

echo "<h1>Employee Details</h1>";
echo "<table border='1' cellpadding='10'>";
echo "<tr>";
echo "<th> ID </th>";
echo "<th> Name </th>";
echo "<th> Salary </th>";
echo "</tr>";

// Loop through the results and display them in the table
while ($row = mysqli_fetch_assoc($result)) {
    echo "<tr>";
    echo "<td>" . $row['id'] . "</td>";
    echo "<td>" . $row['name'] . "</td>";
    echo "<td>" . $row['SALARY'] . "</td>";
    echo "</tr>";
}

echo "</table>";

// Close the connection
mysqli_close($conn);
?>