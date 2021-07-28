<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="css/course.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

	<title>Create course</title>
</head>
<body>
		<section class="container">
			<section class="row bgstu">
				<section class="col-12 col-sm-6 col-md-3">
					<form class="form-deep-tech" action="CreateCourse" method="post">
						<div>
							<label for="selectcou" style="margin-right: 10px;">Courses</label>
							<select name="course">
								<option>Select Course</option>
								<option>Btech Computer Science</option>
								<option>Btech Information Technology</option>
								<option>Btech Electrical Engineering</option>
								<option>Btech Civil Engineering</option>
								<option>Btech Mechnical Engineering</option>
								<option>Btech Artifical Engineering</option>
								<option>Btech Electrical & Electroanic Engineering</option>
								<option>Master In Computer Application</option>
								<option>Masters In Bussiness Adminstration</option>
								<option>Bachelor In Computer Application</option>
								<option>Bachelor In Bussiness Adminstration</option>
							</select>
						</div>
						<br>
						<div>
							<label for="year" style="margin-right: 20px;">Select Year</label>
							<select name="year">
								<option>Select Year</option>
								<option>sem1 year1 </option>
								<option>sem2 year1</option>
								<option>sem3 year2 </option>
								<option>sem4 year2</option>
								<option>sem5 year3</option>
								<option>sem6 year3</option>
								<option>sem7 year4</option>
								<option>sem8 year4 </option>
							</select>
						</div>
						<br>
						<div>
							<label for"subject1" style="margin-right: 30px;">Subject 1</label>
							<input type="text" name="sub1" placeholder="Please Enter Subject name">
						</div>
						<br>
						<div>
							<label for"subject2" style="margin-right: 30px;">Subject 2</label>
							<input type="text" name="sub2" placeholder="Please Enter Subject name">
						</div>
						<br>
						<div>
							<label for"subject3" style="margin-right: 30px;">Subject 3</label>
							<input type="text" name="sub3" placeholder="Please Enter Subject name">
						</div>
						<br>
						<div>
							<label for"subject4" style="margin-right: 30px;">Subject 4</label>
							<input type="text" name="sub4" placeholder="Please Enter Subject name">
						</div>
						<br>
						<div>
							<label for"subject5" style="margin-right: 30px;">Subject 5</label>
							<input type="text" name="sub5" placeholder="Please Enter Subject name">
						</div>
						<br>
						
						<br>
						<div>
							
							<h2 align="justify-content:center"></h2><input type="submit" value="ADD COURSE" class="btn btn-success" style="float: left; margin-left: 20px;"></h2>							
							<h2 align="justify-content:center"></h2><a href=""><input type="submit" value="CANCEL" class="btn btn-success" style="float: center; margin-left: 50px;"></h2>
							
						</div>
					</form>
				</section>
			</section>
		</section>
	
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>