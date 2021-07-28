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
</head>
<body>
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
	</body>
	</html>