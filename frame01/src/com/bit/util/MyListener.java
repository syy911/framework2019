package com.bit.util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
@WebListener
public class MyListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("Listener dest...");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("Listener init...");

	}

}
