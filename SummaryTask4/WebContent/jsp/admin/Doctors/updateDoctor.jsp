<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
    <%@page import="javax.servlet.jsp.jstl.core.Config"%>
<%@ include file="/WEB-INF/include/head.jspf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update</title>
  <style>
   body {
    background: #c7b39b url(images/image.jpg); /* Цвет фона и путь к файлу */
    color: #fff; /* Цвет текста */
   }
  </style>
</head>
<body>
	<h2><fmt:message key="doctor.update"  /></h2>
	<form action="/SummaryTask4/Doctor" method="post">
		<table>
			<tr>
				<th>id</th>
				<th>surname</th>
				<th>name</th>
				<th>patronymic</th>
				<th>category</th>
				<th>date of birth</th>
				<th>telephone</th>
				<th>number of patients</th>
			</tr>
			<tr>

				<!-- <td><input type="text" name="OLDTId"></td> -->
				<td><input type="text" name="INSERTId"></td>
				<td><input type="text" name="INSERTSurname"></td>
				<td><input type="text" name="INSERTName"></td>
				<td><input type="text" name="INSERTPatronymic"></td>
				<td><input type="text" name="INSERTCategory"></td>
				<td><input type="date" name="INSERTDateOfBirth" max="2015-08-31" min="1900-12-31"></td>
				<td><input type="text" name="INSERTTelephone"></td>
				<td><input type="text" name="INSERTNumberOfPatients"></td>
			</tr>
		</table>
		<input type="submit" name="INSERTsubmit" value="<fmt:message key="doctor.updateC"  />">
	</form>
	
</body>
</html>