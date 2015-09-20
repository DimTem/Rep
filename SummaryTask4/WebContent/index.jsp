<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="javax.servlet.jsp.jstl.core.Config"%>
<%@ include file="/WEB-INF/include/head.jspf"%>
<%@ include file="/WEB-INF/include/header.jsp" %>
<center>
</center>
<html>
<head>
  <meta charset="utf-8">
  <title>Login</title>
  <style>
   body {
    background: #c7b39b url(images/image.jpg); /* Цвет фона и путь к файлу */
    color: #fff; /* Цвет текста */
   }
  </style>

</head>
<body>
	<h2><fmt:message key="Login"  /></h2>
	<form action="auth" name="f1" method="post">   
		login:<br> <input type="text" name="login" placeholder="<fmt:message key="login.login"  />"  required> <br>
		password:<br> <input type="password" name="pass" placeholder="<fmt:message key="login.Password"  />"  required> <br>
		<input type="submit" name="submit" value="<fmt:message key="login.submit"  />" >
	</form>
		<a href="settings.jsp"><fmt:message key="index_jsp.link.settings" /></a>
		<%@ include file="/WEB-INF/include/footer.jsp" %>
</body>
</html>