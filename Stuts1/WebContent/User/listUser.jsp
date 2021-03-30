<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<script>
function deleteUser(id) {	
	
	//var id = $("table  button").attr("paramId");
	alert("dd"+id);
	$.ajax({
		type:"GET",
		url:"/Stuts1/delete-user.do?userid=22",
		success: function(result){
			alert("thanh cong");
			if(result.msg === "Delete Successful"){
				alert(result.msg)
				$(that).closest('tr').remove();
				
			} else{
				alert(result.msg)
			}
		},
		error:function(data){
			alert("Some error occured.");
		}
	});
}
</script>
	<logic:empty name="listU">
		<p>Empty User !</p>
	</logic:empty>
	<logic:notEmpty name="listU">
		<table>
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>ADDRESS</th>
			</tr>
			<logic:iterate id="user" name="listU">
				<tr>
					<td><bean:write name="user" property="id"  /></td>
					<td><bean:write name="user" property="name" /></td>
					<td><bean:write name="user" property="address" /></td>
					
					<td> 
						<html:link page="/update-user.do" paramId="userid"
								paramName="user" paramProperty="id">Edit</html:link>--
						<%-- <html:link onclick="deleteUser()" page="/delete-user.do" paramId="userid" 
						       paramName="user" paramProperty="id" >Delete</html:link> --%>
						   
				   <%--  <html:button value="Delete" onclick="deleteUser()" property="id" />  --%>
				 <%--    <html:button  value="Delete" onclick="deleteUser('<%=userid%>')"  property="userid" >Delete</html:button>  --%>
					</td>			
				</tr>
			</logic:iterate>
		</table>
	</logic:notEmpty>
	
	
</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>


</html>