package com.academy.BookwormRobot;

import org.apache.log4j.Logger;

import com.academy.BookwormRobot.bookShop.BookShop;
import com.academy.BookwormRobot.bookShop.GKNBookShop;
import com.academy.BookwormRobot.bookShop.HelionBookShop;
import com.academy.BookwormRobot.bookShop.SKBookShop;
import com.academy.BookwormRobot.bookShop.SelkarBookShop;
import com.academy.BookwormRobot.enums.BookShopTypes;

/**
 * Main class
 *
 */
public class App {
	private final static Logger logger = Logger.getLogger(App.class);

	/**
	 * Main function - gets the parameters from the console and creates proper
	 * objects
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		logger.info("Hello! Bookworm Robot is starting his job! \n\n");
		BookShop bs = null;
		for (int i = 0; i < args.length; i++) {
			if (Integer.parseInt(args[i]) == BookShopTypes.glownaKsiegarniaNaukowa.getType()) {
				bs = new GKNBookShop();
				bs.getInfoOfDiscountedBook();
			}

			if (Integer.parseInt(args[i]) == BookShopTypes.helion.getType()) {
				bs = new HelionBookShop();
				bs.getInfoOfDiscountedBook();
			}

			if (Integer.parseInt(args[i]) == BookShopTypes.swiatKsiazki.getType()) {
				bs = new SKBookShop();
				bs.getInfoOfDiscountedBook();
			}

			if (Integer.parseInt(args[i]) == BookShopTypes.selkar.getType()) {
				bs = new SelkarBookShop();
				bs.getInfoOfDiscountedBook();
			}
		}
		if (bs == null) {
			logger.error("Nie wybrano zadnej ksiegarni!");
		}
	}
}
