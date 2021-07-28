<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="css/remove.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	<title>update Details</title>
</head>
<body>
	<section class="container-fluid">
		<section class="row justify-content-center bg">
			<section class="col-12 col-sm-6 col-md-3">
				<form class="form-container" action="UpdateInstructor" method="post">
					<section class="header"><h2>Update instructor</h2></section>
					<div class="form-group">
					<input type="number" class="form-control" placeholder="Enter id" id="id" name="id">
					</div>
  					<div class="form-group">
					    <input type="email" class="form-control" placeholder="Enter email" id="email" name="email">
					  </div>
					  <div class="form-group">
					    <input type="number" class="form-control" placeholder="Enter phone" id="phone" name="phone">
					  </div>
					  <div class="form-group">
					    <input type="password" class="form-control" placeholder="Enter password" id="password" name="password">
					  </div>
					  <div class="form-group form-check">
					    <label class="form-check-label">
					      <input class="form-check-input" type="checkbox"> Remember me
					    </label>
					  </div>
					  <button type="submit" class="btn btn-primary btn-block" >Update</button>
					</form>
			</section>
		</section>
		
	</section>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>