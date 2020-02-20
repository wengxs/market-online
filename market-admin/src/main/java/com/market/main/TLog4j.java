package market.main;

/**
 * TLog4j entity. @author MyEclipse Persistence Tools
 */

public class TLog4j implements java.io.Serializable {

	// Fields

	private Integer logid;
	private String message;

	// Constructors

	/** default constructor */
	public TLog4j() {
	}

	/** full constructor */
	public TLog4j(String message) {
		this.message = message;
	}

	// Property accessors

	public Integer getLogid() {
		return this.logid;
	}

	public void setLogid(Integer logid) {
		this.logid = logid;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
