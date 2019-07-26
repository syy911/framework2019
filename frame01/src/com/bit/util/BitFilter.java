package com.bit.util;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

//@WebFilter(value="/bit.do", initParams={
//		@WebInitParam(name="msg2", value="xyz")
//})
public class BitFilter implements Filter {
	String msg=null;
	@Override
	public void destroy() {
		System.out.println("BitFilter dest...");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("BitFilter before...");
		
//		Enumeration<String> names=null;
//		names=req.getServletContext().getInitParameterNames();
//		
//		while(names.hasMoreElements()){
//			System.out.println(names.nextElement());
//		}
		System.out.println("init param: "+msg);
		
		chain.doFilter(req, resp);
		System.out.println("BitFilter after...");
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		System.out.println("BitFilter init...");
//		Enumeration<String> names = config.getInitParameterNames();
//		while(names.hasMoreElements()){
//			System.out.println(names.nextElement());
//		}
		msg=config.getInitParameter("msg2");
	}

}
