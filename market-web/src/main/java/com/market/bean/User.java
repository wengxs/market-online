package com.market.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class User {
	private int id;				// 编号
	private String nickname;	// 用户名
	private String realname;	// 真实姓名
	private String email;		// 邮箱
	private String password;	// 密码
	private String repassword;	// 重复密码
	//private String passwordMD5;	// 密码MD5加密
	private String question;	// 密保问题
	private String answer;		// 密保答案
	private String sex;			// 性别
	private Date birthday;		// 生日
	private String address;		// 地址
	private String qq;			// QQ
	private String phone;		// 手机号码
	private String validationCode; // 验证码
	private String currentUrl;
	
	private Set addresses = new HashSet(0);
	private Set goodsComments = new HashSet(0);
	private Set orders = new HashSet(0);
	
//	public String getPasswordMD5() throws Exception {
//		this.passwordMD5 = com.market.common.Encrypter.md5Encrypter(this.password);
//		return passwordMD5;
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
		//this.passwordMD5 = com.market.common.Encrypter.md5Encrypter(password);
	}
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getValidationCode() {
		return validationCode;
	}
	public void setValidationCode(String validationCode) {
		this.validationCode = validationCode;
	}
	public String getCurrentUrl() {
		return currentUrl;
	}
	public void setCurrentUrl(String currentUrl) {
		this.currentUrl = currentUrl;
	}
	public Set getAddresses() {
		return addresses;
	}
	public void setAddresses(Set addresses) {
		this.addresses = addresses;
	}
	public Set getGoodsComments() {
		return goodsComments;
	}
	public void setGoodsComments(Set goodsComments) {
		this.goodsComments = goodsComments;
	}
	public Set getOrders() {
		return orders;
	}
	public void setOrders(Set orders) {
		this.orders = orders;
	}
}
