package market.action;

import com.market.Dao.TUsersDao;
import com.market.daoImpl.TUsers_DaoImpl;
import com.market.main.TUsers;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Map;

public class SecurityverificationAction  extends ActionSupport{
	private TUsersDao userDao = new TUsers_DaoImpl();
	private String nickname; 
	private String question;
	private String answer;
	private int id;
	private static Logger log = LogManager.getLogger(SecurityverificationAction.class);
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
	public String execute() throws Exception {
		TUsers user = new TUsers();
		user = userDao.Security_verification(nickname, question,answer);
		if(user==null) {
			this.addFieldError("nickname", "用户不为空！");
			this.addFieldError("question", "请选择密保！");
			this.addFieldError("answer", "填写密保错误！");
			return INPUT;
		} else {
			ActionContext actionContext = ActionContext.getContext();
			Map session = actionContext.getSession();
			session.put("user", user.getNickname());
			session.put("id", user.getId());
//		    log.trace("trace");
//			log.debug("debug");
			log.info("info");
//			log.warn("warn");
//			log.error("error");
//			log.fatal("fatal");
		}
		return SUCCESS;
	}
}
