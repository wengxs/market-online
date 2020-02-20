<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Security_verification.jsp' starting page</title>
    
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

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<title>验证密保</title>


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
	top: 135px;
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
<form id="my-form" action="Securityverification" method="post">
<div>
      <h3>    用户登录</h3>
</div>
<div>
  <label> 用户名:</label><input id="nickname" name="nickname" type="text" />
  <div style="position: relative;
  top: -32px;
  left: 320px;"> <s:fielderror cssStyle="color:red">   <s:param>nickname</s:param></s:fielderror>
</div>
</div>
   <div><label>密保问题:</label>
          <select id="question" name="question">
            <option value="default">&ndash; 选择密保问题 &ndash;</option>
            <option name="question">您母亲的姓名是？</option>
            <option name="question">您父亲的姓名是？</option>
            <option name="question">您配偶的姓名是？</option>
            <option name="question">您的出生地是？</option>
            <option name="question">您父亲的生日是？</option>
            <option name="question">您母亲的生日是？</option>
            <option name="question">您配偶的生日是？</option>
          </select>
   <div style="position: relative;
  top: -32px;
  left: 320px;"> <s:fielderror cssStyle="color:red">   <s:param>question</s:param></s:fielderror>
</div>     
        
        </div>
  <div><label>密保问题:</label><input id="answer" name="answer" type="text"/>
  <div style="position: relative;
  top: -32px;
  left: 320px;"> <s:fielderror cssStyle="color:red">   <s:param>answer</s:param></s:fielderror>
</div>
  </div>
         

      
      <div style="position: relative;
  top: 10px;
  left: 86px;">
        <input type="submit" value="验证"></button>
    
</div>
    </form>



 


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