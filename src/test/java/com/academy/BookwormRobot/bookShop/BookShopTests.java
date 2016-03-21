package com.academy.BookwormRobot.bookShop;
import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

public class BookShopTests {
	
	@Test
	public void testOfGettingBookTitleFromHelion() {
		BookShop helion = new HelionBookShop();
		String title = helion.getTitleOfDiscountedBook();
		assertThat(title).isNotNull();
		//System.out.println(title);
	}
	
	@Test
	public void testOfGettingBookDescrFromHelion() {
		BookShop helion = new HelionBookShop();
		String descr = helion.getDescritpionOfDiscountedBook();
		assertThat(descr).isNotNull();
		//System.out.println(descr);
	}

}
