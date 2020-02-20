package market.daoImpl;

import com.market.Dao.AdminDao;
import com.market.Hibernate.HibernateSessionFactory;
import com.market.main.*;
import org.apache.struts2.ServletActionContext;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Admin_DaoImpl implements AdminDao {
	HibernateSessionFactory hsf = new HibernateSessionFactory();
	public TUsers fromuser(String nickname, String password, String email,
			String phone) {
	//查询所有用户资料，然后显示在后台管理
		Session session = hsf.getSession();
		Transaction tx = session.beginTransaction();

		List list = session.createSQLQuery("select * from t_users").list();

		tx.commit();

		List list1 = new ArrayList();

		Iterator it = list.iterator();

		while(it.hasNext()){

		TUsers tuser = new TUsers();//这句必须放在里面，否则数据一样

		Object[] objs = (Object[])it.next();

		tuser.setId((Integer) objs[0]);
		tuser.setNickname(objs[1].toString());
		tuser.setPassword(objs[4].toString());
		tuser.setEmail(objs[3].toString());
		tuser.setPhone(objs[11].toString());
		list1.add(tuser);
		HttpServletRequest request = ServletActionContext.getRequest();

		request.setAttribute("list",list1);
		}
		return null;

	}
	public TUsers Modifyingdata(String id, String nickname, String password,
			String email, String phone) {
		

		Session session = hsf.getSession();
		Transaction ts = null;
		try {
			  String hqlString="Update TUsers set nickname='"+nickname+"',password='"+password+"', email='"+email+"' , phone='"+phone+"' where id="+id;		
			  Query query=session.createQuery(hqlString);
			  session.beginTransaction();
			  ts = session.beginTransaction();
			  query.executeUpdate();
  		  session.getTransaction().commit();
		} catch (Exception e) {
		System.out.println("Admin_DaoImpl. Modifyingdata() 方法发生异常:");
		e.printStackTrace();
		
	}finally {
		
	hsf.closeSession();
	 
}
		return null;
	
	}
    //删除用户
	public TUsers delete(int id) {
		 String hql="delete TUsers as u where u.id=?";
		 Session session = hsf.getSession();
		   Query query=session.createQuery(hql);

		   query.setInteger(0,id);

		   query.executeUpdate();

		   session.beginTransaction().commit();

		            
		return null;
	}
	public void insertGoodses(TGoodses goodses) {
		Session session = hsf.getSession();
		Transaction ts = null;
		try {
		ts = session.beginTransaction();
		session.save(goodses);
		ts.commit();
		session.clear();
		} catch (Exception e) {
			System.out.println("Admin_DaoImpl.insertGoodses() 方法发生异常:");
			e.printStackTrace();
		}finally {
		hsf.closeSession();
	}
	}
	public TGoodses Allgoods(Integer id,String name,String content,Integer categoryid,Double price,Integer stock,char isSell,Timestamp saleTime,Integer saleCount) {
		HibernateSessionFactory hsf = new HibernateSessionFactory();
		
		//查询所有商品资料，然后显示在后台管理
			Session session = hsf.getSession();
			Transaction tc = session.beginTransaction();

			List list = session.createSQLQuery("select * from t_goodses").list();

			tc.commit();

			List list1 = new ArrayList();

			Iterator it = list.iterator();

			while(it.hasNext()){

            TGoodses     goodses = new TGoodses();//这句必须放在里面，否则数据一样

			Object[] objs = (Object[])it.next();

			goodses.setId((Integer) objs[0]);
			goodses.setName((String) objs[1]);
			goodses.setContent((String) objs[2]);
			goodses.setCategoryid( (Integer) objs[3]);
			goodses.setPrice((Double) objs[4]);
			goodses.setStock((Integer) objs[5]);
			goodses.setIsSell( (Character) objs[6]);
			goodses.setSaleTime((Timestamp) objs[7]);
			goodses.setSaleCount((Integer) objs[8]);
			
			
			list1.add(goodses);
			HttpServletRequest request = ServletActionContext.getRequest();

			request.setAttribute("goodses",list1);
			}
			return null;

		}
	public TGoodses goodsesdelete(int id) {
		 String hql="delete TGoodses as g where g.id=?";
		 Session session = hsf.getSession();
		   Query query=session.createQuery(hql);

		   query.setInteger(0,id);

		   query.executeUpdate();

		   session.beginTransaction().commit();

		            
		return null;
	}
	public TLog4j log4j(String message) {
		Session session = hsf.getSession();
		Transaction t = session.beginTransaction();

		List list = session.createSQLQuery("select * from t_log4j").list();

		t.commit();

		List list1 = new ArrayList();

		Iterator it = list.iterator();

		while(it.hasNext()){

		TLog4j log = new TLog4j();//这句必须放在里面，否则数据一样

		Object[] objs = (Object[])it.next();

		
		log.setMessage(objs[1].toString());
		
		list1.add(log);
		HttpServletRequest request = ServletActionContext.getRequest();

		request.setAttribute("list",list1);
		}
		return null;
	

	}
	public com.market.main.Orderinquiry Orderinquiry(int id,String nickname,Double total,Timestamp ordertime,String status,String address) {
		

		//查询所有商品资料，然后显示在后台管理
			Session session = hsf.getSession();
			Transaction t = session.beginTransaction();
		
			List list =	session.createSQLQuery("SELECT t_orders.id ,  t_orders.order_time,  t_users.nickname, t_orders.total,     t_order_status.status,   t_address.address  FROM  t_users, t_orders,t_order_status,t_address   WHERE    t_users.id=t_orders.user_id   AND   t_orders.status_id=t_order_status.id   AND  t_orders.address_id=t_address.id").list();
           
            t.commit();
        	List list1 = new ArrayList();

    		Iterator it = list.iterator();
            while(it.hasNext()){ 

                Object[] objs=(Object[])it.next(); 

                com.market.main.Orderinquiry or = new com.market.main.Orderinquiry();
               
              
                or.setId((Integer) objs[0]);
                or.setOrdertime((Timestamp ) objs[1]);
                or.setNickname( objs[2].toString());
                or.setTotal((Double) objs[3]);
                or.setStatus((String) objs[4]);
                or.setAddress((String) objs[5]);
                list1.add(or);
                HttpServletRequest request = ServletActionContext.getRequest();

        		request.setAttribute("list",list1);
       
		}
			return null;
			
}
	public TOrders ordersupdate(int id,int status_id) {

		Session session = hsf.getSession();
		Transaction ts = null;
		try {
			  String hqlString="Update TOrders set status_id='"+status_id+"' where id="+id;		
			  Query query=session.createQuery(hqlString);
			  session.beginTransaction();
			  ts = session.beginTransaction();
			  query.executeUpdate();
  		  session.getTransaction().commit();
		} catch (Exception e) {
		System.out.println("Admin_DaoImpl.ordersupdate() 方法发生异常:");
		e.printStackTrace();
		
	}finally {
		
	hsf.closeSession();
	 
}
		return null;
	
	}
	public com.market.main.Orderinquiry Shippingrecord(int id, String nickname,
			Double total, Timestamp ordertime, String status, String address) {
		// 多表格查询发货记录
		Session session = hsf.getSession();
		Transaction t = session.beginTransaction();
	
		List list =	session.createSQLQuery("SELECT t_orders.id ,  t_orders.order_time,  t_users.nickname, t_orders.total,     t_order_status.status,   t_address.address  FROM  t_users, t_orders,t_order_status,t_address   WHERE    t_users.id=t_orders.user_id   AND   t_orders.status_id=t_order_status.id   AND  t_orders.address_id=t_address.id AND t_orders.status_id=2").list();
       
        t.commit();
    	List list1 = new ArrayList();

		Iterator it = list.iterator();
        while(it.hasNext()){ 

            Object[] objs=(Object[])it.next(); 

            com.market.main.Orderinquiry or = new com.market.main.Orderinquiry();
           
          
            or.setId((Integer) objs[0]);
            or.setOrdertime((Timestamp ) objs[1]);
            or.setNickname( objs[2].toString());
            or.setTotal((Double) objs[3]);
            or.setStatus((String) objs[4]);
            or.setAddress((String) objs[5]);
            list1.add(or);
            HttpServletRequest request = ServletActionContext.getRequest();

    		request.setAttribute("list",list1);
   
	}
		return null;
		
}
	public com.market.main.Orderinquiry Notshipped(int id, String nickname,
			Double total, Timestamp ordertime, String status, String address) {
		// 多表格查询未发货记录
		
		Session session = hsf.getSession();
		Transaction t = session.beginTransaction();
	
		List list =	session.createSQLQuery("SELECT t_orders.id ,  t_orders.order_time,  t_users.nickname, t_orders.total,     t_order_status.status,   t_address.address  FROM  t_users, t_orders,t_order_status,t_address   WHERE    t_users.id=t_orders.user_id   AND   t_orders.status_id=t_order_status.id   AND  t_orders.address_id=t_address.id AND t_orders.status_id=1").list();
       
        t.commit();
    	List list1 = new ArrayList();

		Iterator it = list.iterator();
        while(it.hasNext()){ 

            Object[] objs=(Object[])it.next(); 

            com.market.main.Orderinquiry or = new com.market.main.Orderinquiry();
           
          
            or.setId((Integer) objs[0]);
            or.setOrdertime((Timestamp ) objs[1]);
            or.setNickname( objs[2].toString());
            or.setTotal((Double) objs[3]);
            or.setStatus((String) objs[4]);
            or.setAddress((String) objs[5]);
            list1.add(or);
            HttpServletRequest request = ServletActionContext.getRequest();

    		request.setAttribute("list",list1);
   
	}
		return null;
		
}
	public com.market.main.Orderinquiry Cancelorder(int id, String nickname,
			Double total, Timestamp ordertime, String status, String address) {
		//多表格查询取消订单记录
		Session session = hsf.getSession();
		Transaction t = session.beginTransaction();
	
		List list =	session.createSQLQuery("SELECT t_orders.id ,  t_orders.order_time,  t_users.nickname, t_orders.total,     t_order_status.status,   t_address.address  FROM  t_users, t_orders,t_order_status,t_address   WHERE    t_users.id=t_orders.user_id   AND   t_orders.status_id=t_order_status.id   AND  t_orders.address_id=t_address.id AND t_orders.status_id=3").list();
       
        t.commit();
    	List list1 = new ArrayList();

		Iterator it = list.iterator();
        while(it.hasNext()){ 

            Object[] objs=(Object[])it.next(); 

            com.market.main.Orderinquiry or = new com.market.main.Orderinquiry();
           
          
            or.setId((Integer) objs[0]);
            or.setOrdertime((Timestamp ) objs[1]);
            or.setNickname( objs[2].toString());
            or.setTotal((Double) objs[3]);
            or.setStatus((String) objs[4]);
            or.setAddress((String) objs[5]);
            list1.add(or);
            HttpServletRequest request = ServletActionContext.getRequest();

    		request.setAttribute("list",list1);
   
	}
		return null;
		
}
	public TAdmin adminlogin(String admin, String password) {
		Session session = hsf.getSession();
		session.clear();
		try {
			String sql = "from TAdmin as a where a.admin=? and a.password=?";
			
			Query query = session.createQuery(sql);
			query.setString(0, admin);
			query.setString(1, password);
			List list = query.list();
			
			if (list != null && list.size() != 0) {
				Iterator itor = list.iterator();
				TAdmin Admin = (TAdmin) itor.next();
			
				session.clear();
				return Admin;
			} else {
				return null;
			}
		} catch (Exception e) {
			System.out.println("TAdmin_DaoImpl.adminlogin() 方法发生异常:");
			e.printStackTrace();
		
			return null;
		} finally {
			
			hsf.closeSession();
			
		}
	}
	public TAdmin updatedata(int aid, String admin, String password, String notice,String headportrait) {
		Session session = hsf.getSession();
		Transaction ts = null;
		try {
			  String hqlString="Update TAdmin set admin='"+admin+"',password='"+password+"', notice='"+notice+"' , headportrait='"+headportrait+"' where id="+aid;		
			  Query query=session.createQuery(hqlString);
			  session.beginTransaction();
			  ts = session.beginTransaction();
			  query.executeUpdate();
  		  session.getTransaction().commit();
		} catch (Exception e) {
		System.out.println("Admin_DaoImpl.data() 方法发生异常:");
		e.printStackTrace();
		
	}finally {
		
	hsf.closeSession();
	 
}
		return null;
	
	}
}
