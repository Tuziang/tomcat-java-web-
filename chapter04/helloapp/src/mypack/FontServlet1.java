package mypack;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.*;

@WebServlet(name="FontServlet1" ,
            urlPatterns={"/font1"},
            initParams={
              @WebInitParam(name="color",value="blue"),
              @WebInitParam(name="size",value="15")
            })
public class FontServlet1 extends HttpServlet {
  /** ��Ӧ�ͻ�����*/
  public void doGet(HttpServletRequest request,HttpServletResponse response)
    throws ServletException, IOException {
    //���word������� 
    String word=request.getParameter("word");
    if(word==null)word="Hello";
    
    //��ȡ��ʼ������
    String color=getInitParameter("color");
    String size=getInitParameter("size");
    System.out.println("servletName: "+getServletName());

    //����HTTP��Ӧ�����ĵ�MIME���ͼ��ַ�����
    response.setContentType("text/html;charset=GBK");
   
    /*���HTML�ĵ�*/
    PrintWriter out = response.getWriter();
    out.println("<html><head><title>FontServlet</TITLE></head>");
    out.println("<body>");
    out.println("<font size='"+size+"' color='"+color+"'>"+word+"</font>");
    out.println("</body></html>");
     
    out.close(); //�ر�PrintWriter
  }
}





/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Tomcat��Java Web�����������>>           *
 * ����֧����ַ��www.javathinker.net                *
 ***************************************************/