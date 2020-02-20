package market.Dao;

import java.sql.Timestamp;


public interface AdminDao {
	//管理员登录验证
	public TAdmin adminlogin(String admin, String password);
	//查询数据库用户资料
	public TUsers fromuser(String nickname, String password, String email,
                           String phone);
	//修改更新数据
	public TUsers Modifyingdata(String id, String nickname, String password, String email, String phone);
	//删除用户
	public TUsers delete(int id);
	//添加商品
	public void insertGoodses(TGoodses goodses);
	//查询所有添加的商品
	public TGoodses Allgoods(Integer id, String name, String content, Integer categoryid, Double price, Integer stock, char isSell, Timestamp saleTime, Integer saleCount);
    //删除添加的商品资料
	public TGoodses goodsesdelete(int id);
	//管理员显示用户操作步骤、写成日志显示在前台页面
	public TLog4j log4j(String message);
	//多表格连接查询订单资料
	public Orderinquiry Orderinquiry(int id, String nickname, Double total, Timestamp ordertime, String status, String address);
    //修改发货
    public TOrders ordersupdate(int id, int status_id);
    //多表格查询发货记录
    public Orderinquiry Shippingrecord(int id, String nickname, Double total, Timestamp ordertime, String status, String address);
    //多表格查询未发货记录
    public Orderinquiry Notshipped(int id, String nickname, Double total, Timestamp ordertime, String status, String address);
    //多表格查询取消订单记录
    public Orderinquiry Cancelorder(int id, String nickname, Double total, Timestamp ordertime, String status, String address);
    //更新管理员资料
    public TAdmin updatedata(int aid, String admin, String password, String notice, String headportrait);
}
