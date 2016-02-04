<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Include Directive</title>
</head>
<body>

<div id="header">
    <%@ include file="/include/common/header.jspf" %>
</div>

<div id="content">
    Main application content goes here!
</div>

<div id="footer">
    <%@ include file="/include/common/footer.jspf" %>
</div>

</body>
</html>