package com.academy.BookwormRobot.enums;

/**
 * Enum which keeps kinds of book shops
 * @author Paulina
 *
 */
public enum BookShopTypes {

	helion(1),
	glownaKsiegarniaNaukowa(2),
	swiatKsiazki(3),
	selkar(4);
	
	/**
	 * It's like helper value
	 */
	private int type;

	private BookShopTypes(int type) {
		this.setType(type);
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	
}
