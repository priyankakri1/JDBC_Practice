<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>
		<a href="home.jsp">Back to home page</a>
	</h1>
<body bgcolor="blue"
	style="justify-content: center; display: flex; align-items: center; flex-direction:column;">

	<form action="fss" method="post">
		<table>
			<tr>
				<td>ID:</td>
				<td><input type="text" name="i"></td>
			</tr>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="nm"></td>
			</tr>
			<tr>
				<td>Department:</td>
				<td><input type="text" name="dp"></td>
			</tr>
			<tr>
				<td>Percentage:</td>
				<td><input type="text" name="pr"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Insert into the database"></td>
			</tr>
		</table>
	</form>
	<h2>
		<a href=FetchId.jsp>Fetch By Id</a>
	</h2>
	<h2>
		<a href=fetchByName.jsp>Fetch By Name</a>
	</h2>
	<h2>
		<a href=fetchByIdAndName.jsp>Fetch By Id And Name</a>
	</h2>
	<h2>
		<a href=fetchAll.jsp>Fetch All</a>
	</h2>


</body>
</html>