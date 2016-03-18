package com.academy.BookwormRobot;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private final static Logger logger = Logger.getLogger(App.class);
	
    public static void main( String[] args )
    {
        logger.info("Hello!");
        logger.warn("Warning!");
        logger.error("Ojej error");
        logger.debug("Debugujemy");
        logger.fatal("Bardzo niedobrze");
    }
}
