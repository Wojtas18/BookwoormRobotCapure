package com.academy.BookwormRobot.enums;

public enum BookShopTypes {

	helion(1),
	glownaKsiegarniaNaukowa(2),
	swiatKsiazki(3);
	
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
