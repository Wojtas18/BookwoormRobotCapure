package com.academy.BookwormRobot.bookShop;

import org.apache.log4j.Logger;

public class MatrasBookShop extends BookShop {
	
	private final static Logger logger = Logger.getLogger(HelionBookShop.class);

	private final static String URL = "http://www.matras.pl/ksiazki/tania-ksiazka,k,54"; 
	
	private final static String titleDivName = "";

	private final static String descrDivName = "";
	
	public MatrasBookShop() {
		super(URL, logger);
	}

	@Override
	public String getTitleOfDiscountedBook() {
		//System.out.println(HtmlUtils.getHtmlContent(URL));
		//logger.info(title);
		return null;
	}

	@Override
	public String getDescritpionOfDiscountedBook() {
		// TODO Auto-generated method stub
		return null;
	}
}
