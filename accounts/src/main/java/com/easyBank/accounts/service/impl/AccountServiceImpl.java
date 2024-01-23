package com.easyBank.accounts.service.impl;

import java.util.Optional;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.easyBank.accounts.Constants.AccountsConstants;
import com.easyBank.accounts.Entity.Accounts;
import com.easyBank.accounts.Entity.Customer;
import com.easyBank.accounts.dto.CustomerDto;
import com.easyBank.accounts.exception.CustomerAlreadyExistsException;
import com.easyBank.accounts.mapper.CustomerMapper;
import com.easyBank.accounts.repository.AccountsRepository;
import com.easyBank.accounts.repository.CustomerRepository;
import com.easyBank.accounts.service.IAccountService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements IAccountService{

	private AccountsRepository accountRepository;
	private CustomerRepository customerRepository;
	
	
	@Override
	public void createAccount(CustomerDto customerDto) {
		// TODO Auto-generated method stub
		Customer customer = CustomerMapper.mapToCustomer(customerDto, new Customer());
		Optional<Customer> optionalCustomer = customerRepository.findByMobileNumber(customerDto.getMobileNumber());
		if(optionalCustomer.isPresent())
		{
			throw new CustomerAlreadyExistsException("Customer Already register with given Mobile Number : "
		+ customerDto.getMobileNumber());
		}
		Customer savedCustomers = customerRepository.save(customer);
		accountRepository.save(createNewAccounts(savedCustomers));
		
	}
	
	private Accounts createNewAccounts(Customer customer)
	{
		Accounts newAccount = new Accounts();
		newAccount.setCustomerId(customer.getCustomerId());
		long randonAccNumber = 1000000000L + new Random().nextInt(900000000);
		
		newAccount.setAccountNumber(randonAccNumber);
		newAccount.setAccountType(AccountsConstants.SAVINGS);
		newAccount.setBranchAddress(AccountsConstants.ADDRESS);
		return newAccount;
	}

}
