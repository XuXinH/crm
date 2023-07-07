<%--
  Created by IntelliJ IDEA.
  User: mi
  Date: 23/5/2023
  Time: 下午3:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%--添加jstl核心库--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>congratulations！</h1>

<c:forEach items="${movies}" var="movie">
    ${movie.id}-
    ${movie.name}-
    ${movie.director}-
    ${movie.director}<br>

</c:forEach>

</body>
</html>
