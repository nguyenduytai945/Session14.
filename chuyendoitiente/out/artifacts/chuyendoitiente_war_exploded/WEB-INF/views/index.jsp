<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 7/15/2019
  Time: 3:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<body>
<h2>Currency Converter</h2>
<form method="post" action="convert">
    <label>USD: </label><br/>
    <input type="text" name="usd" placeholder="USD" value=""/><br/>
    <input type="submit" value="Converter"/>
</form>
<div>${result}</div>
</body>
</html>
