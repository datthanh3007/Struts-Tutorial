<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%> --%>
	<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<!DOCTYPE html>
<html>
<head>
<!-- <meta charset="ISO-8859-1"> -->
<title>Add user</title>
</head>
<body>
	
	<html:form action="/add-user-method.do" method="post">
		<h3>UserName :</h3>
		<html:text property="name" name="User" />
		<br>
		
		<html:messages id="name_err" property="user.name.required">
			<p style="color: red">
				<bean:write name="name_err" />

			</p>
		</html:messages>
		<h3>Address :</h3>
		<html:text property="address" name="User" />
		<br>
		
		<html:messages id="age_err" property="user.age.invalid">
			<p style="color: red">
				<bean:write name="age_err" />
			</p>
		</html:messages>
		<br>
		<html:submit value="Add user" />
	</html:form>
</body>
</html>