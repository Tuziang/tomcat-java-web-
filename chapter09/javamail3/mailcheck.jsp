<%@ page contentType="text/html; charset=GB2312" %>

<html><head><title>mailcheck</title></head>
<body>

<%
String name=null;
name=request.getParameter("username");
if(name!=null)
  session.setAttribute("username",name);
else{
  name=(String)session.getAttribute("username");
  if(name==null){
    response.sendRedirect(response.encodeRedirectURL("maillogin.jsp"));    
  }
}
%>

<a href="<%=response.encodeURL("maillogin.jsp")%>">登录</a>&nbsp;&nbsp;&nbsp;
<a href="<%=response.encodeURL("maillogout.jsp")%>">注销</a>
<p>当前用户为：<%=name%> </P>
<P>你的信箱中有100封邮件</P>

<hr>
<% 
Integer counter=(Integer)application.getAttribute("counter");
if(counter!=null){
%>

当前在线人数为：<%=counter %> <br>
<% } %>

</body></html>
