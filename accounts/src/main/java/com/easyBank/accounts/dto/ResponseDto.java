package com.easyBank.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class ResponseDto {
	
	public ResponseDto(String status201, String message201) {
		// TODO Auto-generated constructor stub
	}

	private String statusCode;
	
	private String statusMsg;

}
