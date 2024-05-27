package com.problemstatement3;

public class MontaneBike extends Bicycle {

	    private int SeatHeight;

		public MontaneBike(int no_of_greas, int speed, int seatHeight) {
			super(no_of_greas, speed);
			SeatHeight = seatHeight;
		
         }

		

		@Override
		public String toString() {
			return " seat height is" + " "+SeatHeight +"  "
					+ " no of gears are "+""+ getNo_of_greas() +"  "+"speed of bicycle is"+ "  "+ getSpeed() + "";
		}

		
		
		

		
		
}