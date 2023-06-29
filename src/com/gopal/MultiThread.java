package com.gopal;

import java.util.UUID;

class MultiThread extends Thread {
	
	String firstUUID;
	String secondUUID;
	public void run() {
		try {
			
//			System.out.println("Thread " + Thread.currentThread().getId()+ " is running");
			for (long i = 0; i < Long.MAX_VALUE; i++) {
				
				firstUUID = UUID.randomUUID().toString();
				secondUUID= UUID.randomUUID().toString();
				
				System.out.println(String.format("%s %s",firstUUID,secondUUID));
				if(firstUUID.equals(secondUUID)) {
					System.out.println(String.format("UUID matched : \nFirstUUID : %s\nSecondUUID %s",firstUUID,secondUUID));
					System.out.println("Thread " + Thread.currentThread().getId()+ " is running");
					System.exit(0);
				}
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
