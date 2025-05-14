<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Auto Refresh JSP Page</title>
    <!-- Refresh every 5 seconds -->
    <meta http-equiv="refresh" content="5">
</head>
<body>
    <h2>This page auto-refreshes every 5 seconds</h2>
    <p>Current time: <%= new java.util.Date() %></p>
</body>
</html>
