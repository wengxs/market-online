package market.action;

import com.market.Dao.AdminDao;
import com.market.daoImpl.Admin_DaoImpl;
import com.market.main.TGoodses;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.sql.Timestamp;

public class AdminAllgoodsAction extends ActionSupport{
	private Integer id;
	private Integer categoryid;
	private String name;
	private String content;
	private Double price;
	private Integer stock;
	private char isSell;
	private Timestamp saleTime;
	private Integer saleCount;
	private static Logger log = LogManager.getLogger(AdminAllgoodsAction.class);
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(Integer categoryid) {
		this.categoryid = categoryid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public char getIsSell() {
		return isSell;
	}

	public void setIsSell(char isSell) {
		this.isSell = isSell;
	}

	public Timestamp getSaleTime() {
		return saleTime;
	}

	public void setSaleTime(Timestamp saleTime) {
		this.saleTime = saleTime;
	}

	public Integer getSaleCount() {
		return saleCount;
	}

	public void setSaleCount(Integer saleCount) {
		this.saleCount = saleCount;
	}

	public String query() throws Exception {
		
		AdminDao admin = new Admin_DaoImpl();
		TGoodses goodses = new TGoodses();
		goodses.setId(id);
		goodses.setName(name);
		goodses.setContent(content);
		goodses.setCategoryid(categoryid);
		goodses.setPrice(price);
		goodses.setStock(stock);
		goodses.setIsSell(isSell);
		goodses.setSaleTime(saleTime);
		goodses.setSaleCount(saleCount);
		goodses = admin.Allgoods(id,name, content, categoryid, price, stock, isSell, saleTime, saleCount);
//	    log.trace("trace");
//		log.debug("debug");
		log.info("info");
//		log.warn("warn");
//		log.error("error");
//		log.fatal("fatal");
		return SUCCESS;
		
	}
}
