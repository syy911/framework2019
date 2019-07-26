package com.bit.framework2;

import java.util.HashMap;
import java.util.Map;

public class BitHandlerMapping {
	private static Map<String,Controller> map = new HashMap<String,Controller>();
	
	public static void setMap(String key, String value) {
		
		try {
			Class clazz = Class.forName(value);
			map.put(key, (Controller)clazz.newInstance());
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Controller getController(String key) {
		return map.get(key);
	}
}
