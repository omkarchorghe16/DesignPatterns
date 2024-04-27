package com.xoriant.bean;

public class SBIBank implements Bank {
	private final String BNAME;

	public SBIBank() {
		BNAME = "SBI BANK";
	}

	public String getBankName() {
		return BNAME;
	}
}
