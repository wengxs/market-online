package market.action;


import com.market.Dao.AdminDao;
import com.market.daoImpl.Admin_DaoImpl;
import com.market.main.TAdmin;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;


public class AdminLoginAction extends ActionSupport implements ServletRequestAware {
	private String aid;
	private String admin;
	private String password;
	private String notice;
	private String headportrait;
    public String getHeadportrait() {
		return headportrait;
	}



	public void setHeadportrait(String headportrait) {
		this.headportrait = headportrait;
	}



	private HttpServletResponse response;
	private HttpServletRequest request;
	private static Logger log = LogManager.getLogger(LoginAction.class);
	
	

	public String getNotice() {
		return notice;
	}



	public void setNotice(String notice) {
		this.notice = notice;
	}



	public String getAid() {
		return aid;
	}



	public void setAid(String aid) {
		this.aid = aid;
	}



	public String getAdmin() {
		return admin;
	}



	public void setAdmin(String admin) {
		this.admin = admin;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public HttpServletResponse getResponse() {
		return response;
	}



	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}



	public HttpServletRequest getRequest() {
		return request;
	}



	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}



	public String execute() throws Exception {
//		response.setHeader("Cache-Control", "no-cache, must-revalidate");
//		response.setHeader("Pragma", "No-cache");
//		response.setDateHeader("Expires", 0);
		AdminDao adminDao = new Admin_DaoImpl();
		TAdmin Admin = new TAdmin();
		Admin = adminDao.adminlogin(admin, password);
		if(Admin==null) {
			this.addFieldError("admin", "帐号不正确！");
			this.addFieldError("password", "密码不正确!");
			System.out.println("用户或密码不正确！");
			return INPUT;
		} else {
			ActionContext actionContext = ActionContext.getContext();
			Map s = actionContext.getSession();
			//s.clear();
			s.put("Admin", Admin.getAdmin());
			s.put("aid", Admin.getAid());
		    s.put("password", Admin.getPassword());
            s.put("notice", Admin.getNotice()).toString();
            s.put("headportrait", Admin.getHeadportrait()).toString();
//            request.setCharacterEncoding("UTF-8");//传值编码
//            response.setContentType("text/html;charset=UTF-8");
//            Map str1=s;
//            notice =new Map(( str1.getBytes("ISO-8859-1"),"utf-8"); //转码UTF8 
			log.info("info");

			    
		
		}	return SUCCESS;
		
	}



	public void setServletRequest(HttpServletRequest request) {
		this.request=request;
		
	}
	
	  
}
