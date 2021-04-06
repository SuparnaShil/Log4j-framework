package com.beta;



import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Demo1 {

	private static Logger Log =LogManager.getLogger(Demo1.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Log.debug("I am debugging");
		
		Log.fatal("Object is Fatal");
		
		
	} 
 
}

