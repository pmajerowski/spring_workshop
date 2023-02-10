<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Book List</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/style.css" />
</head>
<body>
<h3>Book list</h3>

<table class="tbl" >
  <thead>
    <th style=" padding-left: 6px; padding-right: 6px;  text-align: center;">id</th>
    <th  style="text-align: center; ">isbn</th>
    <th  style="text-align: center;">title</th>
    <th style="text-align: center; ">author</th>
    <th colspan="3"></th>
  </thead>
  <tbody>
  <c:forEach items="${books}" var="book">
    <tr>
      <td style="text-align: center;"><c:out value="${book.id}"/></td>
      <td><c:out value="${book.isbn}"/></td>
      <td><c:out value="${book.title}"/></td>
      <td><c:out value="${book.author}"/></td>
      <td><a href="/books/${book.id}" class="btn">details</a></td>
      <td><a href="/books/edit/${book.id}" class="btn">edit</a></td>
      <td><a href="/books/confirm/${book.id}" class="btn">delete</a></td>
    </tr>
  </c:forEach>
  </tbody>
</table>
<p>
  <a href="/books/new" class="btn_2">add new book</a>

</p>
</body>
</html>

