package market.action;

import com.market.Dao.TUsersDao;
import com.market.daoImpl.TUsers_DaoImpl;
import com.market.main.TUsers;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Map;

public class ChangepasswordAction  extends ActionSupport{
	private String password;
	private int id;
	private static Logger log = LogManager.getLogger(ChangepasswordAction.class);
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private TUsersDao userDao = new TUsers_DaoImpl();
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute() throws Exception {
		TUsers user = new TUsers();
		TUsersDao userDao = new TUsers_DaoImpl();
	
		user.setPassword(password);
		
		user = userDao.Changepassword(id,password);
		System.out.println(id);
		System.out.println(password);
		
			ActionContext actionContext = ActionContext.getContext();
			Map session = actionContext.getSession();
		
		   // session.clear();
//		    log.trace("trace");
//			log.debug("debug");
			log.info("info");
//			log.warn("warn");
//			log.error("error");
//			log.fatal("fatal");
		return SUCCESS;
	}
}

