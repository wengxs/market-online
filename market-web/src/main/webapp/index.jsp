<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Buy货商城</title>
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
    <!-- InstanceBeginEditable name="page" -->
	<div id="page-content" class="home-page">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<!-- Carousel -->
					<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
						<!-- Indicators -->
						<ol class="carousel-indicators hidden-xs">
							<li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
							<li data-target="#carousel-example-generic" data-slide-to="1"></li>
							<li data-target="#carousel-example-generic" data-slide-to="2"></li>
						</ol>
						<!-- Wrapper for slides -->
						<div class="carousel-inner">
							<div class="item active">
								<img src="images/main-banner1-1903x600.jpg" alt="First slide">
								<!-- Static Header -->
								<div class="header-text hidden-xs">
									<div class="col-md-12 text-center">
									</div>
								</div><!-- /header-text -->
							</div>
							<div class="item">
								<img src="images/main-banner2-1903x600.jpg" alt="Second slide">
								<!-- Static Header -->
								<div class="header-text hidden-xs">
									<div class="col-md-12 text-center">
									</div>
								</div><!-- /header-text -->
							</div>
							<div class="item">
								<img src="images/main-banner1-1903x600.jpg" alt="Third slide">
								<!-- Static Header -->
								<div class="header-text hidden-xs">
									<div class="col-md-12 text-center">
									</div>
								</div><!-- /header-text -->
							</div>
						</div>
						<!-- Controls -->
						<a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
							<span class="glyphicon glyphicon-chevron-left"></span>
						</a>
						<a class="right carousel-control" href="#carousel-example-generic" data-slide="next">
							<span class="glyphicon glyphicon-chevron-right"></span>
						</a>
					</div><!-- /carousel -->
				</div>
			</div>
			<s:action name="index_top" id="ta" namespace="/" />
			<div class="row">
			  	<!--content-->
				<div class="container">
					<div class="women-in">
					<!---->
						<div class="lady-in-on">
							<div class="buy-an">
								<h3>精品推荐</h3>
								<br>
							</div>
							<ul id="flexiselDemo1">
								<c:forEach items="${ta.top}" var="topl" begin="0" end="7">
								<li>
									<a href="">
									<!-- <img class="img-responsive women" src="images/pic1.jpg" alt=""> -->
									<c:forEach items="${topl.goodsImgs}" var="img" begin="0" end="0">
										<img class="img-responsive women"  src="${img.path}" style="height: 250px;" />
									</c:forEach>
									</a>
									<div class="hide-in">
										<p><a href="single?gid=${topl.id}" title="${topl.name}">
          								<c:if test="${fn:length(topl.name)>20}">${fn:substring(topl.name,0,20)}…</c:if>
 										<c:if test="${fn:length(topl.name)<=20}">${topl.name}</c:if>
 										</a></p>
										<%-- <span>¥${topl.price}  |  <a href="single.html">任性剁手 </a></span> --%>
									</div>
								</li>
								</c:forEach>
								<%-- <li>
									<a href=""><img class="img-responsive women" src="images/pic1.jpg" alt=""></a>
									<div class="hide-in">
										<p>  看什么看你买不起我</p>
										<span>¥179.00  |  <a href="single.html">买买买 </a></span>
									</div>
								</li>
								<li>
									<a href=""><img class="img-responsive women" src="images/pic.jpg" alt=""></a>
									<div class="hide-in">
										<p>  洗洗睡吧孩子你买不起我</p>
										<span>¥179.00  |  <a href="single.html">任性剁手 </a></span>
									</div>
								</li>
								<li>
									<a href=""><img class="img-responsive women" src="images/pic1.jpg" alt=""></a>
									<div class="hide-in">
										<p>  看什么看你买不起我</p>
										<span>¥179.00  |  <a href="single.html">买买买 </a></span>
									</div>
								</li> --%>
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
							<script type="text/javascript" src="js/jquery.flexisel.js"></script>
						</div>
					</div>
				</div>
				<!---->
			</div>
			<s:action name="index_hot" id="ha" namespace="/" />
			<div class="row">
				<div class="col-lg-12">
					<div class="heading"><h2>近期热销</h2></div>
					<div class="products">
						<c:forEach items="${ha.hot}" var="hl" begin="0" end="7">
						<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
							<div class="product">
								<div class="image"><a href="single?gid=${hl.id}">
									<c:forEach items="${hl.goodsImgs}" var="imgs" begin="0" end="0">
										<img src="${imgs.path}" width="180px" height="180px"  style="width: 180px; height: 180px;"/>
									</c:forEach></a>
								</div>
								<div class="caption">
									<div class="name"><h3><a href="single?gid=${hl.id}" title="${hl.name}">
          								<c:if test="${fn:length(hl.name)>10}">${fn:substring(hl.name,0,10)}…</c:if>
 										<c:if test="${fn:length(hl.name)<=10}">${hl.name}</c:if>
 									</a></h3></div>
									<div class="buttons">
										<a class="btn cart" href="#"><span class="glyphicon glyphicon-shopping-cart"></span></a>
										<a class="btn wishlist" href="#"><span class="glyphicon glyphicon-heart"></span></a>
										<a class="btn compare" href="#"><span class="glyphicon glyphicon-transfer"></span></a>
									</div>
								</div>
							</div>
						</div>
						</c:forEach>
						<%-- <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
							<div class="product">
								<div class="image"><a href="single.html"><img src="images/sj/01.jpg" width="180" height="240" /></a></div>
								<div class="caption">
									<div class="name"><h3><a href="single.html">我是商品商品名称</a></h3></div>
									<div class="buttons">
										<a class="btn cart" href="#"><span class="glyphicon glyphicon-shopping-cart"></span></a>
										<a class="btn wishlist" href="#"><span class="glyphicon glyphicon-heart"></span></a>
										<a class="btn compare" href="#"><span class="glyphicon glyphicon-transfer"></span></a>
									</div>
								</div>
							</div>
						</div>
						<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
							<div class="product">
								<div class="image"><a href="single.html"><img src="images/sj/01.jpg" width="180" height="240" /></a></div>
								<div class="caption">
									<div class="name"><h3><a href="single.html">我是商品商品名称</a></h3></div>
									<div class="buttons">
										<a class="btn cart" href="#"><span class="glyphicon glyphicon-shopping-cart"></span></a>
										<a class="btn wishlist" href="#"><span class="glyphicon glyphicon-heart"></span></a>
										<a class="btn compare" href="#"><span class="glyphicon glyphicon-transfer"></span></a>
									</div>
								</div>
							</div>
						</div>
						<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
							<div class="product">
								<div class="image"><a href="single.html"><img src="images/sj/01.jpg" width="180" height="240" /></a></div>
								<div class="caption">
									<div class="name"><h3><a href="single.html">我是商品商品名称</a></h3></div>
									<div class="buttons">
										<a class="btn cart" href="#"><span class="glyphicon glyphicon-shopping-cart"></span></a>
										<a class="btn wishlist" href="#"><span class="glyphicon glyphicon-heart"></span></a>
										<a class="btn compare" href="#"><span class="glyphicon glyphicon-transfer"></span></a>
									</div>
								</div>
							</div>
						</div> --%>
					</div>
			  	</div>
		  	</div>
		  	<div class="row">
				<div class="col-lg-12">
					<div class="heading"></div>
					<!-- End brands area -->
					<div class="product-widget-area">
        				<div class="zigzag-bottom"></div>
        				<div class="container">
            				<div class="row">
                				<div class="col-md-4">
                    				<div class="single-widget">
                        				<h2 class="product-wid-title">吃货天堂</h2>
                        				<a href="list.html" class="wid-view-more">去逛逛</a>
                        				<div class="single-wid-product">
                            				<a href="single.html"><img src="img/product-thumb-1.jpg" alt="" class="product-thumb"></a>
                            				<h2><a href="single.html">爱疯超级特价速抢手慢没有</a></h2>
                            				<div class="product-wid-rating">
				                                <i class="fa fa-star"></i>
				                                <i class="fa fa-star"></i>
				                                <i class="fa fa-star"></i>
				                                <i class="fa fa-star"></i>
				                                <i class="fa fa-star"></i>
                            				</div>
                            				<div class="product-wid-price">
                                				<ins>¥400.00</ins> <del>¥425.00</del>
                            				</div>                            
                        				</div>
                        				<div class="single-wid-product">
                            				<a href="single.html"><img src="img/product-thumb-2.jpg" alt="" class="product-thumb"></a>
                            				<h2><a href="single.html">苹果 mac book 2015</a></h2>
                            				<div class="product-wid-rating">
				                                <i class="fa fa-star"></i>
				                                <i class="fa fa-star"></i>
				                                <i class="fa fa-star"></i>
				                                <i class="fa fa-star"></i>
				                                <i class="fa fa-star"></i>
                            				</div>
                            				<div class="product-wid-price">
                                				<ins>¥400.00</ins> <del>¥425.00</del>
                           					</div>                            
                        				</div>
                        				<div class="single-wid-product">
				                            <a href="single.html"><img src="img/product-thumb-3.jpg" alt="" class="product-thumb"></a>
				                            <h2><a href="single.html">超极本6秒开机 哥就是快</a></h2>
				                            <div class="product-wid-rating">
				                                <i class="fa fa-star"></i>
				                                <i class="fa fa-star"></i>
				                                <i class="fa fa-star"></i>
				                                <i class="fa fa-star"></i>
				                                <i class="fa fa-star"></i>
				                            </div>
                            				<div class="product-wid-price">
                                				<ins>¥400.00</ins> <del>¥425.00</del>
                            				</div>                            
                        				</div>
                    				</div>
                				</div>
                				<div class="col-md-4">
                    				<div class="single-widget">
                        				<h2 class="product-wid-title">服装饰品</h2>
                        				<a href="list.html" class="wid-view-more">去逛逛</a>
                        				<div class="single-wid-product">
                            				<a href="single.html"><img src="img/product-thumb-4.jpg" alt="" class="product-thumb"></a>
                            				<h2><a href="single.html">Sony电视思考法是否还看啥法</a></h2>
					                        <div class="product-wid-rating">
					                        	<i class="fa fa-star"></i>
					                        	<i class="fa fa-star"></i>
					                        	<i class="fa fa-star"></i>
					                        	<i class="fa fa-star"></i>
					                       		<i class="fa fa-star"></i>
					                    	</div>
					                    	<div class="product-wid-price">
					                        	<ins>¥400.00</ins> <del>¥425.00</del>
					                   		</div>                            
                        				</div>
				                        <div class="single-wid-product">
				                            <a href="single.html"><img src="img/product-thumb-1.jpg" alt="" class="product-thumb"></a>
				                            <h2><a href="single.html">Sony只能手机撒旦教卡萨</a></h2>
				                            <div class="product-wid-rating">
				                                <i class="fa fa-star"></i>
				                                <i class="fa fa-star"></i>
				                                <i class="fa fa-star"></i>
				                                <i class="fa fa-star"></i>
				                                <i class="fa fa-star"></i>
				                            </div>
				                            <div class="product-wid-price">
				                                <ins>¥400.00</ins> <del>¥425.00</del>
				                            </div>                            
				                        </div>
				                        <div class="single-wid-product">
				                            <a href="single.html"><img src="img/product-thumb-2.jpg" alt="" class="product-thumb"></a>
				                            <h2><a href="single.html">伤心手机爱神的箭萨丹哈</a></h2>
				                            <div class="product-wid-rating">
				                                <i class="fa fa-star"></i>
				                                <i class="fa fa-star"></i>
				                                <i class="fa fa-star"></i>
				                                <i class="fa fa-star"></i>
				                                <i class="fa fa-star"></i>
				                            </div>
				                            <div class="product-wid-price">
				                                <ins>¥400.00</ins> <del>¥425.00</del>
				                            </div>                            
				                        </div>
                    				</div>
                				</div>
				                <div class="col-md-4">
				                    <div class="single-widget">
				                        <h2 class="product-wid-title">数码产品</h2>
				                        <a href="list.html" class="wid-view-more">去逛逛</a>
				                        <div class="single-wid-product">
				                            <a href="single.html"><img src="img/product-thumb-3.jpg" alt="" class="product-thumb"></a>
				                            <h2><a href="single.html">Apple新沙多看少动</a></h2>
				                            <div class="product-wid-rating">
				                                <i class="fa fa-star"></i>
				                                <i class="fa fa-star"></i>
				                                <i class="fa fa-star"></i>
				                                <i class="fa fa-star"></i>
				                                <i class="fa fa-star"></i>
				                            </div>
				                            <div class="product-wid-price">
				                                <ins>¥400.00</ins> <del>¥425.00</del>
				                            </div>                            
				                        </div>
				                        <div class="single-wid-product">
				                            <a href="single.html"><img src="img/product-thumb-4.jpg" alt="" class="product-thumb"></a>
				                            <h2><a href="single.html">打开双方都可温柔电视</a></h2>
				                            <div class="product-wid-rating">
				                                <i class="fa fa-star"></i>
				                                <i class="fa fa-star"></i>
				                                <i class="fa fa-star"></i>
				                                <i class="fa fa-star"></i>
				                                <i class="fa fa-star"></i>
				                            </div>
				                            <div class="product-wid-price">
				                                <ins>¥400.00</ins> <del>¥425.00</del>
				                            </div>                            
				                        </div>
				                        <div class="single-wid-product">
				                            <a href="single.html"><img src="img/product-thumb-1.jpg" alt="" class="product-thumb"></a>
				                            <h2><a href="single.html">哦啊跑四季度法搜放假</a></h2>
				                            <div class="product-wid-rating">
				                                <i class="fa fa-star"></i>
				                                <i class="fa fa-star"></i>
				                                <i class="fa fa-star"></i>
				                                <i class="fa fa-star"></i>
				                                <i class="fa fa-star"></i>
				                            </div>
				                            <div class="product-wid-price">
				                                <ins>¥400.00</ins> <del>¥425.00</del>
				                            </div>                            
				                        </div>
				                    </div>
				                </div>
            				</div>
        				</div>
    				</div>
    			</div>
			</div>
			
		</div>
	</div>
	<!-- InstanceEndEditable name="page" -->	
    <jsp:include page="footer.jsp"></jsp:include>
  </body>
</html>
