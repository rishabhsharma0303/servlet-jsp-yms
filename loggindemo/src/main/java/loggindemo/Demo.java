package loggindemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Demo {
	private static Logger logger=LoggerFactory.getLogger(Demo.class);
	
	public static void main(String[] args) {
		logger.info("code is working till now ");
		logger.debug("spring container is started");
		
		String data ="2323A";
		try{
			int val=Integer.parseInt(data);
		}catch(Exception e) {
			logger.error("code fail with exception "+ e);
		}
		
	}
}
