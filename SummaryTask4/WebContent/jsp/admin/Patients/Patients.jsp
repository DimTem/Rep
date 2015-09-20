<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Patients</title>
<style>
   body {
    background: #c7b39b url(images/image.jpg); /* Цвет фона и путь к файлу */
    color: #fff; /* Цвет текста */
   }
  </style>
</head>
<body>
	<h2>Show Patients</h2>
	<form action="/SummaryTask04/Patient" method="post">
	<input type="submit" name="allsubmit" value="All patients"> <br>
		<p>
	<input type="submit" name="asubmit" value="By alphabet"> <br>
		<p>
			<input type="submit" name="dsubmit" value="By date of birth"> <br>
		<p>
		</form>
</body>
</html>