<%@ page contentType="text/html; charset=gb2312" language="java" errorPage="" %>
<%
         
 out.println("<script>parent.location.href='login.jsp';</script>");
 session.invalidate();
%>
<%
response.setHeader("Pragma","No-cache");
response.setHeader("Cache-Control","no-cache");
response.setDateHeader("Expires", 0);
%> 
<meta http-equiv="pragma" content="no-cache">
 <meta http-equiv="cache-control" content="no-cache">
 <meta http-equiv="expires" content="0">  