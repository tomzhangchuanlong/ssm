package com.zhichengzhang.ssm.utility;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 比较核心的代码是自定义类上面加上@WebFilter，其中@Order注解表示执行过滤顺序，值越小，越先执行
 *
 */
@Order(1)
@WebFilter(urlPatterns = "/*", filterName = "annotationDemoFilter")
public class AnnotationDemoFilter implements Filter {
	Log log = LogFactory.getLog(AnnotationDemoFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    	 System.out.println("==>AnnotationDemoFilter 启动");
        log.info("init IndexFilter");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("doFilter IndexFilter");
        
        System.out.println("==>AnnotationDemoFilter 拦截请求 开始");
        filterChain.doFilter(servletRequest,servletResponse);
		System.out.println("==>AnnotationDemoFilter 拦截请求 结束");
    }

    @Override
    public void destroy() {
    	System.out.println("==>AnnotationDemoFilter 销毁");
    }
}
