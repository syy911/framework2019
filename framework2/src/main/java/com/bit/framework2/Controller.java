package com.bit.framework2;

import java.sql.SQLException; 

import javax.servlet.http.HttpServletRequest;

public interface Controller {

	String execute(HttpServletRequest req) throws SQLException;
}
