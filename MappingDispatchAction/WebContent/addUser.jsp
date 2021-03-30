<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<html:form action ="/view-user.do" method="post">
<p> Name:</p>
<html:text property="name" name="User"> </html:text>
<p> Address:</p>
<html:text property="add" name="User"> </html:text>
</html:form>
<html:submit >Add User </html:submit>
</body>
</html>