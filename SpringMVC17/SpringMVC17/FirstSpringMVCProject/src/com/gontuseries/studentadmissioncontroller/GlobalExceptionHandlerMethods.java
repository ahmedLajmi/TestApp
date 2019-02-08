package com.gontuseries.studentadmissioncontroller;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandlerMethods {

	
	
	@ExceptionHandler(value=NullPointerException.class)
	public String handleNullPointerException(Exception e) {
		//logging Null Pointer Exception
		System.out.println("Null Pointer Exception occured: "+e);
		
		return "NullPointerException";
	}
	
	@ExceptionHandler(value=IOException.class)
	public String handleIOException(Exception e) {
		//logging Null Pointer Exception
		System.out.println("IOException occured: "+e);
		
		return "IOException";
	}
	
	
}
