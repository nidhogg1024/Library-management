<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%@include file="menu_search.jsp" %>
  <table>
    <tr>
    <td>书名</td>
    <td>ISBN</td>
    <td>价格</td>
    <td>库存</td>
    <td>作者</td>
    <td>出版社</td>
    <td>上架时间</td>
    <td>操作</td>
  </tr>
    <c:forEach items="list" var="book">
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
  </table>
  </body>
</html>
