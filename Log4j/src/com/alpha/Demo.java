package com.alpha;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Demo {

	private static Logger Log =LogManager.getLogger(Demo.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Log.debug("I am debugging");
		Log.info("Object is present");
		Log.error("Object is not present");
		Log.fatal("Object is Fatal");
		
		
	} 
 
}
