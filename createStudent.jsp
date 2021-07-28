<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="css/global.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

	<title>Login</title>
</head>
<body>
	<section class="container-fluid">
		<section class="row  bgstu">
			<section class="col-12 col-sm-6 col-md-3">
				<form class="form-deep-tech" action="StudentRegister" method="post">
					<section class="success text-center"><h2 class="success">Register Student</h2></section>
  					<div class="form-group">
				
					    <input type="text" class="form-control" placeholder="Enter  Name" required="required" id="fNamel" name="name">
					  </div>
					   <div class="form-group">
					    <input type="email" class="form-control" placeholder="Enter email" required="required" id="email" name="email">
					  </div>
					  <div class="form-group">
					    <input type="number" class="form-control" placeholder="Enter phone" required="required" id="phone" name="phone">
					  </div>
					  <div class="form-group">
					    <input type="text" class="form-control" placeholder="Enter User Name" required="required"id=username" name="username">
					  </div>
					  <div class="form-group">
					    <input type="text" class="form-control" placeholder="Enter address" required="required"id="address" name="address">
					  </div>
					  <div class="form-group">
					    <input type="password" class="form-control" placeholder="Enter password" required="required" id="pwd" name="password">
					  </div>
					  	<div class="form-group">
					    <input type="text" class="form-control" placeholder="Enter Department" required="required" id="department" name="department">
					  </div>
					  <div class="form-group form-check">
					    <label class="form-check-label">
					      <input class="form-check-input" type="checkbox"> Remember me
					    </label>
					  </div>
					  <button type="submit" class="btn btn-primary btn-block" >Login</button>
					</form>
			</section>
		</section>
		
	</section>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>