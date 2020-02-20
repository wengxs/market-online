package market.main;

import java.sql.Timestamp;

/**
 * TGoodsComment entity. @author MyEclipse Persistence Tools
 */

public class TGoodsComment implements java.io.Serializable {

	// Fields

	private Integer id;
	private TUsers TUsers;
	private TGoodses TGoodses;
	private String content;
	private Timestamp postTime;

	// Constructors

	/** default constructor */
	public TGoodsComment() {
	}

	/** minimal constructor */
	public TGoodsComment(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public TGoodsComment(Integer id, TUsers TUsers, TGoodses TGoodses,
			String content, Timestamp postTime) {
		this.id = id;
		this.TUsers = TUsers;
		this.TGoodses = TGoodses;
		this.content = content;
		this.postTime = postTime;
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

	public TGoodses getTGoodses() {
		return this.TGoodses;
	}

	public void setTGoodses(TGoodses TGoodses) {
		this.TGoodses = TGoodses;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getPostTime() {
		return this.postTime;
	}

	public void setPostTime(Timestamp postTime) {
		this.postTime = postTime;
	}

}
