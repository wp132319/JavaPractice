package org.dimigo.inheritance;

public class SmartPhoneTest {

	public static void main(String[] args) {
		
		SmartPhone[] phone = {
				new IPhone("iPhone 6", "애플", 700000),
				new Galaxy("갤럭시 S6", "삼성", 650000)
		};
		
		for(SmartPhone p : phone) {
			System.out.println(p);
			p.turnOn();
			p.pay();
			p.useSpecialFunction();
		}
		
	}

}
