
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>注册界面</title>
    <base href="<%=basePath%>">
</head>
<body>

<div align="center">
    <img src="css/2.jpeg">
    <table>
        <tr>
            <td><a href="login.jsp">注册页面</a></td>
        </tr>
    </table>
</div>

</body>
</html>
