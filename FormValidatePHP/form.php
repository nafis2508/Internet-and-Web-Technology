<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<h3>Registration Form</h3>
<form action="index.php" method="post" >
<label for="Name">Name: </label>
<input type="text" name="Name" id="Name" required><br><br>

<label for="Username">Username: </label>
<input type="text" name="Username" id="Username" required><br><br>

<label for="Password">Password: </label>
<input type="text" name="Password" id="Password" required><br><br>

<label for="Re-type Password">Re-type password: </label>
<input type="text" name="Re-type password" id="Re-type password" required><br><br>

<label for="Gender">Gender: </label>
<input type="radio" id="Gender" name="Gender">Male
<input type="radio" id="Gender" name="Gender">Female
<input type="radio" id="Gender" name="Gender">Other <br><br>

<label for="Contact">Contact No: </label>
<input type="text" name="Contact" id="Contact" required><br><br>


<label for="Email">Email: </label>
<input type="email" name="Email" id="Email" required><br><br>

<button type="submit" name="submit" >submit </button>
<button type="reset" name="Cancel" >cancel </button>
</form>
</body>
</html>