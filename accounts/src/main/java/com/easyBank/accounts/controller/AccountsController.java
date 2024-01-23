package com.easyBank.accounts.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.easyBank.accounts.Constants.AccountsConstants;
import com.easyBank.accounts.dto.CustomerDto;
import com.easyBank.accounts.dto.ResponseDto;

import lombok.AllArgsConstructor;
@AllArgsConstructor
@Validated
@RestController
@RequestMapping(path="/api", produces= {MediaType.APPLICATION_JSON_VALUE})
public class AccountsController {
	
	public ResponseEntity<ResponseDto> createAccount(@RequestBody CustomerDto customerdto)
	{
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(new ResponseDto(AccountsConstants.STATUS_201,AccountsConstants.STATUS_201));
		
		
	}

}
