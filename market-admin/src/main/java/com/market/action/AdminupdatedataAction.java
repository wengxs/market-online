package market.action;

import com.market.Dao.AdminDao;
import com.market.daoImpl.Admin_DaoImpl;
import com.market.main.TAdmin;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

public class AdminupdatedataAction extends ActionSupport{
	private int aid;
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

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
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

	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	public String update() throws Exception {
		TAdmin a= new TAdmin();
		AdminDao admindao = new Admin_DaoImpl();
		HttpServletRequest request = ServletActionContext.getRequest();
		String aid1=request.getParameter("aid");
		a= admindao.updatedata(aid, admin, password, notice, headportrait);
		System.out.println("aid:"+aid+"    admin:"+admin+"   password:"+password+"    notice:"+notice);
		
		return SUCCESS;
	
	}
}
