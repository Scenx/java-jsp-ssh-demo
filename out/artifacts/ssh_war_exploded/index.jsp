<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by Scen
  Date: 2018/2/9
  Time: 14:52
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>标题</title>
</head>
<body>
<s:form action="userAction_register">
    <s:textfield name="user.username" label="用户名"/>
    <s:password name="user.password" label="密码"/>
    <s:textfield name="user.age" label="年龄"/>
    <s:submit value="注册"/>
</s:form>
</body>
</html>
