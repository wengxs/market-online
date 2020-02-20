package market.main;

import java.util.HashSet;
import java.util.Set;

/**
 * TUsers entity. @author MyEclipse Persistence Tools
 */

public class TUsers implements java.io.Serializable {

	// Fields

	private Integer id;
	private String nickname;
	private String realname;
	private String email;
	private String password;
	private String question;
	private String answer;
	private String sex;
	private String birthday;
	private String address;
	private String qq;
	private String phone;
	private Set TChatrooms = new HashSet(0);
	private Set TAddresses = new HashSet(0);
	private Set TGoodsComments = new HashSet(0);
	private Set TOrderses = new HashSet(0);

	// Constructors

	/** default constructor */
	public TUsers() {
	}

	/** minimal constructor */
	public TUsers(String nickname) {
		this.nickname = nickname;
	}

	/** full constructor */
	public TUsers(String nickname, String realname, String email,
			String password, String question, String answer, String sex,
			String birthday, String address, String qq, String phone,
			Set TChatrooms, Set TAddresses, Set TGoodsComments, Set TOrderses) {
		this.nickname = nickname;
		this.realname = realname;
		this.email = email;
		this.password = password;
		this.question = question;
		this.answer = answer;
		this.sex = sex;
		this.birthday = birthday;
		this.address = address;
		this.qq = qq;
		this.phone = phone;
		this.TChatrooms = TChatrooms;
		this.TAddresses = TAddresses;
		this.TGoodsComments = TGoodsComments;
		this.TOrderses = TOrderses;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return this.birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Set getTChatrooms() {
		return this.TChatrooms;
	}

	public void setTChatrooms(Set TChatrooms) {
		this.TChatrooms = TChatrooms;
	}

	public Set getTAddresses() {
		return this.TAddresses;
	}

	public void setTAddresses(Set TAddresses) {
		this.TAddresses = TAddresses;
	}

	public Set getTGoodsComments() {
		return this.TGoodsComments;
	}

	public void setTGoodsComments(Set TGoodsComments) {
		this.TGoodsComments = TGoodsComments;
	}

	public Set getTOrderses() {
		return this.TOrderses;
	}

	public void setTOrderses(Set TOrderses) {
		this.TOrderses = TOrderses;
	}

}
