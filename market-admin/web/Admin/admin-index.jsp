<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ page import="java.util.List"%>  
<%@ page import="java.util.Iterator"%>  
<%@ page import="com.SessionListener"%>
<%@ page import="com.OnlineSession"%>

<!doctype html>
<html class="no-js">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Admin后台管理</title>
  <meta name="description" content="Admin">
  <meta name="keywords" content="index">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
  <meta name="renderer" content="webkit">
  <meta http-equiv="Cache-Control" content="no-siteapp" />
  <link rel="icon" type="image/png" href="assets/i/favicon.png">
  <link rel="apple-touch-icon-precomposed" href="assets/i/app-icon72x72@2x.png">
  <meta name="apple-mobile-web-app-title" content="Amaze UI" />
  <link rel="stylesheet" href="assets/css/amazeui.min.css"/>
  <link rel="stylesheet" href="assets/css/admin.css">
<style type="text/css">
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
<!--[if lte IE 9]>
<p class="browsehappy">你正在使用<strong>过时</strong>的浏览器，Amaze UI 暂不支持。 请 <a href="http://browsehappy.com/" target="_blank">升级浏览器</a>
  以获得更好的体验！</p>
<![endif]-->

<header class="am-topbar admin-header">
  <div class="am-topbar-brand">
    <strong>Admin</strong> <small>后台管理</small>
  </div>

  <button class="am-topbar-btn am-topbar-toggle am-btn am-btn-sm am-btn-success am-show-sm-only" data-am-collapse="{target: '#topbar-collapse'}"><span class="am-sr-only">导航切换</span> <span class="am-icon-bars"></span></button>

  <div class="am-collapse am-topbar-collapse" id="topbar-collapse">

    <ul class="am-nav am-nav-pills am-topbar-nav am-topbar-right admin-header-list">
      <li><a href="javascript:;"><span class="am-icon-envelope-o"></span> 收件箱 <span class="am-badge am-badge-warning">5</span></a></li>
      <li class="am-dropdown" data-am-dropdown>
        <a class="am-dropdown-toggle" data-am-dropdown-toggle href="javascript:;">
          <span class="am-icon-users"></span> ${Admin} <span class="am-icon-caret-down"></span>
        </a>
        <ul class="am-dropdown-content">
          <li><a href="#"><span class="am-icon-user"></span> 资料</a></li>
          <li><a href="#"><span class="am-icon-cog"></span> 设置</a></li>
          <li><a href="admin-loginout.jsp"><span class="am-icon-power-off"></span> 退出</a></li>
        </ul>
      </li>
      <li><a href="javascript:;" id="admin-fullscreen"><span class="am-icon-arrows-alt"></span> <span class="admin-fullText">开启全屏</span></a></li>
    </ul>
  </div>
</header>

<div class="am-cf admin-main">
  <!-- sidebar start -->
  <div class="admin-sidebar">
    <ul class="am-list admin-sidebar-list">
      <li><a href="admin-index.jsp"><span class="am-icon-home"></span> 首页</a></li>
      <li class="admin-parent">
        <a class="am-cf" data-am-collapse="{target: '#collapse-nav'}"><span class="am-icon-file"></span> 页面模块 <span class="am-icon-angle-right am-fr am-margin-right"></span></a>
        <ul class="am-list am-collapse admin-sidebar-sub am-in" id="collapse-nav">
          <li><a href="admin-user.jsp" class="am-cf"><span class="am-icon-check"></span> 个人资料<span class="am-icon-star am-fr am-margin-right admin-icon-yellow"></span></a></li>
          <li><a href="log4j"><span class="am-icon-calendar"></span> 系统日志</a></li>
          <li><a href="admin-404.jsp"><span class="am-icon-bug"></span> 404</a></li>
        </ul>
      </li>
       <li><a href="Admin"><span class="am-icon-table"></span> 用户管理</a></li>
      <li><a href="AdminAllgoods"><span class="am-icon-pencil-square-o"></span> 商品管理</a></li>
      <li><a href="Orderinquiry"><span class="am-icon-pencil-square-o"></span> 订单管理</a></li>
      
      
      <li><a href="admin-loginout.jsp"><span class="am-icon-sign-out"></span> 注销</a></li>
    </ul>

    <div class="am-panel am-panel-default admin-sidebar-panel">
      <div class="am-panel-bd">
        <p><span class="am-icon-bookmark"></span> 公告</p>
        <p>${notice}</p>
      </div>
    </div>

    <div class="am-panel am-panel-default admin-sidebar-panel">
      <div class="am-panel-bd">
        <p><span class="am-icon-tag"></span> market</p>
        <p>${notice}</p>
      </div>
    </div>
  </div>
  <!-- sidebar end -->

  <!-- content start -->
  <div class="admin-content">

    <div class="am-cf am-padding">
      <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">首页</strong> / </div>
    </div>

    <ul class="am-avg-sm-1 am-avg-md-4 am-margin am-padding am-text-center admin-content-list ">
      <li><a href="#" class="am-text-success"><span class="am-icon-btn am-icon-file-text"></span><br/>新增页面<br/>2300</a></li>
      <li><a href="#" class="am-text-warning"><span class="am-icon-btn am-icon-briefcase"></span><br/>成交订单<br/>308</a></li>
      <li><a href="#" class="am-text-danger"><span class="am-icon-btn am-icon-recycle"></span><br/>昨日访问<br/>80082</a></li>
      <li><a href="#" class="am-text-secondary"><span class="am-icon-btn am-icon-user-md"></span><br/>在线用户<br/>${count}</a></li>
    </ul>
 
    <div class="am-g">
      <div class="am-u-sm-12">
        <pre class="am-pre-scrollable">
        <table class="am-table am-table-bd am-table-striped admin-content-table">
          <thead>
         
          <tr style="font-size:15px;color:#AAAAAA">
          
            <th style="position:relative;left:35px;">ID</th>
            <th style="position:relative;left:85px;">用户名</th>
            <th style="position:relative;left:80px;">登录日期</th>
            <th style="position:relative;left:50px;">IP</th>
            <th style="position:relative;left:95px;">用户密码</th>
          </tr>
          </thead>
          
          <tbody>
          
<%  
    List sessions = SessionListener.getSessions();  
    String pageErrorInfo = null;  
    try{  
%>  
        <h5>用户连接</h5>  
          
        <table width="100%" align="center" cellspacing="1" cellpadding="4" border="0">  
       
<%  
        StringBuffer datas = new StringBuffer();  
        if(sessions!=null){  
            OnlineSession onlineSession = null;  
            Iterator it = sessions.iterator();  
            int count=0;  
            while(it.hasNext()){  
                count++;  
                onlineSession=(OnlineSession)it.next();  
                datas.append("<tr style='font-size:15px;color:#00AA00'><td style='position:relative;left:45px;'>");  
                datas.append(count);  
                datas.append("</td><td style='position:relative;left:175px;'>");  
                datas.append(onlineSession.getLoginId());  
                datas.append("</td><td style='position:relative;left:210px;'>");  
                datas.append(onlineSession.getOnlineTime());  
                datas.append("</td><td style='position:relative;left:-25px;'>");  
                datas.append(onlineSession.getIp()); 
                 datas.append("</td><td style='position:relative;left:-40px;'>");  
                datas.append(onlineSession.getPassword());   
                datas.append("</td></tr>");  
               HttpSession s = request.getSession(); 
               session.setAttribute("count",count);  
            }  
        }  
        out.print(datas.toString()); 
      
%>  
  
        </table>  
<%  
    }catch(Exception e){  
        pageErrorInfo = e.toString();  
    }finally{  
        if(pageErrorInfo!=null){  
%>  
            <font color="red">Error:<%=pageErrorInfo%></font>  
<%  
        }  
%>  
        
<%         
    }  
%>  

</pre>

          
    


<!--[if lt IE 9]>
<script src="assets/js/jquery1.11.1.min.js"></script>
<script src="assets/js/modernizr.js"></script>
<script src="assets/js/polyfill/rem.min.js"></script>
<script src="assets/js/polyfill/respond.min.js"></script>
<script src="assets/js/amazeui.legacy.js"></script>
<![endif]-->

<!--[if (gte IE 9)|!(IE)]><!-->
<script src="assets/js/jquery.min.js"></script>
<script src="assets/js/amazeui.min.js"></script>
<!--<![endif]-->
<script src="assets/js/app.js"></script>
</body>
</html>
