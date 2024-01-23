package com.easyBank.accounts.Entity;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
public class Customer extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	@Column(name = "customer_id")
	private Long customerId;

	private String name;

	private String email;

	private String mobileNumber;
	
	

	public Long getCustomerId() {

		return customerId;
	}

	public String getName() {

		return name;
	}

	public String getEmail() {

		return email;
	}

	public String getMobileNumber() {

		return mobileNumber;
	}

	public void setName(String name) {

	}

	public void setEmail(String email) {

	}

	public void setMobileNumber(String mobileNumber) {

	}

}
