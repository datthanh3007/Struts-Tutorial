<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
 <%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<!DOCTYPE html>
<% %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<H3>Dispatch Action Example</H3>
<p><html:link page="/view-user.do?parameter=addUser">Call Add Section</html:link></p>
<p><html:link page="/user.do?parameter=editUser">Call Edit Section</html:link></p>
<p><html:link page="/user.do?parameter=searchUser">Call Search Section</html:link></p>
<p><html:link page="/user.do?parameter=saveUser">Call Save Section</html:link></p>
</body>
</html>