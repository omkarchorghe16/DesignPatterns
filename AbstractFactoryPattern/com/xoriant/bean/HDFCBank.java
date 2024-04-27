package com.xoriant.bean;

public class HDFCBank implements Bank {
	private final String BNAME;

	public HDFCBank() {
		BNAME = "HDFC BANK";
	}

	public String getBankName() {
		return BNAME;
	}
}
