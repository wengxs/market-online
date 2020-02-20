package market.action;

import com.market.Dao.AdminDao;
import com.market.daoImpl.Admin_DaoImpl;
import com.market.main.TUsers;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class ModifyingdataAction extends ActionSupport{
private String id;
private String nickname;
private String password;
private String email;
private String phone;
private static Logger log = LogManager.getLogger(ModifyingdataAction.class);
public String getId() {
	return id;
}
public void setId(String id) {
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
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String execute() throws Exception {
	TUsers user = new TUsers();
	AdminDao admin = new Admin_DaoImpl();
    
    user.setNickname(nickname);
	user.setPassword(password);
	user.setEmail(email);
	user.setPhone(phone);
	user = admin.Modifyingdata(id,nickname, password, email, phone);
	System.out.println("id:"+id);
	System.out.println("nickname:"+nickname);
	System.out.println("password:"+password);
	System.out.println("email:"+email);
	System.out.println("phone:"+phone);
//    log.trace("trace");
//	log.debug("debug");
	log.info("info");
//	log.warn("warn");
//	log.error("error");
//	log.fatal("fatal");
	
	   
	return SUCCESS;
}
}



