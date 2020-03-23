package com.springdemo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class UserNotFondException extends RuntimeException{

	public UserNotFondException(String message){
		
		super(message);
	}
}
