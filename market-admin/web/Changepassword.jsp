<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  
    <base href="<%=basePath%>">
    
    <title>My JSP 'Changepassword.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<!--[if IE 8 ]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9 ]> <html lang="en" class="ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en"> <!--<![endif]-->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<title>用户修改密码</title>


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
	left: 370px;
	top: 129px;
}
#apDiv2 {
	position: absolute;
	width: 507px;
	height: 469px;
	z-index: 2;
	left: 65px;
	top: 131px;
}
</style>

</head>
<body>
<div class="row">

  <div class="eightcol last">

    <!-- Begin Form -->
    
<div id="apDiv1">
<form id="my-form" action="Changepassword" method="post">
<div>
      <h3>    修改密码</h3>
</div>

<div>
<label> 会员ID:</label><input id="id" name="id" value="${id}" type="text"/></div>
<div>
<label> 新密码:</label><input id="password" name="password" type="password" /></div>
  <div><label>再次确认:</label><input id="password1" name="password1" type="password"/></div>
         

      
      <div style="position: relative;
  top: 10px;
  left: 86px;">
        <input type="submit" value="修改密码"></button>
</div>
    </form>



  </div>

</div>
</div>



<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="js/jquery-ui.min.js"></script>
<script type="text/javascript" src="js/jquery.idealforms.js"></script><script type="text/javascript">
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

</script>

</body>
</html>