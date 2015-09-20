<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>HomePage</title>
<style>
body {
	background-color: lightgray
}

h1 {
	color: darkgreen
}

p {
	color: green
}
</style>
</head>
<body>
	<h1>
		<b> Welcome to DimArt Systems </b>
	</h1>
	<form action="Home">
		Login    <input type="text" name="Login" /> <br>
		Password <input type="password" name="Password" /> <br>
		 <input type="submit" value="Submit">
	</form>
	<P>The time on the server is ${serverTime}.</P>
</body>
</html>
