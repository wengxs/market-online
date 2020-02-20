package market.action;

import com.market.Dao.AdminDao;
import com.market.daoImpl.Admin_DaoImpl;
import com.market.main.TOrders;
import com.opensymphony.xwork2.ActionSupport;

public class AdminordersupdateAction extends ActionSupport{
	private int id;
	private int status_id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStatus_id() {
		return status_id;
	}

	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}

	public String update() throws Exception {
		TOrders orders = new TOrders();
		AdminDao dao = new Admin_DaoImpl();
		orders=dao.ordersupdate(id, status_id);
		return SUCCESS;
	}
	
}
