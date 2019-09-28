<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>School</title>
</head>
<body>
	<h1 style="text-align: center">Adding new School</h1>
	<div class="content">
		<form action="" class="form" method="POST">
			<div class="form-content" style="text-align: center">
				<div class="name">
					<input type="text" placeholder="School Name" name="schoolName" id="schoolName">
				</div>
				<div class="address">
					<input type="text" id="address" placeholder="Address" name="Address">
				</div>
				<div class="email">
					<input type="email" id="email" placeholder="Email" name="email">
				</div>
			
				<div class="submit">
					<input type="submit" value="Save" id="submit">
				</div>
			</div>
		</form>
	</div>
</body>
</html>