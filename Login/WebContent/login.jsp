<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
 <html:form action="login" focus="userName" method="post">
    Username : <html:text property="userName" />
        <br>
    Password : <html:password property="password" />
        <br>
        <html:submit value="login" />
    </html:form>
</body>
</html>