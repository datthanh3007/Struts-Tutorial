<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
     <%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<html:form action="/edit-user-method.do"  method="post">
<html:hidden property="id" name	="update"/>
     UserName : <html:text property="name"  name="User"/>
        <br>
      Address : <html:text property="address"  name="User" />
        <br>
        <html:submit value="Update user" />
    </html:form>
</body>
</html>