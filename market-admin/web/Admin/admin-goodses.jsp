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
   <link rel="stylesheet" href="assets/css/admin-goodses.css">

<script>
window.onload = function()
{
	var dd = new Date();
	var mon = dd.getUTCMonth()+1;
        if(mon < 10)
            mon = "0"+mon;
	var year = dd.getUTCFullYear();
	var day = dd.getUTCDate();
	var h=dd.getHours(); //获取当前小时数(0-23)
    var m= dd.getMinutes(); //获取当前分钟数(0-59)
    var s=dd.getSeconds(); //获取当前秒数(0-59)
	document.getElementById("date").value = year+"-"+mon+"-"+day+" "+h+":"+m+":"+s;
}
</script>
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
      <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">商品管理</strong> / <small>Table</small></div>
    </div>

  <!-- 添加商品 -->
<form action="AdminGoodses" method="post">

    <div id="LoginBox">
        <div class="row1">
          修改用户资料<a  title="关闭窗口" class="close_btn" id="closeBtn">×</a>
        </div>

        
         <table class="am-table am-table-striped am-table-hover table-main">
            <thead>
              <tr>
                <th class="table-check"><input type="checkbox" /></th>
                <th class="table-id" style="position: relative;left:15px;">ID</th>
                <th class="table-title" style="position: relative;left:10px;">商品名称</th>
                <th class="table-type"style="position: relative;left:45px;">商品介绍</th>
                <th class="table-type" style="position: relative;">类别编号</th>
                <th class="table-type" style="position: relative;left:15px;">售价</th>
                <th class="table-type"style="position: relative;left:45px;">商品库存</th> 
                <th class="table-type" style="position: relative;left:60px;">上架</th> 
                  <th class="table-date" style="position: relative;left:90px;">上架时间</th>      
                 <th class="table-type" style="position: relative;left:130px;">售出数量</th>  
                <th class="table-set" style="position: relative;left:185px;">操作</th>
              </tr>
          </thead>
  
  <tbody>
   
            <tr>
              <td><input type="checkbox" /></td>
            <td> <input type="text" id="txtPwd"  name="id" placeholder="商品ID" style="width:50px;height:25px"/></td> 
              <td> <input type="text" id="txtPwd"  name="name" placeholder="商品名称" style="width:80px;height:25px"/></td>
              <td> <input type="text" id="txtPwd"  name="content" placeholder="商品介绍" style="width:200px;height:25px"/></td>
              <td> <input type="text" id="txtPwd"  name="categoryid" placeholder="类别编号" style="width:100px;height:25px"/></td>
              <td> <input type="text" id="txtPwd"  name="price" placeholder="售价" style="width:50px;height:25px;position: relative; left:15px;"/></td>
              <td> <input type="text" id="txtPwd"  name="stock" placeholder="商品库存" style="width:70px;height:25px;position: relative; left:45px;" /></td>
              <td> <input type="text" id="txtPwd"  name="isSell" placeholder="上架" value="Y" style="width:30px;height:25px;position: relative; left:65px;"/></td>
               <td> <input type="text" id="date"  name="saleTime" placeholder="上架时间"  style="border:none;;width:100px;height:25px;position: relative; left:85px;"/></td>
              <td> <input type="text" id="txtPwd"  name="saleCount" placeholder="售出数量"  value="0" style="width:65px;height:25px; position: relative; left:130px;"/></td>
               <td> <input type="submit"   value="提交" id="loginbtn" style="position: relative;left:60px; top:-10px; " ></input></td>
              <td><input id="loginbtn" type="reset" name="reset" value="重置" style="position: relative;left:-30px; top:-10px;"></input></td>
     
       </tr>
       
       </tbody>
       
      
       </table>
      
     </form>
    </div>






    <div class="am-g">
      <div class="am-u-md-6 am-cf">
        <div class="am-fl am-cf">
          <div class="am-btn-toolbar am-fl">
            <div class="am-btn-group am-btn-group-xs">
              <button type="button" class="am-btn am-btn-default" id="example1"><span class="am-icon-plus"></span> 新增</button>
              <button type="button" class="am-btn am-btn-default"><span class="am-icon-save"></span> 保存</button>
              <button type="button" class="am-btn am-btn-default"><span class="am-icon-archive"></span> 审核</button>
              <button type="button" class="am-btn am-btn-default"><span class="am-icon-trash-o"></span> 删除</button>
            </div>

            <div class="am-form-group am-margin-left am-fl">
              <select>
                <option value="option1">所有类别</option>
                <option value="option2">IT业界</option>
                <option value="option3">数码产品</option>
                <option value="option3">笔记本电脑</option>
                <option value="option3">平板电脑</option>
                <option value="option3">只能手机</option>
                <option value="option3">超极本</option>
              </select>
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

    <div class="am-g">
      <div class="am-u-sm-12">
<form class="am-form">
          <table class="am-table am-table-striped am-table-hover table-main">
            
            <tr>
            <th class="table-check"><input type="checkbox" /></th>
                <th class="table-id" style="position: relative;left:15px;">ID</th>
                <th class="table-title" style="position: relative;left:40px;">商品名称</th>
                <th class="table-type"style="position: relative;left:35px;">商品介绍</th>
                 <th class="table-type" style="position: relative;left:45px;">类别编号</th>
                <th class="table-type" style="position: relative;left:25px;">售价</th>
                <th class="table-type"style="position: relative;left:25px;">商品库存</th> 
                <th class="table-type" style="position: relative;left:25px;">上架</th>    
                <th class="table-type" style="position: relative;left:60px;">上架时间</th> 
                 <th class="table-type" style="position: relative;left:-35px;">售出数量</th>  
                <th class="table-set" style="position: relative;">操作</th>
 </tr>
        
        <tbody>
          <s:iterator value ="#request.goodses" id="goodses">
            <tr>
              <td><input type="checkbox" /></td>
              <td class="caname"  style="position: relative;left:12px;"><s:property value="#goodses.id"/></td>
              <td class="caname"style="position: relative;left:25px;"><s:property value="#goodses.name"/></td>
              <td class="caname"style="position: relative;left:30px;"><s:property value="#goodses.content"/></td>
              <td class="caname"style="position: relative;left:65px;"><s:property value="#goodses.categoryid"/></td>
              <td class="caname"style="position: relative;left:25px;"><s:property value="#goodses.price"/></td>
              <td class="caname"style="position: relative;left:45px;"><s:property value="#goodses.stock"/></td>
              <td class="caname"style="position: relative;left:35px;"><s:property value="#goodses.isSell"/></td>
              <td class="caname"style="position: relative;left:25px;"><s:property value="#goodses.saleTime"/></td>
              <td class="caname"style="position: relative;left:-14px;"><s:property value="#goodses.saleCount"/></td>
<td style="position: relative;">
<a href="<s:url action="Admin/goodsesdelete!delete" ><s:param name="id" value="id"/></s:url>">删除
</a>
</td>
     
         </tr>
            
  </s:iterator>
   

</tbody>         
             
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
