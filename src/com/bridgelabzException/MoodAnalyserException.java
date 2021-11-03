package com.bridgelabzException;

public class MoodAnalyserException extends Exception {
	    
		public String message;
	    public static ExceptionType exceptionType;

	    enum ExceptionType {
	        ENTRY_IS_NULL,ENTRY_IS_EMPTY;
	    }

	    public MoodAnalyserException(String message, ExceptionType type) {
	        this.message = message;
	        this.exceptionType = type;
	    }

	}
