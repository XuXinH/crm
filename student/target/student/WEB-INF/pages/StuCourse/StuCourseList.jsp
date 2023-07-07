
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
<%--${StuCourse}
${StuCourse.get(0).getCourseList().get(0).getCname()}--%>
<%--${StuCourse.courseList.sname}--%>
<div class="container mt-3">
<%--    <a href="./add.jsp"><button type="button" class="btn btn-primary">添加</button> </a>--%>
    <form method="post" action="${pageContext.request.contextPath}/StuCouChooseServlet">
        <table class="table table-hover">
            <thead>
            <tr>
               <%-- <th>
                    <input type="checkbox" class="form-check-input" id="check1" name="option1" value="something" onclick="checks()">
                </th>--%>
                <th>编号</th>
                <th>学号</th>
                <th>姓名</th>
                <th>性别</th>
                <th>已选课程</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>

                <c:forEach items="${StuCourse}" var="usr" varStatus="idx">
                   <%-- <c:if test="${usr.getCourseList().get(0).getCname()} != null">--%>
                    <tr>
                        <%--<td>
                            <input type="checkbox" class="form-check-input" id="check2" name="sid[]">
                        </td>--%>
                        <td>${usr.sid}</td>
                        <td>${usr.sno}</td>
                        <td>${usr.sname}</td>
                        <td>${usr.ssex}</td>
                        <td>
                            <%--bug:删除某个学生的所有选课报错（空指针）--%>
                                ${usr.getCourseList().get(0).getCname()}
                        </td>
                        <td>
                            <a href="${pageContext.request.contextPath}/course/getNoChoiceCourse/${usr.sid}">
                                <button type="button" class="btn btn-danger">选课</button></a>
                            <a href="${pageContext.request.contextPath}/course/getWithdrawalBefore?sid=${usr.sid}">
                                <button type="button" class="btn btn-warning">退课</button></a>
                        </td>
                    </tr>
                   <%-- </c:if>--%>
                </c:forEach>

            <%--<tr><a onclick="delAll(${usr.sid})"> <button type="submit" class="btn btn-danger">删除</button></a></tr>--%>
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

