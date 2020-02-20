package market.action;

import com.market.Dao.AdminDao;
import com.market.daoImpl.Admin_DaoImpl;
import com.market.main.TUsers;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Map;

public class AdminAction extends ActionSupport {
    private int id;
    private String nickname;
    private String password;
    private String email;
    private String phone;
    private static Logger log = LogManager.getLogger(AdminAction.class);

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
        AdminDao admindao = new Admin_DaoImpl();
        ActionContext actionContext = ActionContext.getContext();
        Map s = actionContext.getSession();
        user = admindao.fromuser(nickname, password, email, phone);

        return SUCCESS;
    }

    public String delete() throws Exception {
        TUsers user = new TUsers();
        AdminDao admindao = new Admin_DaoImpl();
        user = admindao.delete(id);
        System.out.println("ID:" + id);
//	    log.trace("trace");
//		log.debug("debug");
        log.info("info");
//		log.warn("warn");
//		log.error("error");
//		log.fatal("fatal");
        return SUCCESS;
    }

}
