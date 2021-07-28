<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Instructor</title>
	<!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
	
	<!-- Icon link-->
	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
	
	<style>
	.main{
		background-image: linear-gradient(to right, #23074d, #cc5333);
	}
	.my-icon{
		font-size: 50px;
	}
	.service-container{
		border: .5px solid #23074d;
		padding: 20px;
		cursor: pointer;
		transition: 200ms all ease-in-out;
	}
	.service-container:hover{
		background: black;
		color: white;
		border-radius: 20px;
	}
	.foot{
		display: inline-block;
		margin-left: 20px;
	}
	</style>
</head>

<body>

 
 
	<!--navbar-->
	
	<nav class="main">
		<div class="container">
		
			<div class="nav-wrapper">
				<a href="#" data-target="slide-out" class="sidenav-trigger"><i class="material-icons">menu</i></a>

			
			<a href="#" class="brand-logo">	INSTRUCTOR DASHBOARD</a>
			<ul id="nav-mobile" class="right hide-on-med-and-down">
				<li><a class="dropdown-trigger" href="uploadAssignment.jsp">Add Assignment<i class="material-icons left">assignment</i></a></li>
				<li><a class="dropdown-trigger" href="assignGrades.jsp">Assign Grades<i class="material-icons left">grade</i></a></li>
				<li><a class="dropdown-trigger" href="uploadNotes.jsp">Notes<i class="material-icons left">note</i></a></li>
				<li><a href="instructorLogout.jsp"><i class="material-icons left">account_circle</i>Log Out</a></li>	
				
			</ul>
			</div>
		</div>
	</nav>
	<!--end of navbar-->
	
	 <ul id="slide-out" class="sidenav">
    <li><div class="user-view">
      <div class="background">
        <img src="image/bg.jpg">
      </div>
      <a href="#user"><img class="circle" src="image/icon.png"></a>
      <a href="#name"><span class="black-text name">Welcome Instructor</span></a>
      <a href="#email"><span class="black-text email">ins222@gmail.com</span></a>
    </div></li>
		<li><a href="#!"><i class="material-icons">accessibility</i><b>Instructor</b></a></li>
		<li><a href="#!"><i class="material-icons">home</i>Home</a></li>
		<li><a href="#!"><i class="material-icons">person</i>Student</a></li>
		<li><a href="#!"><i class="material-icons">school</i>Courses</a></li>
		<li><a href="#!"><i class="material-icons">assignment</i>Assignment</a></li>
		<li><div class="divider"></div></li>
		<li><a class="subheader">Social Links</a></li>
		<li><a class="waves-effect" href="#!">Facebook</a></li>
		<li><a class="waves-effect" href="#!">Instagram</a></li>
		<li><a class="waves-effect" href="#!">Linked In</a></li>
	</ul>
	
	<!--section 1-->
	<section>
	<div class="parallax-container">
      <div class="parallax"><img src="image/instructor.jpg"></div>
	</section>
	<!--end of section 1-->
	
	<!--section 2-->
	<section>
	<div class="container">
		<div class="row" style="margin-top:20px";>
			<div class="col s12 m4">
				<div class="service-container center-align">
				<i class="material-icons my-icon">border_color</i>
					<h5>Manage Student Grades</h5>
					<p>To improve the effectiveness and maintain record the student's performance on daily basis.</p>
				</div>
			</div>
			<div class="col s12 m4">
				<div class="service-container center-align">
				<i class="material-icons my-icon">mode_edit</i>
					<h5>Manage Test Report</h5>
					<p>To manage test report of students on monthly basis and measure their performance. </p>
				</div>
			</div>
			<div class="col s12 m4">
				<div class="service-container center-align">
				<i class="material-icons my-icon">event</i>
					<h5>Manage Activities</h5>
					<p>Managing extra curriculum activities and make a report for increasing the motivation in students.</p>
				</div>
			</div>
		</div>
	</div>
	
	</section>
	
	<!--end of section 2-->
	
	<!--footer section-->
	<footer class="page-footer main">
          <div class="container">
            <div class="row">
              <div class="col s12 m6">
                <h5 class="white-text">Website Of Course Management</h5>
                <p class="grey-text text-lighten-4">Our Only Concern Is Your Education</p>
				</div>
				<div class="col s12 m6">
				<ul style="float:right";>
					<li class="foot"><a class="grey-text text-lighten-4 right" href="#!"><i class="fa fa-twitter-square" aria-hidden="true"></i></a></li>
					<li class="foot"><a class="grey-text text-lighten-4 right" href="#!"><i class="fa fa-linkedin" aria-hidden="true"></i></a></li>
					<li class="foot"><a class="grey-text text-lighten-4 right" href="#!"><i class="fa fa-instagram" aria-hidden="true"></i></a></li>
					<li class="foot"><a class="grey-text text-lighten-4 right" href="#!"><i class="fa fa-facebook-official" aria-hidden="true"></i></a></li>
					<li class="foot"><a class="grey-text text-lighten-4 right" href="#!"><i class="fa fa-google" aria-hidden="true"></i></a></li>
				</ul>
              </div>
              
            </div>
          </div>
          <div class="footer-copyright">
            <div class="container">
            © 2021 Website Designed By Akansha & Himanshu
			</div>
          </div>
        </footer>
            
	
	<!--end of footer section-->
	
	<script
	src="https://code.jquery.com/jquery-3.5.1.min.js"
	integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0="
	crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

  
	<script>
	<!--JQuery-->
	
	   $(document).ready(function(){
			$('.sidenav').sidenav({
				edge: 'right'
			});
			
			$('.parallax').parallax();
			$(".dropdown-trigger").dropdown();
		});

	</script>
</body>
</html>