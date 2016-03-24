package com.academy.BookwormRobot.bookShop;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

/**
 * Some tests wchich checks if the content is downloaded correctly
 * 
 * @author Paulina
 *
 */
public class BookShopTests {

	@Test
	public void testOfGettingBookTitleFromHelion() {
		HelionBookShop helion = new HelionBookShop();
		String title = helion.getTitleOfDiscountedBook();
		assertThat(title).isNotNull();
		// System.out.println(title);
	}

	@Test
	public void testOfGettingBookDescrFromHelion() {
		HelionBookShop helion = new HelionBookShop();
		String descr = helion.getDescritpionOfDiscountedBook();
		assertThat(descr).isNotNull();
		// System.out.println(descr);
	}

	@Test
	public void testOfGettingBookInfoFromGKN() {
		GKNBookShop gkn = new GKNBookShop();
		String title = gkn.getTitleOfDiscountedBook();
		assertThat(title).isNotNull();
		// System.out.println(title);
	}

	@Test
	public void testOfGettingBookInfoFromSK() {
		SKBookShop sk = new SKBookShop();
		String title = sk.getTitleOfDiscountedBook();
		assertThat(title).isNotNull();
		// System.out.println(title);
	}

}
