<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
    <%@page import="javax.servlet.jsp.jstl.core.Config"%>
<%@ include file="/WEB-INF/include/head.jspf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Check doctor for user</title>
</head>
<body>
<form action="/SummaryTask4/User" method="post">
		<table>
			<tr>
				<th>Insert id of doctor</th>
			</tr>
			<tr>


				<td><input type="text" name="InsId"></td>
			</tr>
		</table>
		<input type="submit" name="Inssubmit" value="<fmt:message key="user.confirmb"  />">
	</form>
</body>