package com.easyBank.accounts.mapper;

import com.easyBank.accounts.Entity.Accounts;
import com.easyBank.accounts.Entity.Customer;
import com.easyBank.accounts.dto.AccountsDto;
import com.easyBank.accounts.dto.CustomerDto;

public class CustomerMapper {
	        
	public static CustomerDto mapToCustomerDto(Customer customer, CustomerDto customerDto) {
        customerDto.setName(customer.getName());
        customerDto.setEmail(customer.getEmail());
        customerDto.setMobileNumber(customer.getMobileNumber());
        return customerDto;
    }

    public static Customer mapToCustomer(CustomerDto customerDto, Customer customer) {
        customer.setName(customerDto.getName());
        customer.setEmail(customerDto.getEmail());
        customer.setMobileNumber(customerDto.getMobileNumber());
        return customer;
    }


}
