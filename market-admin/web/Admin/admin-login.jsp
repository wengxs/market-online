<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head lang="en">
  <meta charset="UTF-8">
  <title>管理员系统</title>
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
  <meta name="format-detection" content="telephone=no">
  <meta name="renderer" content="webkit">
  <meta http-equiv="Cache-Control" content="no-siteapp" />
  <link rel="alternate icon" type="image/png" href="assets/i/favicon.png">
  <link rel="stylesheet" href="assets/css/amazeui.min.css"/>
  <script type="text/javascript" href="assets/jquery-1.8.3.min.js"/></script>
  <style>
    .header {
      text-align: center;
    }
    .header h1 {
      font-size: 200%;
      color: #333;
      margin-top: 30px;
    }
    .header p {
      font-size: 14px;
    }
     a {
    line-height: 1.5;
    display: inline-block;
}
a:after {
    display: block;
    content: "";
    height: 2px;
    width: 0%;
    background-color: #AAAAAA;
    transition: width 0.5s ease-in-out;
}
a:hover:after,
a:focus:after {
    width: 100%;
}
    
  </style>
  
</head>
<body>
<div class="header"> 
  <hr />
</div>
<div class="am-g">
  <div class="am-u-lg-6 am-u-md-8 am-u-sm-centered">
    <h2>管理员登录</h2>
    <hr/>
    <br>
    <br>

    <form method="post" action="AdminLogin" class="am-form">
      <label for="admin">帐号:</label>
      <input type="text" name="admin" id="admin" >
      <br>
      <label for="password">密码:</label>
      <input type="password" name="password" id="password" >
      <br>
      <label for="remember-me">
        <input id="remember-me" type="checkbox">
        记住密码
      </label>
      <br />
      <div class="am-cf">
        <input type="submit" name="" value="登 录" class="am-btn am-btn-primary am-btn-sm am-fl">
       
      </div>
    </form>
    <hr>
    <p>© 2015 版权所有.  <a href="#" target="_blank">market</a></p>
  </div>
</div>









</body>
</html>