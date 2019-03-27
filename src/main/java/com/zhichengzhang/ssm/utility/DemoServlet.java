package com.zhichengzhang.ssm.utility;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DemoServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			System.out.println("==>DemoServlet接受请求");
			ServletContext servletContext=req.getSession().getServletContext();
			/*User user= (User) servletContext.getAttribute("user1");*/
			resp.getWriter().write("DemoServlet Access:");
		
	}
 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
	}
}
