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
		logger.trace("확인");
		logger.debug("개발자모드");
		logger.info("정보제공");
		logger.warn("주의고지");
		logger.error("에러메세지");
		logger.fatal("치명적인 문제");
		
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}

/*

 %p

 debug, info, warn, error, fatal 등의 priority 출력

 %m

 로그내용 출력

 %d

 로깅 이벤트가 발생한 시간을 출력

 ex)포맷은 %d{HH:mm:ss} 같은 형태의 SimpleDateFormat

 %t

 로그이벤트가 발생된 쓰레드의 이름 출력

 %F

 로깅이 발생한 프로그램 파일명 출력

 %l

 로깅이 발생한 caller의 정보 출력

 %L

 로깅이 발생한 caller의 라인수 출력

 %M

 로깅이 발생한 method 이름 출력

 %

 % 표시 출력

 %n

 플랫폼 종속적인 개행문자 출력

 %c

 카테고리 출력

 ex)카테고리가 a.b.c 처럼 되어있다면 %c{2}는 b.c 출력

 %C

 클래스명 출력

 ex)클래스구조가 org.apache.xyz.SomeClass 처럼 되어있다면 %C{2}는 xyz.SomeClass 출력

 %r

 어플리케이션 시작 이후 부터 로깅이 발생한 시점의 시간(milliseconds) 출력

 %x

 로깅이 발생한 thread와 관련된 NDC(nested diagnostic context) 출력

 %X

 로깅이 발생한 thread와 관련된 MDC(mapped diagnostic context) 출력 
 */
 