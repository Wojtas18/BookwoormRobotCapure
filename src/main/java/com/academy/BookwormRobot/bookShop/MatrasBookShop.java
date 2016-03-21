package com.academy.BookwormRobot.bookShop;

import org.apache.log4j.Logger;

public class MatrasBookShop extends BookShop {
	
	private final static Logger logger = Logger.getLogger(HelionBookShop.class);

	private final static String URL = ""; 
	
	private final static String titleDivName = "";

	private final static String descrDivName = "";
	
	public MatrasBookShop() {
		super(URL, logger, titleDivName, descrDivName);
	}

	@Override
	public String getTitleOfDiscountedBook() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDescritpionOfDiscountedBook() {
		// TODO Auto-generated method stub
		return null;
	}
}
