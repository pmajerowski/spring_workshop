<%--
  Created by IntelliJ IDEA.
  User: przemek
  Date: 07/02/2023
  Time: 22:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Confirm</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/style.css" />
</head>
<body>
  <div style="padding-left: 40px; size: auto; border: darkgreen">
    <h3>Are you sure you want to delete this book?</h3>
    <h4 style="padding-left: 190px">This is irreversible.</h4>
    <div style="padding-left: 190px">
      <p>
        <a href="/books/delete/${id}" class="btn" >DELETE</a>
      </p>
      <p>
        <a href="/books/all" class="btn">CANCEL</a>
      </p>
    </div>

  </div>

</body>
</html>
