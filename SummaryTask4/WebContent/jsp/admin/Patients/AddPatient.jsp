<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
    <%@page import="javax.servlet.jsp.jstl.core.Config"%>
<%@ include file="/WEB-INF/include/head.jspf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add patient</title>
<style>
   body {
    background: #c7b39b url(images/image.jpg); /* Цвет фона и путь к файлу */
    color: #fff; /* Цвет текста */
   }
  </style>
</head>
<body>
	<h2><fmt:message key="patient.add"  /></h2>
	<form action="/SummaryTask4/Patient" method="post">

		<table>
			<tr>
				<th>id</th>
				<th>surname</th>
				<th>name</th>
				<th>patronymic</th>
				<th>date of birth</th>
				<th>id of attending medical doctor</th>
				<th>procedures</th>
				<th>medicines</th>
				<th>operations</th>
				<th>diagnosis</th>
				<th>status</th>
			</tr>
			<tr>
				<td><input type="text" name="a_id"></td>
				<td><input type="text" name="a_surname"></td>
				<td><input type="text" name="a_name"></td>
				<td><input type="text" name="a_patronymic"></td>
				<td><input type="date" name="a_dateOfBirth" max="2015-08-31" min="1900-12-31"></td>
				<td><input type="text" name="a_idOfAttendingMedicalDoctor"></td>
				<td><input type="text" name="a_procedures"></td>
				<td><input type="text" name="a_medicines"></td>
				<td><input type="text" name="a_operations"></td>
				<td><input type="text" name="a_diagnosis"></td>
				<td><input type="text" name="a_status"></td>
			</tr>
		</table>
		<input type="submit" name="psubmit" value="<fmt:message key="patient.buttonadd"  />">
		
	</form>
</body>
</html>