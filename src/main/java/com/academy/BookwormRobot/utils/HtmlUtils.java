package com.academy.BookwormRobot.utils;

import org.apache.log4j.Logger;

import com.jaunt.Element;
import com.jaunt.JauntException;
import com.jaunt.UserAgent;

public class HtmlUtils {
	
	public static String getHtmlContent(String url, Logger logger) {
		String innerHtml = null;
		try {
			UserAgent userAgent = new UserAgent();
			userAgent.visit(url);
			innerHtml = userAgent.doc.innerHTML();
		} catch (JauntException e) {
			logger.error(e.getMessage());
		}
		return innerHtml;
	}
	
	public static String getInnerContent(String element, String url, Logger logger) {
		Element innerHtml = null;
		try {
			UserAgent userAgent = new UserAgent();
			userAgent.visit(url);
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
