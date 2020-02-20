package market.main;

import java.util.HashSet;
import java.util.Set;

/**
 * TGoodsCategory entity. @author MyEclipse Persistence Tools
 */

public class TGoodsCategory implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Set TGoodsCategoryChilds = new HashSet(0);

	// Constructors

	/** default constructor */
	public TGoodsCategory() {
	}

	/** minimal constructor */
	public TGoodsCategory(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public TGoodsCategory(Integer id, String name, Set TGoodsCategoryChilds) {
		this.id = id;
		this.name = name;
		this.TGoodsCategoryChilds = TGoodsCategoryChilds;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getTGoodsCategoryChilds() {
		return this.TGoodsCategoryChilds;
	}

	public void setTGoodsCategoryChilds(Set TGoodsCategoryChilds) {
		this.TGoodsCategoryChilds = TGoodsCategoryChilds;
	}

}
