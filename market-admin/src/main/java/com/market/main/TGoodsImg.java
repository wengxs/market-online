package market.main;

/**
 * TGoodsImg entity. @author MyEclipse Persistence Tools
 */

public class TGoodsImg implements java.io.Serializable {

	// Fields

	private Integer id;
	private TGoodses TGoodses;
	private String path;

	// Constructors

	/** default constructor */
	public TGoodsImg() {
	}

	/** minimal constructor */
	public TGoodsImg(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public TGoodsImg(Integer id, TGoodses TGoodses, String path) {
		this.id = id;
		this.TGoodses = TGoodses;
		this.path = path;
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

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
