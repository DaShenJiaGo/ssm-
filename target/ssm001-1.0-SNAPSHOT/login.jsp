
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
  <meta charset="UTF-8">
  <title>登录</title>
  <base href="<%=basePath%>">
  <link href="/css/2.jpeg" rel="stylesheet" type="text/css"/>
  <link rel="stylesheet" href="css/login.css"/>
  <link rel="stylesheet" href="https://cdn.staticfile.org/font-awesome/4.7.0/css/font-awesome.css">
</head>
<body>
<form action="landing/addlanding.do" method="post">
<div id="login-box">
  <h1>Login</h1>
  <div class="form">
    <div class="item">
      <i class="fa fa-github-alt" style="font-size:24px"></i>
      <input type="text" placeholder="Username" name="account">
    </div>
    <div class="item">
      <i class="fa fa-search" style="font-size:24px"></i>
      <input type="text" placeholder="Password" name="password">
    </div>
  </div>
  <button>Login</button>
</div>
</form>
</body>
</html>
