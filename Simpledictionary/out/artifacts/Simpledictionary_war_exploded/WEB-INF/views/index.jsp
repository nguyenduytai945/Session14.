<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 7/16/2019
  Time: 8:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>

<body>
<h2>Từ điển đơn giản</h2>
<form method="get" action="result">
   <label>nhập từ: </label>
    <input type="text" name="key" placeholder="nhập từ" value="">
    <input type="submit" value="tìm kiếm">
</form>
<div>${result}</div>
<div>${result1}</div>
</body>
<body>
</body>
</html>
