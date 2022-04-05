<jsp:useBean id="name" scope="request" type="java.lang.String"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <title>Hello Page</title>
    </head>
    <body>
        <h1>Hello, ${name}!</h1>
    </body>
</html>