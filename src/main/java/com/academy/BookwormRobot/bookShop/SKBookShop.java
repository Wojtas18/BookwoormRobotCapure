package com.academy.BookwormRobot.bookShop;

import org.apache.log4j.Logger;

import com.academy.BookwormRobot.enums.BookShopTypes;
import com.academy.BookwormRobot.utils.HtmlUtils;

public class SKBookShop extends BookShop {

	private final static Logger logger = Logger.getLogger(SKBookShop.class);

	private final static String URL = "http://www.swiatksiazki.pl/e-book-za-0zl/";
	
	private final static String titleDivName = "<div class=\"elements freeEbook\">";


	public SKBookShop() {
		super(URL, logger);
	}

	public String getTitleOfDiscountedBook() {
		String title = HtmlUtils.getInnerContent(titleDivName, URL);
		String s1 = title.replaceAll("\\s"," ");
		logger.info(s1);
		return title;
	}

	public int getType() {
		return BookShopTypes.swiatKsiazki.getType();
	}

	@Override
	public void getInfoOfDiscountedBook() {
		getTitleOfDiscountedBook();		
	}

}
