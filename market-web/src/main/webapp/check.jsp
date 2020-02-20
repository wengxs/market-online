<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>我的购物车 - Buy货商城</title>
    <!-- InstanceEndEditable -->
    <!-- Bootstrap Core CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css"  type="text/css">
	<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
	<!-- Custom CSS -->
    <link rel="stylesheet" href="css/style.css">
	<link href="css/style2.css" rel="stylesheet" type="text/css" media="all" />	
    <link href="css/style3.css" rel="stylesheet" type="text/css" media="all" />
    <link rel="stylesheet" type="text/css" href="css/login.css">
    <!-- InstanceBeginEditable name="css" --><link href="css/style4.css" rel="stylesheet" type="text/css" media="all" /><!-- InstanceEndEditable -->	
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
	<!--//////////////////////////////////////////////////-->
	<!--/////////////////HomePage/////////////////////-->
	<!--//////////////////////////////////////////////////-->
	<!-- InstanceBeginEditable name="page" -->

<div class="container">
	<div class="dreamcrub">
		<ul class="breadcrumbs">
             <li class="home">
				首页<span>&gt;</span>
             </li>
             <li class="home">&nbsp;
                 我的购物车
             </li>
        </ul>
        <ul class="previous">
             <li><a href="javascript:history.back(-1);" >返回前一页</a></li>
        </ul>
        <div class="clearfix"></div>
	</div>
	
	<div class="row">
                <div class="col-md-12">
                    <div class="product-content-right">
                        <div class="woocommerce">
                        	<!-- 购物车表单 -->
                            <form method="post" action="#">
                                <table cellspacing="0" class="shop_table cart">
                                    <thead>
                                        <tr>
                                            <th class="product-remove">&nbsp;</th>
                                            <th class="product-thumbnail">&nbsp;</th>
                                            <th class="product-name">商品名称</th>
                                            <th class="product-price">单价</th>
                                            <th class="product-quantity">数量</th>
                                            <th class="product-subtotal">总价</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${cart.mapCart}" var="cart">
                                        <tr class="cart_item">
                                            <td class="product-remove">
                                                <a title="无情删除" class="remove" href="deleteFromCart?gid=${cart.key}">×</a> 
                                            </td>

                                            <td class="product-thumbnail">
                                                <a href="single?gid=${cart.key}"><img width="145" height="145" alt="poster_1_up" class="shop_thumbnail" src="${cart.value.listGoodsImg[0].path}"></a>
                                            </td>

                                            <td class="product-name">
                                                <a href="single?gid=${cart.key}">${cart.value.name}</a> 
                                            </td>

                                            <td class="product-price">
                                                <span class="amount">¥${cart.value.price}</span> 
                                            </td>

                                            <td class="product-quantity">
                                                <div class="quantity buttons_added">
                                                    <!--<input type="button" class="minus" value="-">-->
                                                    <input type="number" size="4" class="input-text qty text" title="Qty" value="${cart.value.number}" min="1" step="1">
                                                    <!--<input type="button" class="plus" value="+">-->
                                                </div>
                                            </td>

                                            <td class="product-subtotal">
                                                <span class="amount">¥${cart.value.subtotal}</span>
                                            </td>
                                        </tr>
                                      </c:forEach>
                                        <tr>
                                            <td class="actions" colspan="6">
                                                
                                         
                                                <input type="submit" value="结算" name="proceed" class="checkout-button button alt wc-forward">
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>
                            </form>
							
							<!--  -->
							<form action="order_add" method="get">
                            <div class="cart-collaterals">
                            	<!-- 地址start -->
                            	<div class="cross-sells">
	                                <h2>收货地址确认：</h2>
	                                <div class="col-1" id="radios">
	                                	<c:forEach items="${currentUser.addresses}" var="add">
	                                	<input type="radio" name="addressid" id="r${add.id}" value="${add.id}" /><label for="r${add.id}">${add.addressee}　${add.address}　${add.phone}</label><br />
	                                	</c:forEach>
	                                	<input type="radio" id="addnew" name="addressid" value="0" /><label for="addnew">使用新地址</label><br />
	                                	<script type="text/javascript">
	                                		$(document).ready(function() {
	                                			$("#radios input:radio:first").attr("checked", "checked");
	                                			$("#addressForm").hide();
	                                			$("#addressForm input").attr("disabled","disabled");
	                                			if($("#addnew").attr("checked")){
	                                				$("#addressForm").show();
	                                				$("#addressForm input").attr("disabled",false);
	                                			}
	                                			$("#radios input:radio").click(function() {
	                                				$("#addressForm").hide();
	                                				$("#addressForm input").attr("disabled","disabled");
	                                			});
	                                			$("#addnew").click(function() {
	                                				$("#addressForm").show();
	                                				$("#addressForm input").attr("disabled",false);
	                                			});
	                                		});
	                                	</script>
	                                </div>
	                                <div class="col-1" id="addressForm">
	                                	<div class="woocommerce-billing-fields">
                                            <p id="billing_first_name_field" class="form-row form-row-first validate-required">
                                                <abbr title="请写明全称" class="required"><label class="" for="billing_first_name">收货人姓名*
                                                </label></abbr>
                                                <input type="text" value="" placeholder="收货人姓名" id="billing_first_name" name="addressee" class="input-text ">
                                            </p>
                                            <div class="clear"></div>
                                            <p id="billing_address_1_field" class="form-row form-row-wide address-field validate-required">
                                                <abbr title="建议如实填写收货地址 例如街道名称楼层及门牌" class="required"><label class="" for="billing_address_1">详细地址 *
                                                </label></abbr>
                                                <input type="text" value="" placeholder="请仔细填写您的收货地址" id="billing_address_1" name="address" class="input-text ">
                                            </p>
                                            <p id="billing_phone_field" class="form-row form-row-last validate-required validate-phone">
                                                <abbr title="此项重要 请填写能联系到您的号码" class="required"><label class="" for="billing_phone">手机号码 *
                                                </label></abbr>
                                                <input type="text" value="" placeholder="手机号码" id="billing_phone" name="phone" class="input-text ">
                                            </p>
                                            <div class="clear"></div>
											<p id="billing_city_field" class="form-row form-row-wide address-field validate-required" data-o_class="form-row form-row-wide address-field validate-required">
                                                <abbr title="请仔细核对修改" class="required"><label class="" for="billing_city">邮政编码
                                                </label></abbr>
                                                <input type="text" value="" placeholder="邮政编码" id="billing_city" name="zipCode" class="input-text ">
                                            </p>
                                            <div class="clear"></div>
	                                    </div>
	                                </div>
                            	</div>
	                            <!-- 地址end -->
                            	<div class="cart_totals ">
                                	<h2>确认订单：</h2>

                                	<table cellspacing="0">
                                    	<tbody>
                                        	<!-- <tr class="cart-subtotal">
                                            	<th>商品小计</th>
                                            	<td><span class="amount">¥40.00</span></td>
                                        	</tr> -->
                                        	<tr class="shipping">
                                            	<th>配送费用</th>
                                            	<td>免运费</td>
                                        	</tr>
                                        	<tr class="order-total">
                                            	<th>价格总计</th>
                                            	<td><strong><span class="amount">¥${cart.subtotal}</span></strong> </td>
                                        	</tr>
                                    	</tbody>
                                	</table>
                            	</div>
                        	
					        	<div id="payment">
					        		<h2 style="color:#5A88CA; font-size:25px; margin-bottom:25px; text-transform:uppercase;">支付方式：</h2>
					               	<ul class="payment_methods methods">
					                   	<li class="payment_method_bacs">
					                       	<input type="radio" data-order_button_text="" checked="checked" value="bacs" name="payment_method" class="input-radio" id="payment_method_bacs">
					                       	<label for="payment_method_bacs">货到付款 </label>
					                       	<div class="payment_box payment_method_bacs">
					                         		<p>请事先与卖家沟通是否在派送范围及收取的人工送货费用,请自备零钞.</p>
					                           </div>
					                        </li>
					                   </ul>
									<div class="form-row place-order">
										<input type="submit" data-value="立即下单" value="立即下单" id="place_order" name="woocommerce_checkout_place_order" class="button alt">
									</div>
					      		</div>
                            
                        	</div>
                        	</form>
                        </div>                        
                    </div>                    
                </div>
	</div>
</div>
<!-- InstanceEndEditable -->	
	
<!--hone page end-->
	<jsp:include page="footer.jsp"></jsp:include>
  </body>
</html>
