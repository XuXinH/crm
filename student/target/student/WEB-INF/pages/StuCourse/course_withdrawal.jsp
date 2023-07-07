<%--
  Created by IntelliJ IDEA.
  User: Q
  Date: 2023/6/15
  Time: 8:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>学生列表</title>
  <!-- 新 Bootstrap5 核心 CSS 文件 -->
  <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/5.1.1/css/bootstrap.min.css">
</head>
<body>

<jsp:include page="/componet/header.jsp"></jsp:include>
${sid}
<div class="container mt-3">
  <form method="post" action="${pageContext.request.contextPath}/StuCouChooseTrueServlet">
    <table class="table table-hover">
      <thead>
      <tr>
        <th>编号</th>
        <th>课程号</th>
        <th>课程名</th>
        <th>退课</th>
      </tr>
      </thead>
      <tbody>
      <c:forEach items="${Withdrawal}" var="choose" varStatus="idx">
        <tr>
          <td>${choose.cid}</td>
          <td>${choose.cno}</td>
          <td>${choose.cname}</td>
          <td>
            <a href="${pageContext.request.contextPath}/sc/withdrawal/${sid}?cid=${choose.cid}">
              <button type="button" class="btn btn-danger">退课</button></a>
          </td>
        </tr>
      </c:forEach>
      </tbody>
    </table>
  </form>
</div>

<jsp:include page="/componet/footer.jsp"></jsp:include>
</body>
<!--  popper.min.js 用于弹窗、提示、下拉菜单 -->
<script src="https://cdn.staticfile.org/popper.js/2.9.3/umd/popper.min.js"></script>

<!-- 最新的 Bootstrap5 核心 JavaScript 文件 -->
<script src="https://cdn.staticfile.org/twitter-bootstrap/5.1.1/js/bootstrap.min.js"></script>
