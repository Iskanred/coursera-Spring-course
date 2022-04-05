<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

    <head>
        <title>Input Name Page</title>
    </head>

    <body>
        <form action="submit_name" method="post">
            <label>
                <input type="text" name="name">
            </label>
            <input type="submit" value="Submit"/>
        </form>
    </body>

</html>