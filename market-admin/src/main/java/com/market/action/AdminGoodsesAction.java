package market.action;

import com.market.Dao.AdminDao;
import com.market.daoImpl.Admin_DaoImpl;
import com.market.main.TGoodsCategoryChild;
import com.market.main.TGoodses;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.sql.Timestamp;

public class AdminGoodsesAction extends ActionSupport{
	private 	AdminDao 	 admin = new  Admin_DaoImpl();
	private     TGoodses     goodses = new TGoodses();
	private int id;
	private String name;
	private TGoodsCategoryChild TGoodsCategoryChild;
	private String content;
	private Double price;
	private Integer stock;
	private char isSell;
	private Timestamp saleTime;
	private Integer saleCount;
	private Integer categoryid;
	private static Logger log = LogManager.getLogger(AdminGoodsesAction.class);
	public AdminDao getAdmin() {
		return admin;
	}

	public void setAdmin(AdminDao admin) {
		this.admin = admin;
	}

	public TGoodses getGoodses() {
		return goodses;
	}

	public void setGoodses(TGoodses goodses) {
		this.goodses = goodses;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TGoodsCategoryChild getTGoodsCategoryChild() {
		return TGoodsCategoryChild;
	}

	public void setTGoodsCategoryChild(TGoodsCategoryChild tGoodsCategoryChild) {
		TGoodsCategoryChild = tGoodsCategoryChild;
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

	public Integer getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(Integer categoryid) {
		this.categoryid = categoryid;
	}

	public String insert(){
	//管理员添加商品
		goodses.setName(name);
		goodses.setContent(content);
		goodses.setCategoryid(categoryid);
	//	goodses.setTGoodsCategoryChild(TGoodsCategoryChild);
		goodses.setPrice(price);
		goodses.setStock(stock);
		goodses.setIsSell(isSell);
		goodses.setSaleTime(saleTime);
		goodses.setSaleCount(saleCount);
System.out.print("name"+name+"     content"+content+"        categoryid"+categoryid+
		"     price"+price+"        stock"+stock+"      " +
				"issell"+isSell+"      saletime"+saleTime+"     salecount"+saleCount+"  TGoodsCategoryChild "+TGoodsCategoryChild);
		
		
		admin.insertGoodses(goodses);
		log.trace("trace");
		log.debug("debug");
		log.info("info");
		log.warn("warn");
		log.error("error");
		log.fatal("fatal");
		return SUCCESS;
	}
	public String delete(){
		goodses=admin.goodsesdelete(id);
//	    log.trace("trace");
//		log.debug("debug");
		log.info("info");
//		log.warn("warn");
//		log.error("error");
//		log.fatal("fatal");
		return SUCCESS;}
}
