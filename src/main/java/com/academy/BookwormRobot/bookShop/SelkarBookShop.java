package com.academy.BookwormRobot.bookShop;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		String content = HtmlUtils.getInnerContentFromSelkar(element, URL, 9);

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

		// System.out.println(result);
		return result;
	}

}
