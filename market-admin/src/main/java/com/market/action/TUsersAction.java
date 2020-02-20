package market.action;

import com.market.Dao.TUsersDao;
import com.market.daoImpl.TUsers_DaoImpl;
import com.market.main.TUsers;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class TUsersAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
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
	private TUsers user = new TUsers();
	private TUsersDao tusers = new TUsers_DaoImpl();
	private static Logger log = LogManager.getLogger(TUsersAction.class);
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
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

	public TUsers getUser() {
		return user;
	}

	public void setUser(TUsers user) {
		this.user = user;
	}

	public TUsersDao getTusers() {
		return tusers;
	}

	public void setTusers(TUsersDao tusers) {
		this.tusers = tusers;
	}

	public String execute(){
		user.setNickname(nickname);
		user.setRealname(realname);
		user.setEmail(email);
		user.setPassword(password);
		user.setQuestion(question);
		user.setAnswer(answer);
		user.setSex(sex);
		user.setBirthday(birthday);
		user.setAddress(address);
		user.setQq(qq);
		user.setPhone(phone);

		
		System.out.println(nickname);
		System.out.println(realname);
		System.out.println(email);
		System.out.println(password);
		System.out.println(question);
		System.out.println(answer);
		System.out.println(sex);
		System.out.println(birthday);
		System.out.println(address);
		System.out.println(qq);
		System.out.println(phone);
		
		//使用daoImpl插入数据库方法写入。
		tusers.insertUsers(user); 
//	    log.trace("trace");
//		log.debug("debug");
		log.info("info");
//		log.warn("warn");
//		log.error("error");
//		log.fatal("fatal");
		return SUCCESS;
	
}
	 
}
