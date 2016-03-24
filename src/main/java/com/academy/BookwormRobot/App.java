package com.academy.BookwormRobot;

import org.apache.log4j.Logger;

import com.academy.BookwormRobot.bookShop.BookShop;
import com.academy.BookwormRobot.bookShop.GKNBookShop;
import com.academy.BookwormRobot.bookShop.HelionBookShop;
import com.academy.BookwormRobot.bookShop.SKBookShop;
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
		logger.info("Hello! Bookworm Robot is starting his job!");

		for (int i = 0; i < args.length; i++) {
			if (Integer.parseInt(args[i]) == BookShopTypes.glownaKsiegarniaNaukowa.getType()) {
				BookShop bs = new GKNBookShop();
				bs.getInfoOfDiscountedBook();
			}

			if (Integer.parseInt(args[i]) == BookShopTypes.helion.getType()) {
				BookShop bs = new HelionBookShop();
				bs.getInfoOfDiscountedBook();
			}

			if (Integer.parseInt(args[i]) == BookShopTypes.swiatKsiazki.getType()) {
				BookShop bs = new SKBookShop();
				bs.getInfoOfDiscountedBook();
			}
		}
	}
}
