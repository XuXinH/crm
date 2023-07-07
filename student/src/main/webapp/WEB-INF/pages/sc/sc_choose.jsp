<%--
  Created by IntelliJ IDEA.
  User: Q
  Date: 2023/6/15
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>录入成绩</title>
    <!-- 新 Bootstrap5 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/5.1.1/css/bootstrap.min.css">
</head>
<body>

<jsp:include page="/componet/header.jsp"></jsp:include>
<%--${sid}--%>
<div class="container mt-3">
        <table class="table table-hover">
            <thead>
            <tr>
                <%--  <th>
                      <input type="checkbox" class="form-check-input" id="check1" name="option1" value="something" onclick="checks()">
                  </th>--%>
                <th>学生编号</th>
                <th>成绩</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${scs}" var="choose" varStatus="idx">
                <tr>
                    <td>${choose.sid}</td>
                    <td>
                        ${choose.degree}
                    </td>
                    <td>
                        <form method="post" action="${pageContext.request.contextPath}/sc/update">
                       <%-- <a href="${pageContext.request.contextPath}/sc/getGrades?sid=${choose.sid}&cid=${cid}">--%>
                            <input type="hidden" name="sid" value="${choose.sid}">
                            <input type="hidden" name="cid" value="${cid}">
                            <input type="text" name="degree">
                           <button type="submit" class="btn btn-danger">修改成绩</button>
                        </form>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
</div>

<jsp:include page="/componet/footer.jsp"></jsp:include>
</body>
<!--  popper.min.js 用于弹窗、提示、下拉菜单 -->
<script src="https://cdn.staticfile.org/popper.js/2.9.3/umd/popper.min.js"></script>

<!-- 最新的 Bootstrap5 核心 JavaScript 文件 -->
<script src="https://cdn.staticfile.org/twitter-bootstrap/5.1.1/js/bootstrap.min.js"></script>

