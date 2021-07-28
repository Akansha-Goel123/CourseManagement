<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="css/instructor.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

	<title>Upload Assignment</title>
</head>
<body>
	<section class="container-fluid">
		<section class="row justify-content-center bg">
			<section class="col-12 col-sm-6 col-md-3">
				<form class="form-container" action="UploadAssignment" method="post" enctype="multipart/form-data">
					<section class="header"><h2>Uploading Assignment</h2></section>
					  <div class="form-group">
					    <label for="sub-name">Subect Name:</label>
					    <input type="text" class="form-control" placeholder="Enter Subect Name" id="sub-name" name="sub-name">
					  </div>
					  <div class="form-group">
					    <input type="file" class="form-control"  id="file" name="file" value="chose file">
					  </div>
					  <div class="form-group form-check">
					    <label class="form-check-label">
					      <input class="form-check-input" type="checkbox"> Remember me
					    </label>
					  </div>
					  <button type="submit" class="btn btn-primary btn-block" >Upload File</button>
					</form>
			</section>
		</section>
		
	</section>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>