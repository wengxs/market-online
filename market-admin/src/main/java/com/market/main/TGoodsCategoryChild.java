package market.main;

import java.util.HashSet;
import java.util.Set;

/**
 * TGoodsCategoryChild entity. @author MyEclipse Persistence Tools
 */

public class TGoodsCategoryChild implements java.io.Serializable {

	// Fields

	private Integer id;
	private TGoodsCategory TGoodsCategory;
	private String name;
	private Set TGoodseses = new HashSet(0);

	// Constructors

	/** default constructor */
	public TGoodsCategoryChild() {
	}

	/** minimal constructor */
	public TGoodsCategoryChild(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public TGoodsCategoryChild(Integer id, TGoodsCategory TGoodsCategory,
			String name, Set TGoodseses) {
		this.id = id;
		this.TGoodsCategory = TGoodsCategory;
		this.name = name;
		this.TGoodseses = TGoodseses;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TGoodsCategory getTGoodsCategory() {
		return this.TGoodsCategory;
	}

	public void setTGoodsCategory(TGoodsCategory TGoodsCategory) {
		this.TGoodsCategory = TGoodsCategory;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getTGoodseses() {
		return this.TGoodseses;
	}

	public void setTGoodseses(Set TGoodseses) {
		this.TGoodseses = TGoodseses;
	}

}
