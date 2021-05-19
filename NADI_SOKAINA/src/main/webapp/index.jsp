<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="style/NewFile.css">
<link href="css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<script
	src="https://cdn.jsdelivr.net/jquery.validation/1.15.1/jquery.validate.min.js"></script>
<link href="https://fonts.googleapis.com/css?family=Kaushan+Script"
	rel="stylesheet">
<link
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet"
	integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN"
	crossorigin="anonymous">
<title>welcome bibliotheque</title>
</head>
<body>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-5 mx-auto">
				<div id="first">
					<div class="myform form ">
						<div class="logo mb-3">
							<div class="col-md-12 text-center">
								<h1>Login</h1>
							</div>
						</div>
						<form action="testsev" method="post">
							<div class="form-group">
								<label for="exampleInputEmail1"><h2>Email address</h2></label> <input
									type="email" name="log" class="form-control" id="email"
									aria-describedby="emailHelp" placeholder="Enter email">
							</div>
							<div class="form-group">
								<label for="exampleInputEmail1"><h2>Password</h2></label> <input
									type="password" name="pass" id="password" class="form-control"
									aria-describedby="emailHelp" placeholder="Enter Password">
							</div>

							<div class="col-md-12 text-center ">
								<button type="submit"
									class=" btn btn-block mybtn btn-primary tx-tfm">Login</button>
							</div>


						</form>

					</div>
				</div>
				<br />
				<br />
				<div id="second">
					<div class="myform form ">
						<div class="logo mb-3">
							<div class="col-md-12 text-center">
								<h1>Signup</h1>
							</div>
						</div>
						<form action="addStudent" method="post">
							<div class="form-group">
								<label for="exampleInputEmail1"><h2>Full Name</h2></label> <input
									type="text" name="full_name" class="form-control"
									id="firstname" aria-describedby="emailHelp"
									placeholder="Enter Firstname">
							</div>
							<div class="form-group">
								<label for="exampleInputEmail1"><h2>Email address</h2></label> <input
									type="email" name="log" class="form-control" id="email"
									aria-describedby="emailHelp" placeholder="Enter email">
							</div>
							<div class="form-group">
								<label for="exampleInputEmail1"><h2>Password</h2></label> <input
									type="password" name="pass" id="password" class="form-control"
									aria-describedby="emailHelp" placeholder="Enter Password">
							</div>
							<div class="col-md-12 text-center mb-3">
								<button type="submit"
									class=" btn btn-block mybtn btn-primary tx-tfm">Get
									Started For Free</button>
							</div>
					</div>
					</form>

				</div>
			</div>
		</div>
	</div>

</body>
</body>
</html>