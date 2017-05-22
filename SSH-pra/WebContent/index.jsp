<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
</head>
<body>
	<s:form action="saveCS">
	<s:textfield name="classvo.name" label="团队名:"></s:textfield><br>
	
	<s:textfield name="studentvo1.name" label="学生一名"></s:textfield><br>
	<s:textfield name="studentvo1.sex" label="性别"></s:textfield><br>
	
	<s:textfield name="studentvo2.name" label="学生二名"></s:textfield><br>
	<s:textfield name="studentvo2.sex" label="性别"></s:textfield><br>
	
	<s:submit value="保存"></s:submit>
	</s:form>

</body>
</html>