<%--
  Created by IntelliJ IDEA.
  User: Q
  Date: 2022/12/20
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>添加学生信息</title>
    <!-- 新 Bootstrap5 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/5.1.1/css/bootstrap.min.css">
</head>
<body>
<jsp:include page="/componet/header.jsp"></jsp:include>
<div class="container mt-3">
    <h3>添加课程信息</h3>
    <form action="${pageContext.request.contextPath}/course/CourseAdd" method="post">
        <%--课程号--%>
        <div class="mb-3 mt-3">
            <label for="cno" class="form-label">课程号</label>
            <input type="text" class="form-control" id="cno" placeholder="请输入课程号：" name="cno">
        </div>
        <%--课程名--%>
        <div class="mb-3">
            <label for="cname" class="form-label">课程名:</label>
            <input type="text" class="form-control" id="cname" placeholder="请输入课程名：" name="cname">
        </div>
        <%--添加--%>
        <button type="submit" class="btn btn-primary">添加</button>
    </form>
</div>
<jsp:include page="/componet/footer.jsp"></jsp:include>
</body>
<!--  popper.min.js 用于弹窗、提示、下拉菜单 -->
<script src="https://cdn.staticfile.org/popper.js/2.9.3/umd/popper.min.js"></script>

<!-- 最新的 Bootstrap5 核心 JavaScript 文件 -->
<script src="https://cdn.staticfile.org/twitter-bootstrap/5.1.1/js/bootstrap.min.js"></script>
</html>
