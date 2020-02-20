package market.action;


import com.market.Dao.TUsersDao;
import com.market.daoImpl.TUsers_DaoImpl;
import com.market.main.TAdmin;
import com.market.main.TUsers;
import com.market.util.OnlineSession;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;


public class LoginAction extends ActionSupport implements ServletRequestAware {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5961743617029460682L;
	private String id;
	private String nickname;
	private String password;
	private String readlname;
	private TUsersDao userDao = new TUsers_DaoImpl();
	private TAdmin admin = new TAdmin();

	private HttpServletResponse response;
	private HttpServletRequest request;
	private static Logger log = LogManager.getLogger(LoginAction.class);
	
	public String getReadlname() {
		return readlname;
	}
	public void setReadlname(String readlname) {
		this.readlname = readlname;
	}
	
	public TAdmin getAdmin() {
		return admin;
	}
	public void setAdmin(TAdmin admin) {
		this.admin = admin;
	}
	
	
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
	public void setServletResponse(HttpServletResponse response) {
		this.response= response;
		
	}
	public void setServletRequest(HttpServletRequest request) {
		   this.request = request;
		
	}
	public String execute() throws Exception {
//		response.setHeader("Cache-Control", "no-cache, must-revalidate");
//		response.setHeader("Pragma", "No-cache");
//		response.setDateHeader("Expires", 0);
		ActionContext actionContext = ActionContext.getContext();
		Map s = actionContext.getSession();
		s.clear();
		TUsers user = new TUsers();
		user = userDao.userlogin(nickname, password);
        
        
		if(nickname==null||nickname.trim().length()==0||password==null||password.trim().length()==0) {
			this.addFieldError("nickname", "用户不为空！");
			this.addFieldError("password", "密码不为空！");
			System.out.println("用户或密码不正确！");
			return INPUT;
		} else {
			
			s.put("user", user.getNickname());
			s.put("id", user.getId());
			HttpSession session = request.getSession(); 
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
			sdf.applyPattern("yyyy/MM/dd HH:mm:ss.SSS");
			
			 
			session.setAttribute(com.market.util.SessionListener.LISTENER_NAME,new OnlineSession(request.getRemoteAddr(),nickname,sdf.format(new Date()).toString(), password));  
//		    log.trace("trace");
//			log.debug("debug");
			log.info("info");
//			log.warn("warn");
//			log.error("error");
//			log.fatal("fatal");
			    
		
		}	return SUCCESS;
		
	}
	
	  
}
