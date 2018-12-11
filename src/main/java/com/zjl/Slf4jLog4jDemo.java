package com.zjl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * 描述:
 * @author  zhoujialin
 * @created 2018年10月8日 上午10:22:53
 * @since   v1.0.0
 */
public class Slf4jLog4jDemo {
	static Logger logger = LoggerFactory.getLogger(Slf4jLog4jDemo.class);

	public static void main(String[] args) {
		//org.apache.log4j.Logger logger4j = org.apache.log4j.Logger.getRootLogger();
		//logger4j.setLevel(org.apache.log4j.Level.toLevel("DEBUG"));
		
		//Trace<debug<info<warn<error
		logger.trace("Sample Trace");
		logger.debug("Sample Debug");
		logger.info("Sample Info");
		logger.warn("Sample Warn");
		logger.error("Sample Error");
	}
}
