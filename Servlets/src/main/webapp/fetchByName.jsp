<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1><a href="student.jsp">Get back to the home page</a></h1>
<h2>Enter the Student name to Fetch Data</h2>


<form action="ftchname" method="get">

  <table>
   <tr>
   <td>Name:</td>
   <td><input type="text" placeholder="Enter the student name" name="name"></td>
   </tr>
   <tr>
   <td colspan="2"><button>Submit</button></td>
   </tr>
  </table>
</form>
</body>
</html>