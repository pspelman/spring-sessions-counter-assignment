<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>TIME DOC</title>
</head>
<body>
<h3>index page</h3>
INDEX INDEX

<h1><c:out value="${titleString}"/></h1>
<c:out value="${sessionScope.count }" />

<a href="/counter">COUNTER INFO</a>

</body>
</html>
