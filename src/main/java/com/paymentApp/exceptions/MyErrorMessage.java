package com.paymentApp.exceptions;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MyErrorMessage {
	
	public MyErrorMessage(LocalDateTime now, String message2, String description) {
		// TODO Auto-generated constructor stub
	}

	private LocalDateTime localDateTime;
	
	private String message;
	
	private String detailString;
}
