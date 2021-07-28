<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Home</title>
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
	.bgimage{
		background-image: url("image/bg.jpg");
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

			
			<a href="#" class="brand-logo">	COURSE MANAGEMENT</a>
			<ul id="nav-mobile" class="right hide-on-med-and-down">
				<li><a href="home.jsp"><i class="material-icons left">home</i>Home</a></li>
				<li><a href="adminLogin.jsp"><i class="material-icons left">account_circle</i>Admin</a></li>
				<li><a href="instructorLogin.jsp"><i class="material-icons left">accessibility</i>Instructor</a></li>
				<li><a href="studentLogin.jsp"><i class="material-icons left">person</i>Student</a></li>
			</ul>
			</div>
		</div>
	</nav>
	<!--end of navbar-->
	
	 <ul id="slide-out" class="sidenav">
    <li><div class="user-view">
      <div class="bgimage">
      </div>
      <a href="#user"><img class="circle" src="image/nav.jpg"></a>
      <a href="#name"><span class="black-text name">Course Management</span></a>
      <a href="#email"><span class="black-text email">courseMgt@gmail.com</span></a>
    </div></li>
		<li><a href="#!"><i class="material-icons">home</i>Home</a></li>
		<li><a href="#!"><i class="material-icons">account_circle</i>Admin</a></li>
		<li><a href="#!"><i class="material-icons">accessibility</i>Instructor</a></li>
		<li><a href="#!"><i class="material-icons">person</i>Student</a></li>
		<li><div class="divider"></div></li>
		<li><a class="subheader">Social Links</a></li>
		<li><a class="waves-effect" href="#!">Facebook</a></li>
		<li><a class="waves-effect" href="#!">Instagram</a></li>
		<li><a class="waves-effect" href="#!">Linked In</a></li>
	</ul>
	<!--section 1-->
	<section>
	<div class="parallax-container">
      <div class="parallax"><img src="image/third.png"></div>
      </div>
	</section>
	<!--end of section 1-->
	
	<!--section 2-->
	<section>
	<div class="container">
		<h4 class="center-align"><b>Welcome To Online Course Management</b></h4>
		<div class="row" style="margin-top:20px;">
			<div class="col s12 m4">
				<div class="service-container center-align">
				<i class="material-icons my-icon">laptop_mac</i>
					<h5>Learn Anything Online</h5>
					<p>A great place for learning</p>
				</div>
			</div>
			<div class="col s12 m4">
				<div class="service-container center-align">
				<i class="material-icons my-icon">description</i>
					<h5>Expert Instruction</h5>
					<p>Be an achiever with good education</p>
				</div>
			</div>
			<div class="col s12 m4">
				<div class="service-container center-align">
				<i class="material-icons my-icon">event_note</i>
					<h5>Best Teaching Platform</h5>
					<p>Having the best place for education</p>
				</div>
			</div>
		</div>
	</div>
	</section>
	
	<!--end of section 2-->
	
	<!--section 3-->
	<section style="background: url(image/fourth.jpg); background-size: cover; background-attachment: fixed;">
	<div class="container text-center">
		<h4 class="center-align white-text" style="padding-top: 30px;"><b>About Us</b></h4>
		<p class="white-text"> A Course Management System is a collection of software tools providing an online environment for course interactions.It is a platform 
			of educational software allowing instructors and institutions to manage a variety of courses with a large number of students and multiple instructional
			materials. It typically includes a variety of online tools and environment, such as:<br>
			<ol class="white-text">
				<li>An area for faculty posting of class materials such as course syllabus and handouts.</li>
				<li>An area for students posting of papers and other assignments.</li>
				<li>A gradebook where faculty can record grades and each student can view his or her grades.</li>
			</ol> <a href="#" class="purple-text">read more...</a></p>
		</div>
	
	</section>
	<!--end of section 3-->
	
	<!--section 4-->
	<section>
	<div class="container">
		<div class="row">
			<div class="col s12 m6" style="padding-top: 15px";>
				<img src="image/fifth.jpg" class="responsive-img" alt="">
			</div>
			
			<div class="col s12 m6">
				<ul class="collapsible">
					<li>
						<div class="collapsible-header"><i class="material-icons">filter_drama</i>About Us</div>
						<div class="collapsible-body">
						<p> A Course Management System is a collection of software tools providing an online environment for course interactions.It is a platform 
						of educational software allowing instructors and institutions to manage a variety of courses with a large number of students and multiple instructional
						materials. It typically includes a variety of online tools and environment, such as:<br>
						<ol>
						<li>An area for faculty posting of class materials such as course syllabus and handouts.</li>
						<li>An area for students posting of papers and other assignments.</li>
						<li>A gradebook where faculty can record grades and each student can view his or her grades.</li>
						</ol> <a href="#" class="purple-text">read more...</a></p></div>
					</li>
					<li>
						<div class="collapsible-header"><i class="material-icons">place</i>Our Mission</div>
						<div class="collapsible-body"><span>Our aim everyone gets an education</span></div>
					</li>
					<li>
						<div class="collapsible-header"><i class="material-icons">contacts</i>Contact Us</div>
						<div class="collapsible-body"><span>Address: Ghaziabad, Uttar Pradesh</span></div>
					</li>
				</ul>
			</div>
		</div>
	</div>
		
	</section>
	<!--end of section 4-->
	
	<div class="divider">
	
	</div>
	<!--feedback section-->

	<div class="container">
		<div class="row">
			<div class="col s12 m6 offset-m3 offset-l3">
				<div class="card">
					<div class="card-content">
						<h4>Feedback</h4>
						<div class="row">
							<form class="col s12" action="FeedbackForm" method="post">
								<div class="row">
									<div class="input-field col s6">
										<i class="material-icons prefix">account_circle</i>
										<input id="icon_prefix" type="text" class="validate" name="name">
										<label for="icon_prefix">Enter Name</label>
									</div>
									<div class="input-field col s6">
										<i class="material-icons prefix">phone</i>
										<input id="icon_telephone" type="number" class="validate" name="phone">
										<label for="icon_telephone">Enter Phone</label>
									</div>
									<div class="input-field col s12">
										<i class="material-icons prefix">mode_edit</i>
										<textarea id="icon_prefix2" class="materialize-textarea" type="text" name="feedback"></textarea>
										<label for="icon_prefix2">Enter Your Feedback</label>
									</div>
									
									<div class="container center-align">
										<button class="btn main"> Submit</button>
									
									</div>
									
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!--end of feedback section-->
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
			$('.collapsible').collapsible();
		});

	</script>
</body>
</html>