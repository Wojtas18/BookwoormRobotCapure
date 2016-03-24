package com.academy.BookwormRobot.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import com.jaunt.Element;
import com.jaunt.JauntException;
import com.jaunt.UserAgent;

/**
 * Some usefull methods used in get HTML content
 * 
 * @author Paulina
 *
 */
public class HtmlUtils {
	private final static Logger logger = Logger.getLogger(HtmlUtils.class);

	/**
	 * Just simply getting HTML content
	 * 
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
	 * 
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

	/**
	 * Getting content of each selected HTML tag(element)
	 * 
	 * @param element
	 * @param url
	 * @return
	 */
	public static String getInnerContentFromSelkar(String element, String url) {
		String content = null;
		try {
			UserAgent userAgent = new UserAgent();
			userAgent.visit(url);
			content = userAgent.doc.findEach(element).getElement(9).getText();
		} catch (JauntException e) {
			logger.error(e.getMessage());
		}

		List<String> allMatchesNames = new ArrayList<String>();
		List<String> allMatchesBrands = new ArrayList<String>();

		String result = "";

		Matcher matcherNames = Pattern.compile("'name'    : '(.*?)',").matcher(content);
		Matcher matcherBrans = Pattern.compile("'brand'   : '(.*?)',").matcher(content);

		while (matcherNames.find()) {
			allMatchesNames.add(matcherNames.group(1));
		}

		while (matcherBrans.find()) {
			allMatchesBrands.add(matcherBrans.group(1));
		}

		for (int i = 0; i < allMatchesBrands.size(); i++) {
			result += allMatchesBrands.get(i) + "  " + allMatchesNames.get(i) + "\n";
		}

		//System.out.println(result);
		return result;
	}

}
