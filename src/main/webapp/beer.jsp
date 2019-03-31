<%--
  Created by IntelliJ IDEA.
  User: zfb
  Date: 19-3-31
  Time: 下午7:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="java.io.PrintWriter" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        List<String> brands=(List)request.getAttribute("brands");
        PrintWriter pw=response.getWriter();
        for(String item:brands){
            pw.println(item);
        }
    %>
</body>
</html>
