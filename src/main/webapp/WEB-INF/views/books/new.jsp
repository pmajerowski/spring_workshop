<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>New article</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/style.css" />
</head>
<body>
<form:form method="post" action="/books/save" modelAttribute="book">

  <h3>Add a new book</h3>
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
    <input type="submit" class="btn_2" value="add">
  </p>
  <p>
    <a href="/books/all" class="btn_2">back</a>
  </p>
</form:form>
</body>
</html>