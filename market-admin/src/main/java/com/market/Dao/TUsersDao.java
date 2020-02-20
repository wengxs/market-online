package market.Dao;

import com.market.main.TUsers;

public interface TUsersDao {
public void insertUsers(TUsers user);
public void updateUsers(TUsers user);
public TUsers Security_verification(String nickname, String question, String answer);
public TUsers Changepassword(int id, String password);
public TUsers userlogin(String nickname, String password);
}
