package market.main;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * TGoodses entity. @author MyEclipse Persistence Tools
 */

public class TGoodses implements java.io.Serializable {

	// Fields

	private Integer id;
	private TGoodsCategoryChild TGoodsCategoryChild;
	private String name;
	private Integer categoryid;
	private String content;
	private Double price;
	private Integer stock;
	private char isSell;
	private Timestamp saleTime;
	private Integer saleCount;
	private Set TGoodsImgs = new HashSet(0);
	private Set TGoodsComments = new HashSet(0);
	private Set TOrderContents = new HashSet(0);

	// Constructors

	/** default constructor */
	public TGoodses() {
	}

	/** full constructor */
	public TGoodses(TGoodsCategoryChild TGoodsCategoryChild, String name,Integer categoryid,
			String content, Double price, Integer stock, char isSell,
			Timestamp saleTime, Integer saleCount, Set TGoodsImgs,
			Set TGoodsComments, Set TOrderContents) {
		this.TGoodsCategoryChild = TGoodsCategoryChild;
		this.name = name;
		this.categoryid=categoryid;
		this.content = content;
		this.price = price;
		this.stock = stock;
		this.isSell = isSell;
		this.saleTime = saleTime;
		this.saleCount = saleCount;
		this.TGoodsImgs = TGoodsImgs;
		this.TGoodsComments = TGoodsComments;
		this.TOrderContents = TOrderContents;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TGoodsCategoryChild getTGoodsCategoryChild() {
		return this.TGoodsCategoryChild;
	}

	public void setTGoodsCategoryChild(TGoodsCategoryChild TGoodsCategoryChild) {
		this.TGoodsCategoryChild = TGoodsCategoryChild;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(Integer categoryid) {
		this.categoryid = categoryid;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getStock() {
		return this.stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public char getIsSell() {
		return this.isSell;
	}

	public void setIsSell(char isSell) {
		this.isSell = isSell;
	}

	public Timestamp getSaleTime() {
		return this.saleTime;
	}

	public void setSaleTime(Timestamp saleTime) {
		this.saleTime = saleTime;
	}

	public Integer getSaleCount() {
		return this.saleCount;
	}

	public void setSaleCount(Integer saleCount) {
		this.saleCount = saleCount;
	}

	public Set getTGoodsImgs() {
		return this.TGoodsImgs;
	}

	public void setTGoodsImgs(Set TGoodsImgs) {
		this.TGoodsImgs = TGoodsImgs;
	}

	public Set getTGoodsComments() {
		return this.TGoodsComments;
	}

	public void setTGoodsComments(Set TGoodsComments) {
		this.TGoodsComments = TGoodsComments;
	}

	public Set getTOrderContents() {
		return this.TOrderContents;
	}

	public void setTOrderContents(Set TOrderContents) {
		this.TOrderContents = TOrderContents;
	}

}
