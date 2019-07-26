package com.bit.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TwoController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String cmsg=this.getServletContext().getInitParameter("cmsg");
		System.out.println("context param: "+cmsg);
		
		String msg=getInitParameter("msg");
		req.setAttribute("msg",	msg);
		req.getRequestDispatcher("two.jsp").forward(req, resp);
	}
}
