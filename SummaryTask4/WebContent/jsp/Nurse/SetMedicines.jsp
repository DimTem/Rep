<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
    <%@page import="javax.servlet.jsp.jstl.core.Config"%>
<%@ include file="/WEB-INF/include/head.jspf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Set medicines</title>
</head>
<body>
<h2>Set medicines</h2>
	<form action="/SummaryTask4/Nurse" method="post">
		<table>
			<tr>
				<th>id</th>
				<th>medicines</th>
			</tr>
			<tr>

				<!-- <td><input type="text" name="OLDTId"></td> -->
				<td><input type="text" name="NUpId"></td>
				<td><input type="text" name="NUpMedicines"></td>
			</tr>
		</table>
		<input type="submit" name="NUpsubmit" value="<fmt:message key="nurse.set"  />">
	</form>
</body>
</html>