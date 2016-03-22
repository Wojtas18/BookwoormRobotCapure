package com.academy.BookwormRobot.bookShop;

import org.apache.log4j.Logger;

import com.academy.BookwormRobot.enums.BookShopTypes;

public abstract class BookShop {
	
	protected String url;
	protected Logger logger;
	protected BookShopTypes type;
	
	public BookShop(String url, Logger logger) {
		this.url = url;
		this.logger = logger;
	}
	
	public abstract void getInfoOfDiscountedBook();
		
}
