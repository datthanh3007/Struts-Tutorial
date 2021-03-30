<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>ADD USER </h1>
<html:form action="/add-user-method.do" method="post">
<p>Name </p>
<html:text property="name" name="User"></html:text>
<br>
<p>Age </p>
<html:text property="age" name="User"></html:text>
<br>
<p>Sex </p>
<html:radio property="sex" name="User" value="male"></html:radio>
<html:radio property="sex" name="User" value="female"></html:radio>
<br>
<p>Job </p>
<html:text property="job" name="User"></html:text>
<html:submit >Add user </html:submit>

</html:form>
</body>
</html>