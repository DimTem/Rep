<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
    <%@page import="javax.servlet.jsp.jstl.core.Config"%>
<%@ include file="/WEB-INF/include/head.jspf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show doctors by surname</title>
<style>
   body {
    background: #c7b49b url(images/image.jpg); /* Цвет фона и путь к файлу */
    color: #fff; /* Цвет текста */
   }
  </style>
</head>
<body>
<h2>Show doctors by surname</h2>
	<form action="/SummaryTask4/Doctor" method="post">
		<table>
			<tr>
			<td>	<select name="selectdoctor">
					<option value="id_1">Cobilko</option>
					<option value="id_2">Mizintsev</option>
					<option value="id_3">Kuybishev</option>
					<option value="id_4">Filatov</option>
					<option value="id_5">Lozhkina</option>
					<option value="id_6">Koshkina</option>
					<option value="id_7">Vors</option>
					<option value="id_8">Kilev</option>
					<option value="id_9">Lupin</option>
					<option value="id_10">Sanin</option>
					<option value="id_13">Витюшин</option>
				</select></td>
			</tr>
		</table>
		<input type="submit" name="surnsubmit" value="Confirm">
	</form>
</body>
</html>