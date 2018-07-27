<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<table style="width:500px">
<tr>
	<td>学号 </td>
	<td>班级名称</td>
	<td>学生姓名</td>
	<td>学生性别</td>
	<td>学生年龄</td>
	<td>操作</td>
</tr>

<c:forEach items="${list}" var="s">
<tr>
	<td>${s.snumber}</td>
	<td>${s.classes}</td>
	<td>${s.ename}</td>
	<td>${s.sex}</td>
	<td>${s.age}</td>
	  <td><a href="ss?type=shan&snumber=${s.snumber}">
	  <input type="submit" value="删除"/>
	  </a></td>
</tr>
</c:forEach>


</table>

</body>
</html>