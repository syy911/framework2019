package com.bit.framework2;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.framework2.BitHandlerMapping;
import com.bit.framework2.DispatcherServlets;


public class DispatcherServlets extends HttpServlet{
	
	//컨테이너가 돌아갈 때 최초에 한번 put 그다음 필요할 때 밑에서 꺼내씀
	@Override
	public void init() throws ServletException {
		Properties prop = new Properties();	
		//경로를 모를때 경로 찾아오는 것
		Class<? extends DispatcherServlets> clz = getClass();
		//경로 정보 loader
		ClassLoader loader = clz.getClassLoader();
		InputStream is = loader.getResourceAsStream("bit.properties");
		try {
			//bit.properies 파일에서 읽어들인것을 prop에 적용 
			prop.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Set keys = prop.keySet();
		Iterator<String> ite = keys.iterator();
		while(ite.hasNext()){
			String key = ite.next();
			String clInfo = prop.getProperty(key);
			BitHandlerMapping.setMap(key, clInfo);
		}	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		doDo(req,resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doDo(req,resp);
	}
	
	public void doDo(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("doDoȣ��...");
		
		String root=req.getContextPath();
		String path=req.getRequestURI().substring(root.length());
		
		//handlerMapping
		
		Controller controller=null;
		controller = BitHandlerMapping.getController(path);
		
		String viewName=null;
		try {
			viewName = controller.execute(req);
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		//viewResolver 
		String prefix="/WEB-INF/view/";
		String suffix=".jsp";
		
		
		if(viewName.startsWith("redirect:")){
			resp.sendRedirect(root+viewName.substring("redirect:".length()));
		}else{
		viewName=prefix+viewName+suffix;
		req.getRequestDispatcher(viewName).forward(req, resp);
		}	
	}
}
