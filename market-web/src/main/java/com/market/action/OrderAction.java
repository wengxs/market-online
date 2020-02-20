package com.market.action;

import java.util.List;
import java.util.Map;

import com.market.bean.Address;
import com.market.bean.Cart;
import com.market.bean.Order;
import com.market.bean.OrderContent;
import com.market.bean.OrderStatus;
import com.market.bean.User;
import com.market.service.AddressService;
import com.market.service.OrderContentService;
import com.market.service.OrderService;
import com.market.service.UserService;
import com.opensymphony.xwork2.ModelDriven;

public class OrderAction extends BaseAction {//implements ModelDriven<Order> {
	private Order model = new Order();
	private OrderService orderService;
	private AddressService addressService;
	private UserService userService;
	private List<Order> myOrder;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public AddressService getAddressService() {
		return addressService;
	}

	public void setAddressService(AddressService addressService) {
		this.addressService = addressService;
	}

	public Order getModel() {
		return model;
	}
	
	public OrderService getOrderService() {
		return orderService;
	}

	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}

	public List<Order> getMyOrder() {
		return myOrder;
	}

	public String add() throws Exception {
		Cart cart = (Cart) request.getSession().getAttribute("cart");
		User user = (User) request.getSession().getAttribute("currentUser");
		//System.out.println(user.getId());
		Address address = new Address();
		int addressID = Integer.parseInt(request.getParameter("addressid"));
		if(addressID == 0) {
			address.setAddress(request.getParameter("address"));
			address.setAddressee(request.getParameter("addressee"));
			address.setPhone(request.getParameter("phone"));
			address.setZipCode(request.getParameter("zipCode"));
			addressService.addAddress(address, user);
			System.out.println("添加新地址成功");
		}
		else{
			address = addressService.getAddress(addressID);
			user = address.getUser();
			//System.out.println(user.getId());
		}
		orderService.addOrder(cart, user, address);
		
		request.getSession().setAttribute("cart", null);
		System.out.println("success");
		return SUCCESS;
	}
	
	public String show() {
		User user = (User) request.getSession().getAttribute("currentUser");
		myOrder = orderService.listOrderByUser(user);
		return "myOrder";
	}
	
	public String update() {
		Order order = new Order();
		order.setId(Integer.parseInt(request.getParameter("oid")));
		OrderStatus orderStatus = new OrderStatus();
		orderStatus.setId(Integer.parseInt(request.getParameter("sid")));
		order.setOrderStatus(orderStatus);
		orderService.updateOrder(order);
		System.out.println("更新成功");
		return "myOrder";
	}
	
}
