<%--
  Created by IntelliJ IDEA.
  User: Q
  Date: 2022/12/19
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="container">
    <header class="d-flex flex-wrap justify-content-center py-3 mb-4 border-bottom">
        <a href="${pageContext.request.contextPath}/admin/index" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-dark text-decoration-none">
            <svg class="bi me-2" width="40" height="32"><use xlink:href="#bootstrap"></use></svg>
            <span class="fs-4">学生管理系统</span>
        </a>

        <ul class="nav nav-pills">
            欢迎你，${SUCCESS.uname}！！！
            <li class="nav-item"><a href="${pageContext.request.contextPath}/admin/logout" class="nav-link active" aria-current="page">注销</a></li>
        </ul>
    </header>
</div>
