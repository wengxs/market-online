<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>我的订单</title>
    <link rel="stylesheet" href="css/bootstrap.min.css"  type="text/css">
	<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
	<!-- Custom CSS -->
    <link rel="stylesheet" href="css/style.css">
	<link href="css/style2.css" rel="stylesheet" type="text/css" media="all" />	
    <link href="css/style3.css" rel="stylesheet" type="text/css" media="all" />
    <link href="css/style4.css" rel="stylesheet" type="text/css" media="all" />
    <link rel="stylesheet" type="text/css" href="css/login.css">
    <!-- InstanceBeginEditable name="css" --><!-- <link href="css/style4.css" rel="stylesheet" type="text/css" media="all" /> --><!-- InstanceEndEditable -->	
	<!-- Custom Fonts -->
	<link rel="stylesheet" href="font-awesome/css/font-awesome.min.css"  type="text/css">
	<!-- jQuery and Modernizr-->
	<script src="js/jquery-2.1.1.js"></script>
	<script src="js/jquery.min.js"></script>
	<!-- Core JavaScript Files -->  	 
    <script src="js/bootstrap.min.js"></script>
    
    <script type="text/javascript" src="js/modal.js"></script>
	<style type="text/css">
		.foot-info {
			text-align: center;
		}
	</style>
  </head>
  
  <body>
    <jsp:include page="header.jsp"></jsp:include>
    <div class="container">
    	<div class="order" style="float:right">
		  	<s:action name="order_show" id="show" namespace="/" />
		    <c:forEach items="${show.myOrder}" var="lo">
		    <table border="1" cellspacing="0" width="900px" style="margin-bottom: 20px;">
		    	<tr style="background-color: #CCC; text-align: center;">
		    		<td width="180px">订单编号：${lo.id}</td>
		    		<td>下单时间：<fmt:formatDate value="${lo.orderTime}" pattern="yyyy-MM-dd hh:mm:ss" /></td>
		    		<td width="150px">总计：￥${lo.total}</td>
		    		<td  width="240px">订单状态：${lo.orderStatus.status}&nbsp;
		    		<c:if test="${lo.orderStatus.id==1}"><a href="order_update?oid=${lo.id}&sid=2">付款</a>&nbsp;&nbsp;<a href="order_update?oid=${lo.id}&sid=4">取消</a></c:if>
		    		<c:if test="${lo.orderStatus.id==2}"><a href="order_update?oid=${lo.id}&sid=3">确认收货</a></c:if>
		    		</td>
		    	</tr>
		    	<tr>
		    		<td colspan="4">	
		    			<table width="100%">
		    				<c:forEach items="${lo.orderContent}" var="oc">
		    				<tr style="text-align: center;">
		    					<td width="100px">
		    					<c:forEach items="${oc.goods.goodsImgs}" var="img" begin="0" end="0">
		    						<a href="single?gid=${oc.goods.id}"><img title="${oc.goods.name}" src="${img.path}" style="height: 45px; margin: 5px" /></a>
		    					</c:forEach>
		    					</td>
		    					<td style="text-align: left;"><a href="single?gid=${oc.goods.id}">${oc.goods.name}</a></td>
		    					<td width="100px">×${oc.number}</td>
		    					<td width="100px">小计￥${oc.subtotal}</td>
		    				</tr>
		    				</c:forEach>
		    			</table>
		    		</td>
		    	</tr>
			</table>
		    </c:forEach>
		    <div></div>
		</div>
    </div>
    <jsp:include page="footer.jsp"></jsp:include>
  </body>
</html>
