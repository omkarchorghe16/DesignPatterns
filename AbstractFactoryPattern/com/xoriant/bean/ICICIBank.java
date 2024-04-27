package com.xoriant.bean;

public class ICICIBank implements Bank {
	private final String BNAME;

	public ICICIBank() {
		BNAME = "ICICI BANK";
	}

	public String getBankName() {
		return BNAME;
	}
}
