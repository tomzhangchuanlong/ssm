package com.zhichengzhang.ssm.utility;

import javax.servlet.*;
import java.io.IOException;

public class DemoFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("==>DemoFilter启动");
	}
 
	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
		System.out.println("==>DemoFilter拦截请求 开始");
		chain.doFilter(request, response);
		System.out.println("==>DemoFilter拦截请求 结束");
	}
 
	@Override
	public void destroy() {
		System.out.println("==>DemoFilter destroy");
	}
}
