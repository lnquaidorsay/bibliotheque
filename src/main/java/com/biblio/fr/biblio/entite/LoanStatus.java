package com.biblio.fr.biblio.entite;

public enum LoanStatus {
	OPEN("Open"), CLOSE("Close");

	private String status;

	LoanStatus(String loanStatus) {
		this.status = loanStatus;
	}

	public String getStatus() {
		return status;
	}

	// Get all enums
	/*
	 * for(
	 * 
	 * LoanStatus env:LoanStatus.values()) { System.out.println(env.name() + " :: "
	 * + env.getStatus()); } OPEN :: Open CLOSE :: Close
	 */

	// Using enum constant reference
	/*
	 * String openStatus = LoanStatus.OPEN.getStatus();
	 * 
	 * System.out.println(prodUrl); => Open
	 * https://howtodoinjava.com/java/enum/java-enum-string-example/
	 */
}
