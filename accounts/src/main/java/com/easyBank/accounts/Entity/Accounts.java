package com.easyBank.accounts.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Accounts extends BaseEntity {

	@Column(name = "customer_id")
	private Long customerId;

	@Id
	@Column(name = "account_number")
	private Long accountNumber;

	@Column(name = "account_type")
	private String accountType;

	@Column(name = "branch_address")
	private String branchAddress;
	
	public void setCustomerId(Long string) {

	}

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
