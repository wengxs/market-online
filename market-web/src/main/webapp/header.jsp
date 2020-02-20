<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
	<!-- Top Start -->
	<nav id="top">
		<div class="container">
			<div class="row">
				<div class="col-xs-6" style="line-height: 50px; height: 50px;">
					<c:if test="${currentUser==null}"><a data-toggle="modal" href="#login-modal">登录</a> | <a data-toggle="modal" href="#signup-modal">注册</a></c:if>
					<c:if test="${currentUser!=null}"><div>欢迎:${currentUser.nickname}！<!-- 您有 <a data-toggle="modal" href="#login-modal">0</a> 条新信息. --><a href="logout">退出</a></div></c:if>
				</div>
				<div class="col-xs-6">
					<form action="" method="post">
						<ul class="top-link">
							<li><c:if test="${currentUser!=null}"><a href="myOrder.jsp"><span class="glyphicon glyphicon-user"></span>我的订单</a></c:if></li>
							<%-- <li><a href="myOrder.jsp"><span class="glyphicon glyphicon-envelope"></span>我的订单</a></li> --%>
	                        <input type="text" placeholder="      搜索商品" class="input-medium search-query" />  
	                        <button type="submit" ><span class="glyphicon glyphicon-search"></span></button>
				  		</ul>
				  	</form>
				</div>
			</div>
		</div>
	</nav>
	<!-- 登录 -->
	<div class="modal" id="login-modal">
		<a class="close" data-dismiss="modal">×</a>
		<h1>登录</h1>
		<ul class="login-bind-tp">
			<li class="qweibo"> <a href="#"><em>&nbsp;</em> QQ登录</a> </li>
			<li class="sina"> <a href="#"><em>&nbsp;</em> 微博登录</a> </li>
		</ul>
		<p>使用已有帐号登陆：</p>
		<form class="login-form clearfix" method="post" action="login">
			<div class="form-arrow"></div>
			<input name="email" type="text" placeholder="邮箱/用户名">
			<input name="password" type="password" placeholder="密码：">
			<input type="submit" name="type" class="button-blue login" value="登录">
			<input type="hidden" name="return-url" value="">
			<div class="clearfix"></div>
			<label class="remember"><input name="remember" type="checkbox" checked/>下次自动登录 </label>
			<a class="zhuce">快速注册</a> <a class="forgot">忘记密码?</a>
		</form>
	</div>
	<!-- 注册 -->
	<div class="modal" id="signup-modal">
		<a class="close" data-dismiss="modal">×</a>
		<h1>注册</h1>
		<p>请填写注册信息：</p>
		<form class="signup-form clearfix" method="post" action="regist">
			<p class="error"></p>
			<input name="nickname" type="text" placeholder="用户名：">
			<input name="email" type="text" placeholder="邮箱：">
			<input name="password" type="password" placeholder="密码：">
			<input name="repassword" type="password" placeholder="确认密码：">
			<input type="hidden" name="title" value="getUrl()">
			<input type="hidden" name="currentUrl" id="currentUrl">
			<div class="clearfix"></div>
			<input type="submit" name="type" class="button-blue reg" value="注册">
		</form>
	</div>
	<!-- 忘记密码 -->
	<div class="modal" id="forgetform">
		<a class="close" data-dismiss="modal">×</a>
		<h1>忘记密码</h1>
		<form class="forgot-form" method="post" action="#">
			<input name="email" value="" placeholder="注册邮箱：">
			<div class="clearfix"></div>
			<input type="submit" name="type" class="forgot button-blue" value="发送重设密码邮件">
		</form>
	</div>
	<script type="text/javascript">
		$(document).ready(function(){
			$("#currentUrl").val(window.location.href);
			// 注册
			$("a.zhuce").click(function(){
				$("#signup-modal").modal({show:!0})
				$("#login-modal").modal("hide");
			});
			// 忘记密码
			$("a.forgot").click(function(){
				$("#login-modal").modal("hide");
				$("#forgetform").modal({show:!0})
			});
	
			$("#signup-modal").modal("hide");
			$("#forgetform").modal("hide");
			$("#login-modal").modal("hide");
		});
	</script>
	<!-- Top End -->
	
	<!-- Header Start -->
	<header class="container">
		<div class="row">
			<div class="col-md-4"><div id="logo"></div></div>
			<div class="col-md-4"><img src="images/logo.png" /></div>
            <!--begin-->
    		<div class="container">
	  			<div class="header_top">
					<div class="header-bottom-right">
				       	<ul class="icon1 sub-icon1 profile_img">
							<li>
								<a class="btn btn-1" href="check.jsp"><span class="glyphicon glyphicon-shopping-cart"></span>我的购物车</a>
								<div class="rate">0</div>
								<ul class="sub-icon1 list">
									<h3 class="cart_list">宝贝列表(0)</h3>
									<div class="shopping_cart">
									<c:forEach items="${cart.mapCart}" var="cart">
				                        <div class="cart_box">
											<div class="message">
										   	    <div class="alert-close"> </div> 
								                <div class="list_img"><img src="${cart.value.listGoodsImg[0].path}" class="img-responsive" alt=""/></div>
											    <div class="list_desc">
											    <h4><a href="single?gid=${cart.key}"><span id="gid">${cart.key}</span>${cart.value.name}</a></h4>
											    ${cart.value.number} x<span class="actual"> ¥${cart.value.price}</span>
											    </div>
					                            <div class="clearfix"></div>
											</div>
										</div>
									</c:forEach>
				                    </div>
				                    <div class="total">
				                    	<div class="total_left">合计总价 : </div>
				                    	<div class="total_right">¥${cart.subtotal}</div>
				                    	<div class="clearfix"> </div>
				      				</div>
			                        <div class="login_buttons">
										<div class="login_button"><a href="check.jsp">去购物车结账</a></div>
										<div class="clearfix"></div>
									</div>
								    	<div class="clearfix"></div>
									</ul>
								 </li>
							</ul>
           				<div class="clearfix"></div>
          			</div>	
		      	</div>
			</div>	
			<!--end-->
		</div>
	</header>
	<script>
		$(document).ready(function(c) {
			var listNumber = $(".cart_box").size();
			$(".cart_list").html("宝贝列表("+listNumber+")");
			$(".rate").html(listNumber);
			
			$('.alert-close').on('click', function(c){
				$(this).parent().fadeOut('slow', function(c){
			  		$(this).parent().remove();
			  		listNumber--;
			  		$(".cart_list").html("宝贝列表("+listNumber+")");
			  		$(".rate").html(listNumber);
			  		var gid=$(this).find("#gid").html();
				});
			});
			
		});
	</script>
	<!-- Header End -->
	
	<!-- Navigation Start -->
	<nav id="menu" class="navbar">
		<div class="container">
			<div class="navbar-header">
				<span id="heading" class="visible-xs">商品分类</span>
				<button type="button" class="btn btn-navbar navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse"><i class="fa fa-bars"></i></button>
			</div>
			<div class="collapse navbar-collapse navbar-ex1-collapse">
				<ul class="nav navbar-nav">
					<li><a href="index.jsp">首页</a></li>
					<%-- <c:forEach items="${menu}" var="m">
					<li class="dropdown">
						<a href="" class="dropdown-toggle" data-toggle="dropdown">${m.name}</a>
						<div class="dropdown-menu">
							<div class="dropdown-inner">
								<ul class="list-unstyled">
									<c:forEach items="${m.submenu}" var="sm">
									<li><a href="list?category=${sm.id}">${sm.name}</a></li>
									</c:forEach>
								</ul>
							</div> 
						</div>
					</li>
					</c:forEach> --%>
					<s:iterator id="m" value="#application.menu">
					<li class="dropdown">
						<a href="" class="dropdown-toggle" data-toggle="dropdown"><s:property value="#m.name" /></a>
						<div class="dropdown-menu">
							<div class="dropdown-inner">
								<ul class="list-unstyled">
									<s:iterator id="sm" value="#m.submenu">
									<li><a href="list?category=<s:property value="#sm.id" />"><s:property value="#sm.name" /></a></li>
									</s:iterator>
								</ul>
							</div> 
						</div>
					</li>
					</s:iterator>
				</ul>
			</div>
		</div>
	</nav>
	<!-- Navigation End -->