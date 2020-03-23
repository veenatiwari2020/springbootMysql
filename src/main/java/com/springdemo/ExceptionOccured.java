package com.springdemo;


public class ExceptionOccured extends Exception{

	/**
	 * @param s
	 */
	public ExceptionOccured(String s) {
		super();
		this.s = s;
	}

	private String s;
	
}
