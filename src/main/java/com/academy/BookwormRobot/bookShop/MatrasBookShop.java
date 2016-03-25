package com.academy.BookwormRobot.bookShop;

import org.apache.log4j.Logger;

/**
 * Unfinished Matras book shop
 * 
 * @author Paulina
 *
 */
public class MatrasBookShop extends BookShop {

	private final static Logger logger = Logger.getLogger(HelionBookShop.class);

	private final static String URL = "http://www.matras.pl/ksiazki/tania-ksiazka,k,54";

	@SuppressWarnings("unused")
	private final static String titleDivName = "";

	@SuppressWarnings("unused")
	private final static String descrDivName = "";

	public MatrasBookShop() {
		super(URL, logger);
	}

	@Override
	public void getInfoOfDiscountedBook() {
		// TODO Auto-generated method stub

	}

	@Override
	public int getType() {
		return 0;
	}

}
