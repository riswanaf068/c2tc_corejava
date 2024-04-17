package com.problemstatement3;

public class Bicycle {

	private int No_of_greas;
	private int Speed;

	public Bicycle(int no_of_greas, int speed) {
		
		No_of_greas = no_of_greas;
		Speed = speed;
	}
   public int getNo_of_greas() {
		return No_of_greas;
	}
   
   public int getSpeed() {
		return Speed;
	}



	@Override
	public String toString() {
		return " [No of gears are" + No_of_greas + ", speed of bicycle is " + Speed + "]";
	}
	
	
	
	
	
}
