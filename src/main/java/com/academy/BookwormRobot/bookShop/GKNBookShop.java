package com.academy.BookwormRobot.bookShop;

import org.apache.log4j.Logger;

import com.academy.BookwormRobot.enums.BookShopTypes;
import com.academy.BookwormRobot.utils.HtmlUtils;

public class GKNBookShop extends BookShop {

	private final static Logger logger = Logger.getLogger(GKNBookShop.class);

	private final static String URL = "http://www.eksiegarnia.pl/lokal/;s,promocje";
	
	private final static String titleDivName = "<table class=\"tabela_podstrona\">";


	public GKNBookShop() {
		super(URL, logger);
	}
	
	public String getTitleOfDiscountedBook() {
		String title = HtmlUtils.getInnerContent(titleDivName, URL);
		String s1 = title.replaceAll("\\s"," ");
		logger.info(s1);
		return title;
	}

	public int getType() {
		return BookShopTypes.glownaKsiegarniaNaukowa.getType();
	}

	@Override
	public void getInfoOfDiscountedBook() {
		getTitleOfDiscountedBook();
	}

}
