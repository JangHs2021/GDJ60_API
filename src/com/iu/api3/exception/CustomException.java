package com.iu.api3.exception;

public class CustomException extends Exception{
	
	public CustomException(){
		super();
	}
	
	public CustomException(String message){
		super(message);
	}
}