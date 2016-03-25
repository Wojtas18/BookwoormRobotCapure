package com.academy.BookwormRobot.utils;

import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class StringUtilsTests {

	@Test
	public void testIfReturnTrueIfStringIsEmpty() {

		// given
		String givenString = "";

		// when
		boolean nullOrEmpty = StringUtils.isNullOrEmpty(givenString);

		// then
		assertThat(nullOrEmpty).isTrue();
	}

	@Test
	public void testIfReturnTrueIfStringIsNull() {

		// given
		String givenString = null;

		// when
		boolean nullOrEmpty = StringUtils.isNullOrEmpty(givenString);

		// then
		assertThat(nullOrEmpty).isTrue();
	}
	
	@Test
	public void testIfReturnFalseIfStringIsNotANullAndNotEmpty() {

		// given
		String givenString = "someString";

		// when
		boolean nullOrEmpty = StringUtils.isNullOrEmpty(givenString);

		// then
		assertThat(nullOrEmpty).isFalse();
	}
}
