package com.academy.BookwormRobot.bookShop;

import com.jaunt.JauntException;
import com.jaunt.UserAgent;

public class HelionBookShop extends BookShop {

	private static final String URL = "http://helion.pl/promocja-dnia";

	public HelionBookShop() {
		super(URL);
	}

	public String printHtmlContent() {
		String innerHtml = null;
		try {
			UserAgent userAgent = new UserAgent();
			userAgent.visit(URL);
			innerHtml = userAgent.doc.innerHTML();
		} catch (JauntException e) {
			System.err.println(e);

		}
		return innerHtml;
	}
}
