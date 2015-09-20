<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
    <%@page import="javax.servlet.jsp.jstl.core.Config"%>
<%@ include file="/WEB-INF/include/head.jspf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Save in pdf </title>
<style>
   body {
    background: #c7b39b url(images/image.jpg); /* Цвет фона и путь к файлу */
    color: #fff; /* Цвет текста */
   }
  </style>
</head>
<body>
	<h2>Save in pdf </h2>
	<form action="/SummaryTask4/Patient" method="post">

		<table>
			<tr>
				<th>id of patient</th>
			</tr>
			<tr>
				<td><input type="text" name="pdf_id"></td>
			</tr>
		</table>
		<input type="submit" name="pdfsubmit" value=Save>
		
	</form>
</body>
</html>