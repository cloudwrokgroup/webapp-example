<%@ page import="org.kodejava.example.servlet.SessionCounter" %>
<html>
<head>
    <title>Session Counter</title>
</head>
<body>
<%
    SessionCounter counter = (SessionCounter) session.getAttribute(
            SessionCounter.COUNTER);
%>

Number of online user(s): <%= counter.getActiveSessionNumber() %>
</body>
</html>