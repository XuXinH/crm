<%--
  Created by IntelliJ IDEA.
  User: Q
  Date: 2022/12/19
  Time: 21:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>添加学生信息</title>
    <!-- 新 Bootstrap5 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/5.1.1/css/bootstrap.min.css">
</head>
<body>
<jsp:include page="/componet/header.jsp"></jsp:include>
${stu}
<div class="container mt-3">
    <h3>修改学生信息</h3>
    <form action="${pageContext.request.contextPath}/student/updateStudent" method="post">
        <input type="hidden" name="sid" value="${stu.sid}"/>
        <div class="mb-3 mt-3">
            <label for="sno" class="form-label">sno</label>
            <input type="text" class="form-control" id="sno" placeholder="请输入学号：" name="sno" value="${stu.sno}">
        </div>

        <div class="mb-3">
            <label for="sname" class="form-label">姓名:</label>
            <input type="text" class="form-control" id="sname" placeholder="请输入姓名：" name="sname" value="${stu.sname}">
        </div>

        <div class="mb-3">
            <label for="sname" class="form-label">性别:</label>
            <div class="form-check">
                <input type="radio" class="form-check-input" id="ssex" name="ssex" value="男" <c:if test="${stu.ssex =='男'}">checked</c:if>>
                <label class="form-check-label" for="ssex">男</label>
            </div>
            <div class="form-check">
                <input type="radio" class="form-check-input" id="ssex" name="ssex" value="女" <c:if test="${stu.ssex =='女'}">checked</c:if>>
                <label class="form-check-label" for="ssex">女</label>
            </div>
        </div>
        <div class="mb-3">
            <label for="sbirth" class="form-label">生日:</label>
            <input type="date" class="form-control" id="sbirth" placeholder="请输入生日：" name="sbirth" value="${stu.sbirth}">
        </div>
        <div class="form-check mb-3">
            <label class="form-check-label">
                <input class="form-check-input" type="checkbox" name="remember"> Remember me
            </label>
        </div>
       <%-- <button type="submit" class="btn btn-primary">修改</button>--%>
        <input type="submit" value="修改" class="btn btn-success pull-right">
    </form>
</div>
<jsp:include page="/componet/footer.jsp"></jsp:include>
</body>
<!--  popper.min.js 用于弹窗、提示、下拉菜单 -->
<script src="https://cdn.staticfile.org/popper.js/2.9.3/umd/popper.min.js"></script>

<!-- 最新的 Bootstrap5 核心 JavaScript 文件 -->
<script src="https://cdn.staticfile.org/twitter-bootstrap/5.1.1/js/bootstrap.min.js"></script>
</html>
