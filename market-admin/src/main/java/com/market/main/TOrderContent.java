package market.main;

/**
 * TOrderContent entity. @author MyEclipse Persistence Tools
 */

public class TOrderContent implements java.io.Serializable {

	// Fields

	private Integer id;
	private TGoodses TGoodses;
	private TOrders TOrders;
	private Double price;
	private Integer number;
	private Double subtotal;

	// Constructors

	/** default constructor */
	public TOrderContent() {
	}

	/** minimal constructor */
	public TOrderContent(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public TOrderContent(Integer id, TGoodses TGoodses, TOrders TOrders,
			Double price, Integer number, Double subtotal) {
		this.id = id;
		this.TGoodses = TGoodses;
		this.TOrders = TOrders;
		this.price = price;
		this.number = number;
		this.subtotal = subtotal;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TGoodses getTGoodses() {
		return this.TGoodses;
	}

	public void setTGoodses(TGoodses TGoodses) {
		this.TGoodses = TGoodses;
	}

	public TOrders getTOrders() {
		return this.TOrders;
	}

	public void setTOrders(TOrders TOrders) {
		this.TOrders = TOrders;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Double getSubtotal() {
		return this.subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

}
