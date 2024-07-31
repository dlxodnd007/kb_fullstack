<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%@ include file="header.jsp"%>
    <h1>EL 문법의 Scope 확인용 페이지</h1>

    <h2>Request 스코프</h2>
    <p>${request}</p>

    <h2>Seesion 스코프</h2>
    <p>${seesion != null ? session : "없는데요"}</p>

    <h2>Application 스코프</h2>
    <p>${application != null ? application : "없는데요"}</p>

    <h2>Page 스코프</h2>
    <p>${page}</p>

</body>
</html>
