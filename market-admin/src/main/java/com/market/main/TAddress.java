package market.main;

import java.util.HashSet;
import java.util.Set;

/**
 * TAddress entity. @author MyEclipse Persistence Tools
 */

public class TAddress implements java.io.Serializable {

	// Fields

	private Integer id;
	private TUsers TUsers;
	private String addressee;
	private String address;
	private String zipCode;
	private String phone;
	private Set TOrderses = new HashSet(0);

	// Constructors

	/** default constructor */
	public TAddress() {
	}

	/** full constructor */
	public TAddress(TUsers TUsers, String addressee, String address,
			String zipCode, String phone, Set TOrderses) {
		this.TUsers = TUsers;
		this.addressee = addressee;
		this.address = address;
		this.zipCode = zipCode;
		this.phone = phone;
		this.TOrderses = TOrderses;
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

	public String getAddressee() {
		return this.addressee;
	}

	public void setAddressee(String addressee) {
		this.addressee = addressee;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Set getTOrderses() {
		return this.TOrderses;
	}

	public void setTOrderses(Set TOrderses) {
		this.TOrderses = TOrderses;
	}

}
