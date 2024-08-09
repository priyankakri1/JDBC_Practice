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
<h2>Enter the Student id to Fetch Data</h2>


<form action="ftchid" method="get">

  <table>
   <tr>
   <td>Id:</td>
   <td><input type="number" placeholder="Enter the student id" name="id"></td>
   </tr>
   <tr>
   <td colspan="2"><button>Submit</button></td>
   </tr>
  </table>
</form>

</body>
</html>