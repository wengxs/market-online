<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
    <base href="<%=basePath%>">
    
    <title>${goodsCategoryChild.name} - Buy货商城</title>
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
	<!--///////////////////HomePage///////////////////////-->
	<!--//////////////////////////////////////////////////-->
	<!-- InstanceBeginEditable name="page" -->
	<div class="container">
		
  		<div class="content_right">
		   <div class="dreamcrub">
			   	 <ul class="breadcrumbs">
                    <li class="home">
                       首页&nbsp;
                      <span>&gt;</span>
                    </li>
                    <li class="home">&nbsp;
                        ${goodsCategoryChild.category.name}&nbsp;
                      <span>&gt;</span>
                    </li>
                    <li>
                        &nbsp;${goodsCategoryChild.name}
                    </li>
               </ul>
                <ul class="previous">
                	<li><a href="javascript:history.back(-1);" >返回前一页</a></li>
                </ul>
                <div class="clearfix"></div>
    		</div>
			   <div class="mens-toolbar">
                 <div class="sort">
               	   <div class="sort-by">
                   <ul class="women_pagenation">
		            <li class="active"><a href="#">综合排序</a></li> 
                    <li><a href="#">销量</a></li> 
                    <li><a href="#">价格</a></li>
		            <a href=""><img src="images/arrow2.gif" alt="" class="v-middle"></a>
                   </ul>
                   </div>
    		     </div>
    	        <ul class="women_pagenation dc_paginationA dc_paginationA06">
			     <li><a href="#">&lt;</a></li>
			     <li><a href="#yema">1</a></li>
			     <li><a href="#">&gt;</a></li>
		  	    </ul>
                <div class="clearfix"></div>		
		        </div>		
				<div id="cbp-vm" class="cbp-vm-switcher cbp-vm-view-grid">
					<div class="cbp-vm-options">
						<a href="#" class="cbp-vm-icon cbp-vm-grid cbp-vm-selected" data-view="cbp-vm-view-grid" title="网格显示">网格</a>
						<a href="#" class="cbp-vm-icon cbp-vm-list" data-view="cbp-vm-view-list" title="列表显示">列表</a>
					</div>
					<div class="pages">   
        	 <div class="limiter visible-desktop">
               共有 ${listGoods.size()} 件宝贝哦      
               </div>
       	   </div>
					<div class="clearfix"></div>
					<ul>
					<c:forEach items="${listGoods}" var="lg">
					  <li>
							<a class="cbp-vm-image" href="single?gid=${lg.id}">
							 <div class="view view-first">
					   		  <div class="inner_content clearfix">
								<div class="product_image">
									<img src="${lg.listGoodsImg[0].path}" class="img-responsive" alt="" style="height: 300px"/>
									<div class="product_container">
									   <div class="cart-left" style="height: 3.2em">
										 <p class="title">${lg.name}</p>
									   </div>
									   <div class="price">￥${lg.price}</div>
									   <div class="clearfix"></div>
								     </div>		
								  </div>
			                     </div>
		                      </div>
		                    </a>
							<!-- <div class="cbp-vm-details">
								maiwo maiwo maiwo买我啊一定要买我啊啊啊啊啊啊你有没有在听我说话.
							</div> -->
							<a class="cbp-vm-icon cbp-vm-add" href="addToCart?gid=${lg.id}&number=1">加进购物车</a>
						</li>
						</c:forEach>
					</ul>
				</div>
				<link href="css/component.css" rel='stylesheet' type='text/css' />
                <script src="js/cbpViewModeSwitch.js" type="text/javascript"></script>
                <script src="js/classie1.js" type="text/javascript"></script>
		</div>
</div>
    <div id="yema" class="row">
                <div class="col-md-12">
                    <div class="product-pagination text-center">
                        <nav>
                          <ul class="pagination">
                            <li>
                              <a href="#" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                              </a>
                            </li>
                            <li><a href="#">1</a></li>
                            <li><a href="#">2</a></li>
                            <li><a href="#">3</a></li>
                            <li><a href="#">4</a></li>
                            <li><a href="#">5</a></li>
                            <li>
                              <a href="#" aria-label="Next">
                                <span aria-hidden="true">&raquo;</span>
                              </a>
                            </li>
                          </ul>
                        </nav>                        
                    </div>
                </div>
</div>
<!-- InstanceEndEditable -->	
	
<!--hone page end-->
    <jsp:include page="footer.jsp"></jsp:include>
  </body>
</html>
