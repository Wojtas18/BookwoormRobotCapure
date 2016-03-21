package com.academy.BookwormRobot.bookShop;
import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

public class BookShopTests {
	
	
	@Test
	public void testProperHtmlPrinting() {
		BookShop helion = new HelionBookShop();
		String content = helion.printHtmlContent();
		assertThat(content).isNotNull();
	}

}
