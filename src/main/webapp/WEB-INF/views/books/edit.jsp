<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: przemek
  Date: 07/02/2023
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit article</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/style.css" />
</head>
<body>
    <h3>Edit <c:out value="${book.title}"/></h3>
    <form:form method="post" action="/books/edit/save" modelAttribute="book">
        <p>
            <form:label path="title">Title</form:label><br>
            <form:input path="title"/>
            <form:errors path="title" cssClass="error"/>
        </p>
        <p>
            <form:label path="author">Author</form:label><br>
            <form:input path="author"/>
            <form:errors path="author" cssClass="error"/>
        </p>
        <p>
            <form:label path="publisher">Publisher</form:label><br>
            <form:input path="publisher"/>
            <form:errors path="publisher" cssClass="error"/>
        </p>
        <p>
            <form:label path="type">Type</form:label><br>
            <form:input path="type"/>
            <form:errors path="type" cssClass="error"/>
        </p>
        <p>
            <form:label path="isbn">ISBN</form:label><br>
            <form:input path="isbn"/>
            <form:errors path="isbn" cssClass="error"/>
        </p>
        <p>
            <form:hidden path="id"/>
            <input type="submit" class="btn_2"  value="confirm"/>
        </p>
        <p>
            <a href="/books/all" class="btn_2">CANCEL</a>
        </p>
    </form:form>

</body>
</html>
