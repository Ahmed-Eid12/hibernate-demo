<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Student</title>
</head>
<body>
	<h1 style="text-align: center">Adding new Student</h1>
	<div class="content">
		<form action="StudentServlet" class="form" method="POST">
			<div class="form-content" style="text-align: center">
				<div class="name">
					<input type="text" placeholder="Student Name" name="studentName" id="studentName">
				</div>
				<div class="radio">
					<input type="radio" placeholder="Gender" name="gender" value="male" id="gender">Male
					<input type="radio" placeholder="Gender" name="gender" value="female" id="gender">Female
				</div>
				<div class="date">
					<input type="text" placeholder="Date Of Birth" name="DateOfBirth" id="DateOfBirth">
				</div>
				<div class="address">
					<input type="text" id="address" placeholder="Address" name="address">
				</div>
				<div class="email">
					<input type="email" id="email" placeholder="Email" name="email">
				</div>
				<div class="password">
					<input type="password" id="password" placeholder="Password" name="password">
				</div>
				<div class="studentSchool">
					<input type="text" id="studentSchool" placeholder="Student School" name="studentSchool">
				</div>
			
				<div class="submit">
					<input type="submit" value="Save" id="submit">
				</div>
			</div>
		</form>
	</div>
</body>
</html>