package market.main;

import java.util.HashSet;
import java.util.Set;

/**
 * TOrderStatus entity. @author MyEclipse Persistence Tools
 */

public class TOrderStatus implements java.io.Serializable {

	// Fields

	private Integer id;
	private String status;
	private Set TOrderses = new HashSet(0);

	// Constructors

	/** default constructor */
	public TOrderStatus() {
	}

	/** full constructor */
	public TOrderStatus(String status, Set TOrderses) {
		this.status = status;
		this.TOrderses = TOrderses;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set getTOrderses() {
		return this.TOrderses;
	}

	public void setTOrderses(Set TOrderses) {
		this.TOrderses = TOrderses;
	}

}
