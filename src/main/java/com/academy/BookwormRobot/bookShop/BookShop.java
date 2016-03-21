package com.academy.BookwormRobot.bookShop;

public abstract class BookShop {

	protected String url;
	
	public BookShop(String url) {
		this.url = url;
	}
	
	public abstract String getHtmlContent();

	public abstract String getTitleOfDiscountedBook();
	
	public abstract String getDescritpionOfDiscountedBook();
	
}
