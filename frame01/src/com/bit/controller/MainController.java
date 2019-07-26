package com.bit.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
//@WebServlet(value="/main.do", initParams={
//		@WebInitParam(name="msg",value="abcd")
//})

@WebServlet("/")
public class MainController extends HttpServlet {
	static Logger logger = Logger.getLogger(MainController.class);

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
//1.		String cmsg=this.getServletContext().getInitParameter("cmsg");
//		System.out.println("context param: "+cmsg);
//		String msg=getInitParameter("msg");
//		System.out.println("servlets param: "+msg);
//		BasicConfigurator.configure();
		
//2.		logger.debug("Entering application.");
		
//3.	 	trace < debug < info < warn < error < fatal
		logger.trace("Ȯ��");
		logger.debug("�����ڸ��");
		logger.info("��������");
		logger.warn("���ǰ���");
		logger.error("�����޼���");
		logger.fatal("ġ������ ����");
		
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}

/*

 %p

 debug, info, warn, error, fatal ���� priority ���

 %m

 �α׳��� ���

 %d

 �α� �̺�Ʈ�� �߻��� �ð��� ���

 ex)������ %d{HH:mm:ss} ���� ������ SimpleDateFormat

 %t

 �α��̺�Ʈ�� �߻��� �������� �̸� ���

 %F

 �α��� �߻��� ���α׷� ���ϸ� ���

 %l

 �α��� �߻��� caller�� ���� ���

 %L

 �α��� �߻��� caller�� ���μ� ���

 %M

 �α��� �߻��� method �̸� ���

 %

 % ǥ�� ���

 %n

 �÷��� �������� ���๮�� ���

 %c

 ī�װ� ���

 ex)ī�װ��� a.b.c ó�� �Ǿ��ִٸ� %c{2}�� b.c ���

 %C

 Ŭ������ ���

 ex)Ŭ���������� org.apache.xyz.SomeClass ó�� �Ǿ��ִٸ� %C{2}�� xyz.SomeClass ���

 %r

 ���ø����̼� ���� ���� ���� �α��� �߻��� ������ �ð�(milliseconds) ���

 %x

 �α��� �߻��� thread�� ���õ� NDC(nested diagnostic context) ���

 %X

 �α��� �߻��� thread�� ���õ� MDC(mapped diagnostic context) ��� 
 */
 