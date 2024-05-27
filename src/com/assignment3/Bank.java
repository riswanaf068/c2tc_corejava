package com.assignment3;

abstract class Bank {

	static int totalAccounts=3;
	
	  abstract void sharedAccount(int a);
	/*{
		
		System.out.println (totalAccounts+=a);
	}*/
	static int getTotalAccounts() {
		return  totalAccounts;
	}
	 public static void main(String[] args) {
		
	
		 getTotalAccounts();
	 }
}
