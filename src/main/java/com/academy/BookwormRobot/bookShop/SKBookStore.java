package com.academy.BookwormRobot.bookShop;

import org.apache.log4j.Logger;

import com.academy.BookwormRobot.utils.HtmlUtils;

public class SKBookStore extends BookShop {

	private final static Logger logger = Logger.getLogger(SKBookStore.class);

	private final static String URL = "http://www.swiatksiazki.pl/e-book-za-0zl/";
	
	private final static String titleDivName = "<div class=\"elements freeEbook\">";


	public SKBookStore() {
		super(URL, logger);
	}

	@Override
	public String getTitleOfDiscountedBook() {
		String title = HtmlUtils.getInnerContent(titleDivName, URL);
		logger.info(title);
		return title;
	}

	@Override
	public String getDescritpionOfDiscountedBook() {
		// TODO Auto-generated method stub
		return null;
	}

}
