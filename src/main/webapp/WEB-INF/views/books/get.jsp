<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: przemek
  Date: 09/02/2023
  Time: 07:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${book.title}</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/style.css" />
</head>
<body>
    <h2>${book.title}</h2>
    <table style=" border-spacing: 8px">
       <thead>
          <tr>
            <th>Id</th>
            <th style="background-color: #2e3636">Title</th>
            <th style="background-color: #2e3636">Author</th>
            <th style="background-color: #2e3636">Publisher</th>
            <th style="background-color: #2e3636">Type</th>
            <th style="background-color: #2e3636">ISBN</th>
          </tr>
       </thead>
          <tr>
            <td><c:out value="${book.id}"/></td>
            <td><c:out value="${book.title}" /></td>
            <td><c:out value="${book.author}" /></td>
            <td><c:out value="${book.publisher}" /></td>
            <td><c:out value="${book.type}" /></td>
            <td><c:out value="${book.isbn}" /></td>

            <td><a href="/books/edit/${book.id}" class="btn">edit</a></td>
            <td><a href="/books/confirm/${book.id}" class="btn">delete</a></td>
          </tr>

    </table>
  <p><a href="/books/all" class="btn_2">home page</a></p>
</body>
</html>
