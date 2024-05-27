package com.assignment3;
public class SavingAccount extends Account {
	
	
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
	    
   public static void main(String[] args) {
	    	SavingAccount s1=new SavingAccount();
	    	s1.deposit(1000);
	    	s1.withdraw(5000);
	    	s1.getBalance();
	    	
	    }
	    
}
 

	
	
	
