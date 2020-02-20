package market.daoImpl;


import com.market.Dao.TUsersDao;
import com.market.Hibernate.HibernateSessionFactory;
import com.market.main.TUsers;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Iterator;
import java.util.List;

public class TUsers_DaoImpl implements TUsersDao {
	HibernateSessionFactory hsf = new HibernateSessionFactory();
	public void insertUsers(TUsers user) {
	//添加新用户资料
		
		Session session = hsf.getSession();
		Transaction ts = null;
		
		// sql =  "insert into t_users(nickname,realname,email,password,question,answer,sex,birthday,address,qq,phone) values(?,?,?,?,?,?,?,?,?,?,?)" ;
		try {
		ts = session.beginTransaction();
		session.save(user);
		ts.commit();
		session.clear();
		} catch (Exception e) {
			System.out.println("TUserDaoImpl.insertUsers() 方法发生异常:");
			e.printStackTrace();
		}finally {
		hsf.closeSession();
	}
	}
	public void updateUsers(TUsers user) {
    //更新用户信息

	}

	public TUsers userlogin(String nickname, String password) {
		Session session = hsf.getSession();
		session.clear();
		try {
			String sql = "from TUsers as u where u.nickname=? and u.password=?";
			
			Query query = session.createQuery(sql);
			query.setString(0, nickname);
			query.setString(1, password);
			List list = query.list();
			
			if (list != null && list.size() != 0) {
				Iterator itor = list.iterator();
				TUsers user = (TUsers) itor.next();
			
				session.clear();
				return user;
			} else {
				return null;
			}
		} catch (Exception e) {
			System.out.println("TUsers_DaoImpl.Userlogin() 方法发生异常:");
			e.printStackTrace();
		
			return null;
		} finally {
			
			hsf.closeSession();
			
		}
	}
	public TUsers Security_verification(String nickname, String question,String answer) {
		Session session = hsf.getSession();
		try {
			String sql = "from TUsers as u where u.nickname=? and u.question=? and u.answer=?";
			
			Query query = session.createQuery(sql);
			query.setString(0, nickname);
			query.setString(1, question);
			query.setString(2, answer);
			List list = query.list();
			if (list != null && list.size() != 0) {
				Iterator itor = list.iterator();
				TUsers user = (TUsers) itor.next();
				return user;
			} else {
				return null;
			}
		} catch (Exception e) {
			System.out.println("TUsers_DaoImpl.Security_verification() 方法发生异常:");
			e.printStackTrace();
			return null;
		} finally {
			hsf.closeSession();
		}
	}
	public TUsers Changepassword(int id,String password) {
		// 修改密码
		TUsers user = new TUsers();

		Session session = hsf.getSession();
		Transaction ts = null;
		
		try {
			  String hqlString="Update TUsers set password='"+password+"' where id="+id;
//			  session=HibernateUtil.getSession();
			  Query query=session.createQuery(hqlString);
			  session.beginTransaction();
			  ts = session.beginTransaction();
			  query.executeUpdate();
    		  session.getTransaction().commit();
//			  session.flush();
//              HibernateUtil.closeSession(session);

            
		} catch (Exception e) {
		System.out.println("TUserDaoImpl.Changepassword() 方法发生异常:");
		e.printStackTrace();
		
	}finally {
		
	hsf.closeSession();
	 
}
		return null;
		
		
}
}
