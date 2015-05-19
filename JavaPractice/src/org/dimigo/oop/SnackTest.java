package org.dimigo.oop;

public class SnackTest {

	public static void main(String[] args) {
		
		Snack[] snacks = new Snack[3];
		int     sum    = 0;
		
		snacks[0] = new Snack("새우깡","농심",1100,2);
		snacks[1] = new Snack("콘칲","크라운",1200,1);
		snacks[2] = new Snack("허니버터칩","해태",1500,4);
		
		for(Snack v : snacks) {
			v.printSnack();
			sum += v.calcPrice();
		}
		
		System.out.println("총 구매 금액 : " + String.format("%,d",sum) + "원");
		
	}

}
