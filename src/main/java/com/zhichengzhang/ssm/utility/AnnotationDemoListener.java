package com.zhichengzhang.ssm.utility;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class AnnotationDemoListener implements ServletContextListener {
	  private Log log = LogFactory.getLog(AnnotationDemoListener.class);
	  private ServletContext context = null;
      @Override
      public void contextInitialized(ServletContextEvent servletContextEvent) {
    	  System.out.println("==>AnnotationDemoListener启动");
  		  context = servletContextEvent.getServletContext();          
         /* User user = new User();
          user.setUserName("user2");
          user.setPassword("88888");
          context.setAttribute("user2", user);    */
          log.info("AnnotationDemoListener contextInitialized");
      }

      @Override
      public void contextDestroyed(ServletContextEvent servletContextEvent) {
    	  System.out.println("==>AnnotationDemoListener Begin Destroy");
  		/*User user = (User)context.getAttribute("user2");
          System.out.println("AnnotationDemoListener -- contextDestroyed: "+user.toString());*/
          this.context = null;    
  		System.out.println("==>AnnotationDemoListener End Destroy");
    	  log.info("AnnotationDemoListener contextDestroyed");
      }
}
