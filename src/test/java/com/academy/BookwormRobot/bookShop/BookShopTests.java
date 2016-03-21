package com.academy.BookwormRobot.bookShop;
import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

public class BookShopTests {
	
	@Test
	public void testProperHtmlPrinting() {
		BookShop helion = new HelionBookShop();
		String content = helion.getHtmlContent();
		assertThat(content).isNotNull();
		//System.out.println(content);
	}
	
	@Test
	public void testOfGettingBookTitle() {
		BookShop helion = new HelionBookShop();
		String title = helion.getTitleOfDiscountedBook();
		assertThat(title).isNotNull();
		//System.out.println(title);
	}
	
	@Test
	public void testOfGettingBookDescr() {
		BookShop helion = new HelionBookShop();
		String descr = helion.getDescritpionOfDiscountedBook();
		assertThat(descr).isNotNull();
		//System.out.println(descr);
	}

}
