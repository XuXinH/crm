<%--
  Created by IntelliJ IDEA.
  User: Q
  Date: 2022/12/19
  Time: 9:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>学生成绩管理系统</title>
    <!-- 新 Bootstrap5 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/5.1.1/css/bootstrap.min.css">
</head>
<body>
<jsp:include page="/componet/header.jsp"></jsp:include>
<div class="container">
    <%--学生列表--%>
    <ul class="nav justify-content-center border-bottom pb-3 mb-3">
        <li class="nav-item"><a href="${pageContext.request.contextPath}/student/list" class="nav-link px-2 text-muted">学生列表</a></li>
    </ul>
    <%--添加学生--%>
    <ul class="nav justify-content-center border-bottom pb-3 mb-3">
        <li class="nav-item"><a href="${pageContext.request.contextPath}/student/add" class="nav-link px-2 text-muted">添加学生</a></li>
    </ul>
    <%--课程列表--%>
    <ul class="nav justify-content-center border-bottom pb-3 mb-3">
        <li class="nav-item"><a href="${pageContext.request.contextPath}/course/list" class="nav-link px-2 text-muted">课程列表</a></li>
    </ul>
    <%--添加课程--%>
    <ul class="nav justify-content-center border-bottom pb-3 mb-3">
        <li class="nav-item"><a href="${pageContext.request.contextPath}/course/add" class="nav-link px-2 text-muted">添加课程</a></li>
    </ul>
    <%--学生选课--%>
    <ul class="nav justify-content-center border-bottom pb-3 mb-3">
        <li class="nav-item"><a href="${pageContext.request.contextPath}/student/StuCourseList" class="nav-link px-2 text-muted">学生选课</a></li>
    </ul>
    <%--录入成绩--%>
    <ul class="nav justify-content-center border-bottom pb-3 mb-3">
        <li class="nav-item"><a href="${pageContext.request.contextPath}/course/CourseList" class="nav-link px-2 text-muted">录入成绩</a></li>
    </ul>
</div>
<jsp:include page="/componet/footer.jsp"></jsp:include>

</body>
<!--  popper.min.js 用于弹窗、提示、下拉菜单 -->
<script src="https://cdn.staticfile.org/popper.js/2.9.3/umd/popper.min.js"></script>

<!-- 最新的 Bootstrap5 核心 JavaScript 文件 -->
<script src="https://cdn.staticfile.org/twitter-bootstrap/5.1.1/js/bootstrap.min.js"></script>
</html>
