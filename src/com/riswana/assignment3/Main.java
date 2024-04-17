package  com.riswana.assignment3;

public class Main {

	public static void main(String[] args) {
	Student student =new Student();
	Commision commission =new Commision();
	commission.AcceptDetails_Employee("Riswana","1057 vanji nagar",996754890,0);
	 double commisionAmount =commission.CalculateCommission();
	System.out.println("commisionAmount Commission amount:$"+commisionAmount);
	

	}

}
