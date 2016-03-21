package com.academy.BookwormRobot.bookShop;

import org.apache.log4j.Logger;

import com.academy.BookwormRobot.utils.HtmlUtils;

public class HelionBookShop extends BookShop {
	
	private final static Logger logger = Logger.getLogger(HelionBookShop.class);

	private final static String URL = "http://helion.pl/promocja-dnia";
	
	private final static String titleDivName = "<div class=\"book_title\">";

	private final static String descrDivName = "<div id=\"center-body-opis\" class=\"center-body\">";

	public HelionBookShop() {
		super(URL, logger);
	}

	@Override
	public String getTitleOfDiscountedBook() {
		String title = HtmlUtils.getInnerContent(titleDivName, url);
		logger.info(title);
		return title;
	}

	@Override
	public String getDescritpionOfDiscountedBook() {
		String descr = HtmlUtils.getInnerContent(descrDivName, url);
		logger.info(descr);
		return descr;
	}

}
