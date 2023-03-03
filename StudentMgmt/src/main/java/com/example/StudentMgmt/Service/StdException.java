package com.example.StudentMgmt.Service;

public class StdException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StdException(Long id)
	{
	 super ("couldn't find Student");
	}

}
