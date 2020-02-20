package market.util;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DealData {  
    //用户登录的判读  
    public String userLogin(String nickname,String password,HttpSession session,ServletContext application){  
        if(nickname.equals(nickname)){  
            //如果密码正确就将用户名放入session  
            session.setAttribute("nickname", nickname);  
            //获取在线用户列表  
            List<String> users=(List<String>)application.getAttribute("users");  
            if(users==null){  
                users=new ArrayList<String>();  
            }  
            //将当前用户加入用户列表  
            users.add(nickname);  
            //更新application中的对象  
            application.setAttribute("users", users);  
            return "True";  
        }else{  
            return "False";  
        }  
    }  
    //添加消息  
    public String addContent(String content,ServletContext application,HttpSession session){  
        List<String> strList=(List<String>) application.getAttribute("MessageList");  
        if(strList==null){  
            strList=new ArrayList<String>();  
        }  
        //获取session中的用户名  
        String username=(String)session.getAttribute("nickname");  
        //获取时间  
        Date date=new Date();  
        content=content.replace("<:", "<img src='Face/");  
        content=content.replace(":>", ".gif' />");  
        //组装消息  
        String message=username+"于"+date.toLocaleString()+"说："+content;  
        //添加到集合中  
        strList.add(message);  
        //放入application对象中  
        application.setAttribute("MessageList", strList);  
        return "True";  
    }  
    //获取所有的消息  
    public String AllChatList(ServletContext application){  
        String str="";  
        List<String> strList=(List<String>) application.getAttribute("MessageList");  
        if(strList==null){ 
        	str="欢迎来到聊天室！";
        }else{
        for(String s:strList){  
        	str+=s+"<br />";  
            }  
        }   
       
        str=str.replace("<:", "<img src='Face/");  
        str=str.replace(":>", ".gif' />");  
        return str.toString();  
    }  
    //获取在线用户列表  
    public String GetOnlineUsers(ServletContext application){  
    	
        StringBuffer sb=new StringBuffer();  
        List<String> strList=(List<String>) application.getAttribute("users");  
        if(strList!=null){  
            for(String s:strList){  
                sb.append(s+"<br />");  
            }  
        }   
        return sb.toString();  
    }  
    //下线  
    public String OffLine(ServletContext application,HttpSession session){  
        //先取出用户名  
        String username=(String)session.getAttribute("nickname");  
        //移除session中的内容  
        session.removeAttribute("nickname");  
        //移除用户列表中的用户名  
        List<String> strList=(List<String>) application.getAttribute("users");  
        if(strList!=null){  
            strList.remove(username);  
        }   
        return "True";  
    }  
}  
