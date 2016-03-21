package com.academy.BookwormRobot.bookShop;

import org.apache.log4j.Logger;

import com.jaunt.Element;
import com.jaunt.JauntException;
import com.jaunt.UserAgent;

public class HelionBookShop extends BookShop {
	private final static Logger logger = Logger.getLogger(HelionBookShop.class);

	private final static String URL = "http://helion.pl/promocja-dnia";

	public HelionBookShop() {
		super(URL);
	}

	public String getHtmlContent() {
		String innerHtml = null;
		try {
			UserAgent userAgent = new UserAgent();
			userAgent.visit(URL);
			innerHtml = userAgent.doc.innerHTML();
		} catch (JauntException e) {
			logger.error(e.getMessage());
		}
		return innerHtml;
	}

	@Override
	public String getTitleOfDiscountedBook() {
		Element innerHtml = null;
		try {
			UserAgent userAgent = new UserAgent();
			userAgent.visit(URL);
			String element = "<div class=\"book_title\">";
			innerHtml = userAgent.doc.findFirst(element);
		} catch (JauntException e) {
			logger.error(e.getMessage());
		}
		
		if (innerHtml.innerText() != null ) {
			logger.info(innerHtml.innerText());
		}
		return innerHtml.innerText();
	}

	@Override
	public String getDescritpionOfDiscountedBook() {
		Element innerHtml = null;
		try {
			UserAgent userAgent = new UserAgent();
			userAgent.visit(URL);
			String element = "<div id=\"center-body-opis\" class=\"center-body\">";
			innerHtml = userAgent.doc.findFirst(element);
		} catch (JauntException e) {
			logger.error(e.getMessage());
		}
		
		if (innerHtml.innerText() != null ) {
			logger.info(innerHtml.innerText());
		}
		return innerHtml.innerText();
	}
}
