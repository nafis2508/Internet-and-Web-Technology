<?php include('db_connect.php'); ?>

<?php
if(isset($_POST['submit'])){
$Name=$_POST['Name'];
$Username=$_POST['Username'];
$Password=$_POST['Password'];
$Contact=$_POST['Contact'];
$Email=$_POST['Email'];

$query="INSERT INTO customerdetails(Name,Username,Password,Contact,Email)
VALUES('{$Name}','{$Username}','{$Password}','{$Contact}','{$Email}');";
$performQuery=mysqli_query($connection, $query);

if(!$performQuery)
echo 'Submission unsuccessful';
else
echo 'Submission successful';
$insertedId=mysqli_insert_id($connection);
}
?>
<?php include('db_close.php'); ?>