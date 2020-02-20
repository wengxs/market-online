<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'register.jsp' starting page</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
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
<title>注册页面</title>


<!--[if lt IE 9]>
<script src="js/html5shiv.js"></script>
<![endif]-->


<link href="css/jquery-ui.css" rel="stylesheet"/>
<link href="css/jquery.idealforms.min.css" rel="stylesheet" media="screen"/>


<style type="text/css">
body{font:normal 15px/1.5 Arial, Helvetica, Free Sans, sans-serif;color: #222;background:url(pattern.png);overflow-y:scroll;padding:60px 0 0 0;}
#my-form{width:770px;margin:0 auto;border:1px solid #ccc;padding:3em;border-radius:3px;box-shadow:0 0 2px rgba(0,0,0,.2);}
#comments{width:350px;height:100px;}

#Alignment{position: relative;
  top: -205px;
  left: 550px;
  
  }
</style>

</head>
<body>


<div class="row">

  <div class="eightcol last">

    <!-- Begin Form -->

    <form id="my-form" action="TUsers" method="post" >
 <section name="第一步">
        <b style="font-size:20px">新用户注册</b>
        <hr/>

          <div>
          <label>用户名:</label><input id="nickname" name="nickname" type="text"/></div>
          <div><label>密码:</label><input id="password" name="password" type="password"/></div>
           <div><label>确认密码:</label><input id="password1"  name="password1" type="password" onBlur="validatePWD()"/>
           <text id="div1"></text>
          </div>
           
          <div><label>邮箱:</label><input id="email" name="email" data-ideal="required email" type="email"/></div>
 
     <div id="Alignment" style="text-align:left;width:222px;">
<p>已有会员账号？可以<a href="login.jsp"style="color:red">直接登陆</a></p>
<hr/>
</div>
</section>
 <section name="第二步">
 <div><label>真实姓名:</label><input  id="realname" name="realname" type="text"/></div>
          <div><label>手机号码:</label><input type="text" name="phone" data-ideal="phone"/></div>
          <div><label>性别:</label>
          <select id="sex" name="sex">
            <option value="default">&ndash; 选择性别 &ndash;</option>
            <option type="text" name="sex" value="Male">男</option>
            <option type="text" name="sex" value="Female">女</option>
          </select>
        </div>
         <div><label>生日:</label><input name="birthday" class="datepicker" data-ideal="date" type="text" placeholder="月/日/年"/></div>
        <div><label>地址:</label><input type="text" name="address" /></div>
        
      </section>
      
      <section name="第三步">
          <div><label>QQ:</label><input type="text" name="qq" /></div>
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
        </div>
        <div><label>密保答案:</label><input type="text" name="answer" /></div>
      <div>
       <input type="submit"   value="提交"></input>
        <button id="reset" type="button" >重置</button>
   
      </div>
      </section>
      
      
 
    </form>



  </div>

</div>


<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="js/jquery-ui.min.js"></script>
<script type="text/javascript" src="js/jquery.idealforms.js"></script>
<script type="text/javascript">
var options = {

	onFail: function(){
		alert( '填写资料'+$myform.getInvalid().length+'出现错误'  )
	},

	inputs: {
		'password': {
			filters: 'required pass',
		},
	
		
		
		'nickname': {
			filters: 'required nickname',
			
		},
	'realname':{
		filters:'required realname',
		},
	'phone':{
		filters:'required phone',
		},
	
		'qq':{
		filters:'required qq'	
			},
		}
	
};



function validatePWD(){
	var pw1 =$("#password");
	var pw2 =$("#password1");
	if(pw1.val()!=pw2.val()){
		$("#div1").text("密码输入不一致，请重新输入！").css({"font-size":"12px","color":"red"});
		}
		else{
			$("#div1").text("");
			}
	}
	
var $myform = $('#my-form').idealforms(options).data('idealforms');

$('#reset').click(function(){
	$myform.reset().fresh().focusFirst();
});
	
</script>
<s:debug></s:debug>
</body>
</html>