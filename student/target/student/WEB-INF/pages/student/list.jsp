<%--
  Created by IntelliJ IDEA.
  User: Q
  Date: 2022/12/19
  Time: 22:29
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

<script type="text/javascript">
    function del(sid){
        // 弹出确认框，用户点击确定，返回true，点击取消返回false
        var ok = window.confirm("删了不可恢复哦！");
        if(ok){
            document.location.href="${pageContext.request.contextPath}/StuDelServlet?sid="+sid;

        }
    }
    /*bug,不选择则会报错*/
  function delAll(sid){
        // 弹出确认框，用户点击确定，返回true，点击取消返回false
        var ok = window.confirm("全部删了不可恢复哦！");
        if(ok){
            document.location.href="${pageContext.request.contextPath}/StuDeleteAllServlet";
        }

    }

    function checks(){
        var all = document.getElementById("check1");
        var one = document.getElementsByName("sid[]");

        if(all.checked){
            //选中所有
            for(var i = 0; i < one.length; i++){
                one[i].checked = true;
            }
        }else{
            //不选中所有
            for(var i = 0; i < one.length; i++){
                one[i].checked = false;
            }
        }

    }
</script>

<jsp:include page="/componet/header.jsp"></jsp:include>

<div class="container mt-3">
    <a href="${pageContext.request.contextPath}/student/add"><button type="button" class="btn btn-primary">添加</button> </a>
    <form method="post" action="${pageContext.request.contextPath}/student/delAll">
    <table class="table table-hover">
        <thead>
        <tr>
            <th>
                <input type="checkbox" class="form-check-input" id="check1" name="option1" value="something" onclick="checks()">
            </th>
            <th>编号</th>
            <th>学号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>出生日期</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${stus}" var="usr" varStatus="idx">
            <tr>
                <td>
                    <input type="checkbox" class="form-check-input" id="check2" name="sid[]" value="${usr.sid}">
                </td>
                <td>${usr.sid}</td>
                <td>${usr.sno}</td>
                <td>${usr.sname}</td>
                <td>${usr.ssex}</td>
                <td>${usr.sbirth}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/student/del?sno=${usr.sno}">
                        <button type="button" class="btn btn-danger">删除</button>
                    </a>
                   <%-- <a href="${pageContext.request.contextPath}/student/update?sid=${usr.sid}">--%>
                    <a href="${pageContext.request.contextPath}/student/getStudent?sid=${usr.sid}">
                        <button type="button" class="btn btn-warning">修改</button>
                    </a>
                </td>
            </tr>
        </c:forEach>
        <tr><a href="${pageContext.request.contextPath}/student/delAll"> <button type="submit" class="btn btn-danger">删除</button></a></tr>
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
