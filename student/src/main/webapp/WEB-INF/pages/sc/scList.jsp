<%--
  Created by IntelliJ IDEA.
  User: Q
  Date: 2022/12/20
  Time: 14:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>课程列表</title>
    <!-- 新 Bootstrap5 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/5.1.1/css/bootstrap.min.css">
</head>
<body>

<jsp:include page="/componet/header.jsp"></jsp:include>
<div class="container mt-3">
    <a href="${pageContext.request.contextPath}/course/add"><button type="button" class="btn btn-primary">添加</button> </a>
    <form action="${pageContext.request.contextPath}/course/delAll" method="post">
        <table class="table table-hover">
            <thead>
            <tr>
                <th>
                    <input type="checkbox" class="form-check-input" id="check1_1" name="option1" value="something" onclick="checks()">
                </th>
                <th>编号</th>
                <th>课程号</th>
                <th>课程名</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${courseAsSc}" var="cour" varStatus="idx">
                <tr>
                    <td>
                        <input type="checkbox" class="form-check-input" id="check2" name="cid[]" value="${cour.cid}">
                    </td>
                    <td>${cour.cid}</td>
                    <td>${cour.cno}</td>
                    <td>${cour.cname}</td>
                    <td>
                        <%--跳转到选择该课程的学生--%>
                        <%--<a href="${pageContext.request.contextPath}/student/choiceCourseStu?cid=${cour.cid}">
                            <button type="button" class="btn btn-danger">录入成绩</button>
                        </a>--%>
                            <a href="${pageContext.request.contextPath}/sc/choiceCourseStu?cid=${cour.cid}">
                                <button type="button" class="btn btn-danger">查询成绩</button>
                            </a>
                    </td>
                </tr>
            </c:forEach>
            <tr><a href="${pageContext.request.contextPath}/course/delAll"> <button type="submit" class="btn btn-danger">删除</button></a></tr>
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
</html>
