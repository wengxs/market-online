package market.action;

import com.market.Dao.AdminDao;
import com.market.daoImpl.Admin_DaoImpl;
import com.opensymphony.xwork2.ActionSupport;

import java.sql.Timestamp;

public class AdminOrderinquiryAction extends ActionSupport {
    private int id;
    private String nickname;
    private Double total;
    private Timestamp ordertime;
    private String status;
    private String address;

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

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Timestamp getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Timestamp ordertime) {
        this.ordertime = ordertime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String Orderinquiry() throws Exception {
        AdminDao admin = new Admin_DaoImpl();
        com.market.main.Orderinquiry orders = new com.market.main.Orderinquiry();
        orders = admin.Orderinquiry(id, nickname, total, ordertime, status, address);

        return SUCCESS;

    }

    public String Shippingrecord() throws Exception {
        AdminDao admin = new Admin_DaoImpl();
        com.market.main.Orderinquiry orders = new com.market.main.Orderinquiry();
        orders = admin.Shippingrecord(id, nickname, total, ordertime, status, address);

        return SUCCESS;

    }

    public String Notshipped() throws Exception {
        AdminDao admin = new Admin_DaoImpl();
        com.market.main.Orderinquiry orders = new com.market.main.Orderinquiry();
        orders = admin.Notshipped(id, nickname, total, ordertime, status, address);

        return SUCCESS;

    }

    public String Cancelorder() throws Exception {
        AdminDao admin = new Admin_DaoImpl();
        com.market.main.Orderinquiry orders = new com.market.main.Orderinquiry();
        orders = admin.Cancelorder(id, nickname, total, ordertime, status, address);

        return SUCCESS;

    }
}
