package market.main;

/**
 * TAdmin entity. @author MyEclipse Persistence Tools
 */

public class TAdmin implements java.io.Serializable {

	// Fields

	private Integer aid;
	private String admin;
	private String password;
	private String notice;
	private String headportrait;

	// Constructors

	/** default constructor */
	public TAdmin() {
	}

	/** minimal constructor */
	public TAdmin(String admin, String password) {
		this.admin = admin;
		this.password = password;
	}

	/** full constructor */
	public TAdmin(String admin, String password, String notice,
			String headportrait) {
		this.admin = admin;
		this.password = password;
		this.notice = notice;
		this.headportrait = headportrait;
	}

	// Property accessors

	public Integer getAid() {
		return this.aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getAdmin() {
		return this.admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNotice() {
		return this.notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	public String getHeadportrait() {
		return this.headportrait;
	}

	public void setHeadportrait(String headportrait) {
		this.headportrait = headportrait;
	}

}
