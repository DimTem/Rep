<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="javax.servlet.jsp.jstl.core.Config"%>
<%@ include file="/WEB-INF/include/head.jspf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Doctors by category</title>
  <style>
   body {
    background: #c7b39b url(images/image.jpg); /* Цвет фона и путь к файлу */
    color: #fff; /* Цвет текста */
   }
  </style>
</head>
<body>
	<h2><fmt:message key="doctor.category"  /></h2>
	<form action="/SummaryTask4/Doctor" method="post">
		<input type="submit" name="dsubmit" value="<fmt:message key="doctor.dentist"  />" > <br>
		<p>
			<input type="submit" name="gsubmit" value="<fmt:message key="doctor.gynaecologist"  />" > <br>
		<p>
			<input type="submit" name="nsubmit" value="<fmt:message key="doctor.nurses"  />" > <br>
		<p>
			<input type="submit" name="neursubmit" value="<fmt:message key="doctor.neuropathologists"  />" >
			<br>
		<p>
			<input type="submit" name="osubmit" value="<fmt:message key="doctor.otolaryngologists"  />" >
			<br>
		<p>
			<input type="submit" name="psubmit" value="<fmt:message key="doctor.psychologists"  />" > <br>
		<p>
		<p>
		<input type="submit" name="tsubmit" value="<fmt:message key="doctor.therapeutists"  />" >
			<br>
	</form>
</body>
</html>