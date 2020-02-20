<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ page import="java.util.Properties"%> 
<%@ page import="javax.mail.Flags"%>
<%@ page import="javax.mail.Folder"%>
<%@ page import="javax.mail.Message"%>
<%@ page import="javax.mail.Session"%>
 <%@ page import="com.sun.mail.imap.IMAPFolder"%>
  <%@ page import="com.sun.mail.imap.IMAPStore"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Email3.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
<%
   String user = "838226572@qq.com";// 邮箱的用户名  
        String password = "LIUyichun28.-*l+"; // 邮箱的密码  
  
        Properties prop = System.getProperties();  
        prop.setProperty("mail.store.protocol", "imap");
        prop.setProperty("mail.imap.host", "imap.qq.com");
        prop.setProperty("mail.imap.port", "143");
//        prop.put("mail.store.protocol", "smtp");  
//        prop.put("mail.smtp.host", "smtp.qq.com");  
  
        Session s = Session.getInstance(prop);  
          
        int total = 0;  
        IMAPStore store = (IMAPStore) s.getStore("imap"); // 使用imap会话机制，连接服务器  
        store.connect(user, password);  
        IMAPFolder folder = (IMAPFolder) store.getFolder("INBOX"); // 收件箱  
        folder.open(Folder.READ_WRITE);  
        // 获取总邮件数  
        total = folder.getMessageCount();  
       out.println("--------------共有邮件：" + total+ " 封--------------");  
        // 得到收件箱文件夹信息，获取邮件列表  
        out.println();
        out.println("未读邮件数：" + folder.getUnreadMessageCount());  
        Message[] messages = folder.getMessages();  
        int messageNumber = 0;  
        for (Message message : messages) {  
            out.println("发送时间：" + message.getSentDate());  
            out.println("主题：" + message.getSubject());  
            out.println("内容：" + message.getContent());  
            Flags flags = message.getFlags();  
            if (flags.contains(Flags.Flag.SEEN))  
              out.println("这是一封已读邮件");  
            else {  
                out.println("未读邮件");  
            }  
           out.println("=========================");  
           out.println("=========================");  
            //每封邮件都有一个MessageNumber，可以通过邮件的MessageNumber在收件箱里面取得该邮件  
            messageNumber = message.getMessageNumber();  
        }  
        Message message = folder.getMessage(messageNumber);  
        out.println(message.getContent()+message.getContentType());  
        // 释放资源  
        if (folder != null)  
            folder.close(true);   
        if (store != null)  
            store.close();  
  
  
  
  
  
  
%>
  </body>
</html>
