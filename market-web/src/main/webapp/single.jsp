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
    
    <!-- InstanceBeginEditable name="doctitle" -->
    <title>${singleGoods.name} - Buy货商城</title>
    <!-- InstanceEndEditable -->
    <!-- Bootstrap Core CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css"  type="text/css">
	<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
	<!-- Custom CSS -->
    <link rel="stylesheet" href="css/style.css">
	<link href="css/style2.css" rel="stylesheet" type="text/css" media="all" />	
    <link href="css/style3.css" rel="stylesheet" type="text/css" media="all" />
    <link href="css/style4.css" rel="stylesheet" type="text/css" media="all" />
    <link rel="stylesheet" type="text/css" href="css/login.css">
    <!-- InstanceBeginEditable name="css" --><link rel="stylesheet" href="css/etalage.css">
	<!-- InstanceEndEditable -->	
	<!-- Custom Fonts -->
	<link rel="stylesheet" href="font-awesome/css/font-awesome.min.css"  type="text/css">
	<!-- jQuery and Modernizr-->
	<script src="js/jquery-2.1.1.js"></script>
	<script src="js/jquery.min.js"></script>
	<!-- Core JavaScript Files -->  	 
    <script src="js/bootstrap.min.js"></script>

	<style type="text/css">
		.foot-info {
			text-align: center;
		}
	</style>
	<!-- InstanceBeginEditable name="js" -->
	<script src="js/jquery.etalage.min.js"></script>
	<script>
		jQuery(document).ready(function($){
			$('#etalage').etalage({
				thumb_image_width: 300,
				thumb_image_height: 300,
				show_hint: true,
				click_callback: function(image_anchor, instance_id){
					alert('Callback example:\nYou clicked on an image with the anchor: "'+image_anchor+'"\n(in Etalage instance: "'+instance_id+'")');
				}
			});
			// This is for the dropdown list example:
			$('.dropdownlist').change(function(){
				etalage_show( $(this).find('option:selected').attr('class') );
			});
		});
	</script>
	<!----//details-product-slider--->	
	<script src="js/easyResponsiveTabs.js" type="text/javascript"></script>
	<script type="text/javascript">
		 $(document).ready(function () {
			$('#horizontalTab').easyResponsiveTabs({
				type: 'default', //Types: default, vertical, accordion           
				width: 'auto', //auto or any width like 600px
				fit: true   // 100% fit in a container
			});
		});
	</script>	
	<!-- InstanceEndEditable -->
  </head>

  <body>
	<jsp:include page="header.jsp"></jsp:include>
	<!--//////////////////////////////////////////////////-->
	<!--///////////////////HomePage///////////////////////-->
	<!--//////////////////////////////////////////////////-->
	<!-- InstanceBeginEditable name="page" --><div class="about_top">
  	<div class="container">
		
		<div class="content_right">
		   <div class="dreamcrub">
			   	 <ul class="breadcrumbs">
                    <li class="home">
首页                       <span>&gt;</span>
                    </li>
                    <li class="home">&nbsp;
                        ${singleGoods.categoryChild.category.name}&nbsp;
                        <span>&gt;</span>
                    </li>
                    <li class="home">
                        ${singleGoods.categoryChild.name}
                    </li>
                    
                </ul>
                <ul class="previous">
                	<li><a href="javascript:history.back(-1);" >返回前一页</a></li>
                </ul>
                <div class="clearfix"></div>
			   </div>
			   <div class="singel_right">
			     <div class="labout span_1_of_a1">
				<!-- start product_slider -->
				     <ul id="etalage">
							<c:forEach items="${singleGoods.listGoodsImg}" var="img">
							<li>
								<img class="etalage_thumb_image" src="${img.path}" class="img-responsive" />
								<img class="etalage_source_image" src="${img.path}" class="img-responsive" />
							</li>
							</c:forEach>
							<div class="clearfix"> </div>
						</ul>
					<!-- end product_slider -->
			  </div>
			  <div class="cont1 span_2_of_a1">
				<h1>${singleGoods.name}</h1>
				<ul class="rating">
				   <li><a class="product-rate" href="#"> </a> <span> </span></li>
				   <li><a href="#pl"> 累计评论： 1 条</a></li>
				   <div class="clearfix"></div>
			    </ul>
			    <div class="price_single">
				  <!-- <span class="reducedfrom">¥140.00</span> -->
				  <span class="actual">¥${singleGoods.price}</span><a href="#"><img src="images/chat.PNG" width="18" height="18"> 联系卖家</a>
				</div>
				<!--<h2 class="quick">Quick Overview:</h2>-->
				<p class="quick_desc">${singleGoods.content}</p>
			    <!-- <ul class="size">
					<h3>选择套餐</h3>
					<li><a href="#">套餐1</a></li>
					<li><a href="#">套餐2</a></li>
					<li><a href="#">套餐3</a></li>
					<li><a href="#">官方标配</a></li>
				</ul>
				<ul class="size">
					<h3>选择颜色</h3>
					<li><a href="#">黑色</a></li>
					<li><a href="#">白色</a></li>
				</ul> -->
				
				<form action="addToCart">
					<ul class="product-qty">
					   <span>购买数量：</span>
	                   <input name="number" type="number" size="3" class="input-text" title="请正确输入数字" value="1" min="1" step="1" style="width: 4em;" />
	                    (库存${singleGoods.stock}件)
	                    <input type="hidden" name="gid" value="${singleGoods.id}"/>
				    </ul>
				    <div class="btn_form">
						 <input type="submit" value="加入购物车" title="">
					</div>
				</form>
                
                
			</div>
			<div class="clearfix"></div>
		   </div>
		   <div class="sap_tabs">	
				     <div id="horizontalTab" style="display: block; width: 100%; margin: 0px;">
						  <ul class="resp-tabs-list">
						  	  <li class="resp-tab-item" aria-controls="tab_item-0" role="tab"><span>商品详情</span></li>
							  <li id="pl" class="resp-tab-item" aria-controls="tab_item-1" role="tab"><span>商品评价(3)</span></li>
							  <li class="resp-tab-item" aria-controls="tab_item-2" role="tab"><span>咨询问答</span></li>
							  <div class="clear"></div>
						  </ul>				  	 
							<div class="resp-tabs-container">
							    <div class="tab-1 resp-tab-content" aria-labelledby="tab_item-0">
									<div class="facts">
									  <ul class="tab_list">
									  	<li>${singleGoods.content}</li>
                                        <li><h3>正品行货</h3></li>
                                        <li>商城向您保证所售商品均为正品行货，自营商品开具机打发票或电子发票。</li>
									  	<li><h3>全国联保</h3></li>
                                        <li>凭质保证书及商城发票，可享受全国联保服务（奢侈品、钟表除外；奢侈品、钟表由商城联系保修，享受法定三包售后服务），与您亲临商场选购的商品享受相同的质量保证。商城还为您提供具有竞争力的商品价格和运费政策，请您放心购买！</li>
									  	<li>注：因厂家会在没有任何提前通知的情况下更改产品包装、产地或者一些附件，本司不能确保客户收到的货物与商城图片、产地、附件说明完全一致。只能确保为原厂正货！并且保证与当时市场上同样主流新品一致。若本商城没有及时更新，请大家谅解！</li>
									  	<li><h3>无忧退换货</h3></li>
                                        <li>客户购买自营商品7日内（含7日，自客户收到商品之日起计算），在保证商品完好的前提下，可无理由退货。（部分商品除外，详情请见各商品细则）</li>
									  </ul>           
							        </div>
							     </div>	
							      <div class="tab-1 resp-tab-content" aria-labelledby="tab_item-1">
									<div class="facts">
									  <ul class="tab_list">
									    <li>栏目建设中</li>
									  	<li>栏目建设中</li>
									  	<li>栏目建设中</li>
									  </ul>           
							        </div>
							     </div>	
							      <div class="tab-1 resp-tab-content" aria-labelledby="tab_item-2">
									<ul class="tab_list tab_last">
                                    <form>
                                    <div class="message-fild">
											<span>请输入您要咨询的问题，客服为您解答后将显示在下方:</span>
											<textarea> </textarea>
									</div>
                                    <div class="btn-toolbar form-group">
								        <input type="submit" id="contactFormSubmit" value="发送" class="btn btn-primary">
								      	<input type="reset" value="重写" class="btn btn-info">
    								</div>
                                    </form>
									  	<li>咨询内容：请问白色和黑色有什么区别<br>客服回复： 您好！外观区别哦。祝您购物愉快！</li>
									  	<li>咨询内容：你好！可以货到付款吗？<br>
客服回复： 您好！地址支持就可以货到付款的哦，您可以下单选择支付方式中是否有货到付款的哦，祝您购物愉快！</li>
									  </ul>      
							     </div>	
							 </div>
					      </div>
					 </div>	
					 <h3 class="like">你也许会喜欢</h3>        			
				     <ul id="flexiselDemo3">
						<li><img src="images/pic3.jpg" class="img-responsive"/><div class="grid-flex"><a href="#">广告位商品1</a><p>¥ 998.00</p></div></li>
						<li><img src="images/pic4.jpg" class="img-responsive"/><div class="grid-flex"><a href="#">同类热销商品1</a><p>¥ 998.00</p></div></li>
						<li><img src="images/pic5.jpg" class="img-responsive"/><div class="grid-flex"><a href="#">广告位商品2</a><p>¥ 998.00</p></div></li>
						<li><img src="images/pic3.jpg" class="img-responsive"/><div class="grid-flex"><a href="#">同类热销商品3</a><p>¥ 998.00</p></div></li>
						<li><img src="images/pic4.jpg" class="img-responsive"/><div class="grid-flex"><a href="#">广告位商品3</a><p>¥ 998.00</p></div></li>
				     </ul>
				    <script type="text/javascript">
					 $(window).load(function() {
						$("#flexiselDemo3").flexisel({
							visibleItems: 4,
							animationSpeed: 1000,
							autoPlay: true,
							autoPlaySpeed: 3000,    		
							pauseOnHover: true,
							enableResponsiveBreakpoints: true,
					    	responsiveBreakpoints: { 
					    		portrait: { 
					    			changePoint:480,
					    			visibleItems: 1
					    		}, 
					    		landscape: { 
					    			changePoint:640,
					    			visibleItems: 2
					    		},
					    		tablet: { 
					    			changePoint:768,
					    			visibleItems: 3
					    		}
					    	}
					    });
					});
				   </script>
				   <script type="text/javascript" src="js/jquery.flexisel.js"></script>
				   <h3 class="recent">同类热销产品</h3>
				   <ul id="flexiselDemo1">
						<li><img src="images/pic6.jpg" class="img-responsive"/><div class="grid-flex"><a href="#">我是商品1</a><p>¥ 998.00</p></div></li>
						<li><img src="images/pic7.jpg" class="img-responsive"/><div class="grid-flex"><a href="#">我是商品2</a><p>¥ 998.00</p></div></li>
						<li><img src="images/pic8.jpg" class="img-responsive"/><div class="grid-flex"><a href="#">我是商品3</a><p>¥ 998.00</p></div></li>
						<li><img src="images/pic6.jpg" class="img-responsive"/><div class="grid-flex"><a href="#">我是商品4</a><p>¥ 998.00</p></div></li>
						<li><img src="images/pic7.jpg" class="img-responsive"/><div class="grid-flex"><a href="#">我是商品5</a><p>¥ 998.00</p></div></li>
				     </ul>
				    <script type="text/javascript">
					 $(window).load(function() {
						$("#flexiselDemo1").flexisel({
							visibleItems: 4,
							animationSpeed: 1000,
							autoPlay: true,
							autoPlaySpeed: 3000,    		
							pauseOnHover: true,
							enableResponsiveBreakpoints: true,
					    	responsiveBreakpoints: { 
					    		portrait: { 
					    			changePoint:480,
					    			visibleItems: 1
					    		}, 
					    		landscape: { 
					    			changePoint:640,
					    			visibleItems: 2
					    		},
					    		tablet: { 
					    			changePoint:768,
					    			visibleItems: 3
					    		}
					    	}
					    });
					    
					});
				   </script>
		</div>
		<div class="clearfix"> </div>
	</div>
</div><!-- InstanceEndEditable -->	
	
<!--hone page end-->
    <jsp:include page="footer.jsp"></jsp:include>
  </body>
</html>