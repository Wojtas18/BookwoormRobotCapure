package com.academy.BookwormRobot.bookShop;

import org.apache.log4j.Logger;

import com.academy.BookwormRobot.enums.BookShopTypes;
import com.academy.BookwormRobot.utils.HtmlUtils;

public class HelionBookShop extends BookShop {
	
	private final static Logger logger = Logger.getLogger(HelionBookShop.class);

	private final static String URL = "http://helion.pl/promocja-dnia";
	
	private final static String titleDivName = "<div class=\"book_title\">";

	private final static String descrDivName = "<div id=\"center-body-opis\" class=\"center-body\">";

	public HelionBookShop() {
		super(URL, logger);
	}


	public String getTitleOfDiscountedBook() {
		String title = HtmlUtils.getInnerContent(titleDivName, url);
		String s1 = title.replaceAll("\\s"," ");
		logger.info(s1);
		return title;
	}


	public String getDescritpionOfDiscountedBook() {
		String descr = HtmlUtils.getInnerContent(descrDivName, url);
		String s1 = descr.replaceAll("\\s"," ");
		logger.info(s1);

		return descr;
	}
	
	public int getType() {
		return BookShopTypes.helion.getType();
	}


	@Override
	public void getInfoOfDiscountedBook() {
		getTitleOfDiscountedBook();
		getDescritpionOfDiscountedBook();
	}

}
