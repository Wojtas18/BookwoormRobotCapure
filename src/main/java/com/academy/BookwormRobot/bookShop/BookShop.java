package com.academy.BookwormRobot.bookShop;

import org.apache.log4j.Logger;

public abstract class BookShop {
	
	protected String url;
	protected Logger logger;

	
	public BookShop(String url, Logger logger) {
		this.url = url;
		this.logger = logger;
	}
	
	public abstract String getTitleOfDiscountedBook();
	
	public abstract String getDescritpionOfDiscountedBook();
	
}
