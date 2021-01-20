package mypack;

import javax.servlet.*;
import java.io.*;

public class HelloServlet3 extends GenericServlet implements SingleThreadModel{
  private String username=null;  //usernameΪʵ������
  
  /** ��Ӧ�ͻ�����*/
  public void service(ServletRequest request,ServletResponse response)
    throws ServletException, IOException {
    
    //��username���������ֵ��usernameʵ������ 
    username=request.getParameter("username");
     
    try{
      Thread.sleep(3000); //�����ӳ���Ӧ�ͻ������ʱ��
    }catch(Exception e){e.printStackTrace();}
      
    //����HTTP��Ӧ�����ĵ�MIME���ͼ��ַ�����
    response.setContentType("text/html;charset=GB2312");
   
    /*���HTML�ĵ�*/
    PrintWriter out = response.getWriter();
    out.println("<html><head><title>HelloServlet</TITLE></head>");
    out.println("<body>");
    out.println("���: "+username);
    out.println("</body></html>");
     
    out.close(); //�ر�PrintWriter
   }
}




/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Tomcat��Java Web�����������>>           *
 * ����֧����ַ��www.javathinker.net                *
 ***************************************************/