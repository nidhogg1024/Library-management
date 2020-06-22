<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图书销售页面</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/search">
    输入你想要购买的书ISBN码：<input type="text" name="ISBN">
    <input type="submit" value="搜索">
</form>
</body>
</html>
