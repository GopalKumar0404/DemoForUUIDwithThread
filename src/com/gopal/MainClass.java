package com.gopal;

public class MainClass {
	
	public static void main(String[] args) {
		
		
//		long n = 922337203; // Number of threads
		for (long i = 0; i < Long.MAX_VALUE; i++) {
			MultiThread object
				= new MultiThread();
			object.start();
		}
		
	}

}
