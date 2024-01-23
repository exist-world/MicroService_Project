package com.easyBank.accounts.dto;


import lombok.Data;

@Data

public class AccountsDto {
	
	
	private Long accountNumber;
	
	private String accountType;
	
	private String branchAddress;

	public void setAccountNumber(Long accountNumber) {
		
		
	}

	public void setAccountType(String accountType) {
		
		
	}

	public void setBranchAddress(String branchAddress) {
		
		
	}

	public Long getAccountNumber() {
		
		return accountNumber;
	}

	public String getAccountType() {
		
		return accountType;
	}

	public String getBranchAddress() {
		
		return branchAddress;
	}

	
	
	

}
