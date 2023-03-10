package model;

public class Bank {
	
	private String bankId;
	private String bankName;
	
	public Bank(String bankId, String bankName) {
		this.bankId = bankId;
		this.bankName = bankName;
	}

	public String getBankId() {
		return bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

}
