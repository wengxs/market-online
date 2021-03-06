<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!doctype html>
<html class="no-js">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Admin后台管理</title>
  <meta name="description" content="这是一个 table 页面">
  <meta name="keywords" content="table">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
  <meta name="renderer" content="webkit">
  <meta http-equiv="Cache-Control" content="no-siteapp" />
  <link rel="icon" type="image/png" href="assets/i/favicon.png">
  <link rel="apple-touch-icon-precomposed" href="assets/i/app-icon72x72@2x.png">
  <meta name="apple-mobile-web-app-title" content="Amaze UI" />
  <link rel="stylesheet" href="assets/css/amazeui.min.css"/>
  <link rel="stylesheet" href="assets/css/admin.css">
  <link rel="stylesheet" href="assets/css/loginDialog.css">
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
      <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">用户管理</strong> / <small>Table</small></div>
    </div>
    <!-- 修改更新用户 -->
<form action="Modifyingdata" method="post">

    <div id="LoginBox">
        <div class="row1">
          修改用户资料<a  title="关闭窗口" class="close_btn" id="closeBtn">×</a>
        </div>
        <div class="row">
           &nbsp;I&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;D: <span class="inputBox">
                <input type="text" id="txtPwd"  name="id" placeholder="ID" />
            </span>
        </div>
        <div class="row">
            用&nbsp;&nbsp;&nbsp;&nbsp;户: <span class="inputBox">
                <input type="text" id="txtPwd" name="nickname" placeholder="用户名" />
            </span>
        </div>
         <div class="row">
            密&nbsp;&nbsp;&nbsp;&nbsp;码: <span class="inputBox">
                <input type="text" id="txtPwd" name="password" placeholder="密码" />
            </span>
        </div> 
        <div class="row">
            邮&nbsp;&nbsp;&nbsp;&nbsp;箱: <span class="inputBox">
                <input type="text" id="txtPwd" name="email" placeholder="邮箱" />
            </span>
        </div>
          <div class="row">
            手&nbsp;&nbsp;&nbsp;&nbsp;机: <span class="inputBox">
                <input type="text" id="txtPwd" name="phone" placeholder="手机" />
            </span>
        </div>
        <div class="row">
        <input type="submit"   value="提交" id="loginbtn"></input>
        
        </div>
    </div>
</form>



    <div class="am-g">
      <div class="am-u-md-6 am-cf">
        <div class="am-fl am-cf">
          <div class="am-btn-toolbar am-fl">
            <div class="am-btn-group am-btn-group-xs">
              <button type="button" class="am-btn am-btn-default"><span class="am-icon-plus"></span> 新增</button>
              <button type="button" class="am-btn am-btn-default" id="example1"><span class="am-icon-save"></span> 修改</button>
              <button type="button" class="am-btn am-btn-default"><span class="am-icon-archive"></span> 审核</button>
              <button type="button" class="am-btn am-btn-default"><span class="am-icon-trash-o"></span> 删除</button>
              
            </div>

          
            
          </div>
        </div>
      </div>
      <div class="am-u-md-3 am-cf">
        <div class="am-fr">
          <div class="am-input-group am-input-group-sm">
            <input type="text" class="am-form-field">
                <span class="am-input-group-btn">
                  <button class="am-btn am-btn-default" type="button">搜索</button>
                </span>
          </div>
        </div>
      </div>
    </div>

    
<form class="am-form">
          <table class="am-table am-table-striped am-table-hover table-main">
            <thead>
              <tr>
                <th class="table-check"><input type="checkbox" /></th>
                <th class="table-id" style="position: relative;left:25px;">ID</th>
                <th class="table-title" style="position: relative;left:85px;">用户名</th>
                <th class="table-type" style="position: relative;left:150px;">用户密码</th>
                <th class="table-author"style="position: relative;left:160px;">邮箱</th>
                <th class="table-date" style="position: relative;left:30px;">手机号码</th>
                <th class="table-set">操作</th>
              </tr>
          </thead>
  <tbody>
          <s:iterator value ="#request.list" id="user">
            <tr>
              <td><input type="checkbox" /></td>
            
              
              <td class="caname"  style="position: relative;left:25px;"><s:property value="#user.id"/></td>
              <td class="caname"style="position: relative;left:85px;"><s:property value="#user.nickname"/></td>
              <td class="caname"style="position: relative;left:150px;"><s:property value="#user.password"/></td>
              <td class="caname"style="position: relative;left:120px;"><s:property value="#user.email"/></td>
              <td class="caname"style="position: relative;left:20px;"><s:property value="#user.phone"/></td>
               
              <td style="position: relative;">
<a href="<s:url action="Admin/userdelete!delete" >
<s:param name="id" value="id"/></s:url>">删除
</a>
              </td>
     
            </tr>
            
  </s:iterator>
   

</tbody>
</table>
 </form>
 
  
   
<p>
          
  <!--[if lt IE 9]>
<script src="assets/js/jquery1.11.1.min.js"></script>
<script src="assets/js/modernizr.js"></script>
<script src="assets/js/polyfill/rem.min.js"></script>
<script src="assets/js/polyfill/respond.min.js"></script>
<script src="assets/js/amazeui.legacy.js"></script>
<![endif]-->
          
  <!--[if (gte IE 9)|!(IE)]><!-->
  <script type="text/javascript" src="assets/js/jquery-1.8.3.min.js"></script>
  <script src="assets/js/jquery.min.js"></script>
  <script src="assets/js/amazeui.min.js"></script>
  <!--<![endif]-->
  <script src="assets/js/app.js"></script>
</p>
 <div class="am-fr">
  
 </div>
 
	<script type="text/javascript">
	$(function ($) {
		//弹出登录
		$("#example1").hover(function () {
			$(this).stop().animate({
				opacity: '1'
			}, 600);
		}, function () {
			$(this).stop().animate({
				opacity: '0.6'
			}, 1000);
		}).on('click', function () {
			$("body").append("<div id='mask'></div>");
			$("#mask").addClass("mask").fadeIn("slow");
			$("#LoginBox").fadeIn("slow");
		});
		
		//
		//按钮的透明度
$("#loginbtn").hover(function () {
			$(this).stop().animate({
				opacity: '1'
			}, 600);
		}, function () {
			$(this).stop().animate({
				opacity: '0.8'
			}, 1000);
		});
	
		//关闭
		$(".close_btn").hover(function () { $(this).css({ color: 'black' }) }, 
		function () { $(this).css({ color: '#999' }) }).on('click', function () {
			$("#LoginBox").fadeOut("fast");
			$("#mask").css({ display: 'none' });
		});
	});
	</script>	
	
		
</body>
</html>
