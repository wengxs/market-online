<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%
response.setHeader("Pragma","No-cache");
response.setHeader("Cache-Control","no-cache");
response.setDateHeader("Expires", 0);
%> 
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<meta http-equiv="pragma" content="no-cache">
 <meta http-equiv="cache-control" content="no-cache">
 <meta http-equiv="expires" content="0">  
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'register.jsp' starting page</title>
    
   
    <meta http-equiv="Content-Type" content="text/html; charset=gbk">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  <head>
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<title>用户登录</title>


<!--[if lt IE 9]>
<script src="js/html5shiv.js"></script>
<![endif]-->

<link href="css/normalize.css" rel="stylesheet"/>
<link href="css/jquery-ui.css" rel="stylesheet"/>
<link href="css/jquery.idealforms.min.css" rel="stylesheet" media="screen"/>

<style type="text/css">
body{font:normal 15px/1.5 Arial, Helvetica, Free Sans, sans-serif;color: #222;background:url(pattern.png);overflow-y:scroll;padding:60px 0 0 0;}
#my-form{width:540px;margin:0 auto;border:1px solid #ccc;padding:3em;border-radius:3px;box-shadow:0 0 2px rgba(0,0,0,.2);}
#comments{width:250px;height:100px;}
#apDiv1 {
	position: absolute;
	width: 425px;
	height: 187px;
	z-index: 1;
	left: 593px;
	top: 129px;
}
#apDiv2 {
	position: relative;
	width: 507px;
	height: 469px;
	z-index: 2;
	left: -500px;
	top: 500px;
}
</style>

</head>
<body>
<div id="apDiv2"><img src="login.jpg" width="488" height="461"></div>
<div class="row">

  <div class="eightcol last">

    <!-- Begin Form -->
    
<div id="apDiv1">
<form id="my-form" action="Login" method="post">
<div>
      <h3>    用户登录</h3>
</div>
<div>
  <label> 用户名:</label><input id="nickname" name="nickname" type="text" />
<div style="position: relative;
  top: -32px;
  left: 305px;">      <s:fielderror cssStyle="color:red">   <s:param>nickname</s:param></s:fielderror>
</div>
   </div>
  <div><label>密码:</label><input id="pass" name="password" type="password"/>
  <div style="position: relative;
  top: -32px;
  left: 305px;"> <s:fielderror cssStyle="color:red"> <s:param>password</s:param></s:fielderror>
</div>
  </div>
         

      
      <div style="position: relative;
  top: 10px;
  left: 72px;">
        <input type="submit" value="登录"></input>
      <a href="Securityverification.jsp">忘记密码？</a>
     <div>
    
<h4 style="font-size:20px;color:#999">还不是商城用户？</h4>
<p>一分钟轻松注册，就可以方便购物！<a href="register.jsp" style="font-size:15px;;color:red">免费注册</p>
</div>
</div>
    </form>

 



  </div>

</div>
</div>



<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="js/jquery-ui.min.js"></script>
<script type="text/javascript" src="js/jquery.idealforms.js"></script>
<script type="text/javascript">
var options = {

	onFail: function(){
		alert( $myform.getInvalid().length +' invalid fields.' )
	},

	inputs: {
		'password': {
			filters: 'required pass',
		},
		'username': {
			filters: 'required username',
		},
	
	}
	
};

var $myform = $('#my-form').idealforms(options).data('idealforms');

$('#reset').click(function(){
	$myform.reset().fresh().focusFirst()
});

$myform.focusFirst();
</script>
<div style="position: relative;
  top: 530px;
  left: 60px;">
<s:debug></s:debug> </div>
</body>

</html>