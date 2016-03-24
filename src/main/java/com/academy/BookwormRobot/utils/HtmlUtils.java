package com.academy.BookwormRobot.utils;

import org.apache.log4j.Logger;

import com.jaunt.Element;
import com.jaunt.JauntException;
import com.jaunt.UserAgent;

/**
 * Some usefull methods used in get HTML content
 * @author Paulina
 *
 */
public class HtmlUtils {
	private final static Logger logger = Logger.getLogger(HtmlUtils.class);

	/**
	 * Just simply getting HTML content
	 * @param url
	 * @return
	 */
	public static String getHtmlContent(String url) {
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
	
	/**
	 * Getting content of first selected HTML tag(element) 
	 * @param element
	 * @param url
	 * @return
	 */
	public static String getInnerContent(String element, String url) {
		Element innerHtml = null;
		try {
			UserAgent userAgent = new UserAgent();
			userAgent.visit(url);
			innerHtml = userAgent.doc.findFirst(element);
		} catch (JauntException e) {
			logger.error(e.getMessage());
		}
		
		return innerHtml.innerText();
	}
}
