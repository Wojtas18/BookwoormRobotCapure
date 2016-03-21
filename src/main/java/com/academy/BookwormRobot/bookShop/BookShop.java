package com.academy.BookwormRobot.bookShop;

import org.apache.log4j.Logger;

public abstract class BookShop {
	
	protected String url;
	protected Logger logger;
	protected String titleElement;
	protected String descrElement;
	
	public BookShop(String url, Logger logger, String titleElement, String descrElement) {
		this.url = url;
		this.logger = logger;
		this.titleElement = titleElement;
		this.descrElement = descrElement;
	}
	
	public abstract String getTitleOfDiscountedBook();
	
	public abstract String getDescritpionOfDiscountedBook();
	
}
