package com.academy.BookwormRobot.bookShop;

import org.apache.log4j.Logger;

import com.academy.BookwormRobot.enums.BookShopTypes;
import com.academy.BookwormRobot.utils.HtmlUtils;
import com.academy.BookwormRobot.utils.StringUtils;

public class SelkarBookShop extends BookShop {

	private final static Logger logger = Logger.getLogger(SelkarBookShop.class);

	private final static String URL = "http://selkar.pl/ksiazki?sp=1#red=0|status=sp";

	private final static String element = "<script>";

	public SelkarBookShop() {
		super(URL, logger);
	}

	@Override
	public void getInfoOfDiscountedBook() {
		if (StringUtils.isNullOrEmpty(getTitleAndBrandOfDiscountedBooks())) {
			logger.error("Nie mozna zaladowac info o ksiazkach!");
		} else {
			logger.info(getTitleAndBrandOfDiscountedBooks());
		}
	}

	@Override
	public int getType() {
		return BookShopTypes.selkar.getType();
	}

	public String getTitleAndBrandOfDiscountedBooks() {
		String info = HtmlUtils.getInnerContentFromSelkar(element, URL);
		return info;

	}

}
