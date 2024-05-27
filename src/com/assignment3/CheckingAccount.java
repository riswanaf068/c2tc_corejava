package com.assignment3;

public class CheckingAccount extends Account {
	
	 public void deposit( int a) {
		 
	    	amount+=a;
	    	System.out.println(amount);
	    }
	  public  void withdraw (int a) {
	    	if(amount>a) {
	    	  
	    		System.out.println("withdraw accepted");
	    		System.out.println(amount-=a);
	    	}
	    	else {
	    		System.out.println("insufficient amount");
	    	}
	    	
	    }
	    public void getBalance() {
	    	
	    	System.out.println(amount);
	    }
	    
}
