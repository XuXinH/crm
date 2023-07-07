<%--
  Created by IntelliJ IDEA.
  User: Q
  Date: 2022/12/21
  Time: 11:15
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>选课界面</title>
</head>
<body>
    <h2>请选择课程</h2>
</body>
</html>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>选课列表</title>
    <!-- 新 Bootstrap5 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/5.1.1/css/bootstrap.min.css">
</head>
<body>

<jsp:include page="/componet/header.jsp"></jsp:include>
<%--${sid}--%>
<div class="container mt-3">
    <form method="post" action="${pageContext.request.contextPath}/StuCouChooseTrueServlet">
        <table class="table table-hover">
            <thead>
            <tr>
              <%--  <th>
                    <input type="checkbox" class="form-check-input" id="check1" name="option1" value="something" onclick="checks()">
                </th>--%>
                <th>编号</th>
                <th>课程号</th>
                <th>课程名</th>
                <th>选课</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${courses}" var="choose" varStatus="idx">
                <tr>
                   <%-- <td>
                        <input type="checkbox" class="form-check-input" id="check2" name="sid[]">
                    </td>--%>
                  <%--  <td>
                        <input type="hidden" name="sid" value="${choose.sid}">
                    </td>--%>
                  <%-- <td>${choose.sid}</td>--%>
                    <td>${choose.cid}</td>
                    <td>${choose.cno}</td>
                    <td>${choose.cname}</td>
                    <td>
                        <a href="${pageContext.request.contextPath}/sc/choice/${choose.cid}/${sid}">
                            <button type="button" class="btn btn-danger">选课</button></a>
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
