package market.main;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * TOrders entity. @author MyEclipse Persistence Tools
 */

public class TOrders implements java.io.Serializable {

	// Fields

	private Integer id;
	private TUsers TUsers;
	private TOrderStatus TOrderStatus;
	private TAddress TAddress;
	private Double total;
	private Timestamp orderTime;
	private Set TOrderContents = new HashSet(0);
  
	// Constructors

	/** default constructor */
	public TOrders() {
	}

	/** full constructor */
	public TOrders(TUsers TUsers, TOrderStatus TOrderStatus, TAddress TAddress,
			Double total, Timestamp orderTime, Set TOrderContents) {
		this.TUsers = TUsers;
		this.TOrderStatus = TOrderStatus;
		this.TAddress = TAddress;
		this.total = total;
		this.orderTime = orderTime;
		this.TOrderContents = TOrderContents;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TUsers getTUsers() {
		return this.TUsers;
	}

	public void setTUsers(TUsers TUsers) {
		this.TUsers = TUsers;
	}

	public TOrderStatus getTOrderStatus() {
		return this.TOrderStatus;
	}

	public void setTOrderStatus(TOrderStatus TOrderStatus) {
		this.TOrderStatus = TOrderStatus;
	}

	public TAddress getTAddress() {
		return this.TAddress;
	}

	public void setTAddress(TAddress TAddress) {
		this.TAddress = TAddress;
	}

	public Double getTotal() {
		return this.total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Timestamp getOrderTime() {
		return this.orderTime;
	}

	public void setOrderTime(Timestamp orderTime) {
		this.orderTime = orderTime;
	}

	public Set getTOrderContents() {
		return this.TOrderContents;
	}

	public void setTOrderContents(Set TOrderContents) {
		this.TOrderContents = TOrderContents;
	}

}
