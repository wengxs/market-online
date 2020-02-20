package market.action;

import com.market.Dao.AdminDao;
import com.market.daoImpl.Admin_DaoImpl;
import com.market.main.TLog4j;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Log4jAction extends ActionSupport {
	private String message;
	private static Logger log4 = LogManager.getLogger(AdminAllgoodsAction.class);
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String log4j() throws Exception {
		AdminDao admin = new Admin_DaoImpl();
		TLog4j log = new TLog4j();
		log = admin.log4j(message);
		log4.info("info");
		return SUCCESS;
		
	}
}
