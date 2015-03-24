package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {

		short  carType   = 1;    // 1:고속버스, 2:경차, 3:그 외
		String carName   = "";   // 차종
		int    distance  = 10;   // 거리 (km)
		int    price     = 0;    // 기본요금
		int    plusPrice = 0;    // 할증요금
		
		switch(carType){
		case 1:
			carName   = "고속버스";
			price     = 850;
			plusPrice = 300;
			break;
		case 2:
			carName   = "경차";
			price     = 300;
			plusPrice = 200;
			break;
		case 3:
			carName   = "그 외";
			price     = 600;
			plusPrice = 200;
			break;
		}
		
		
		for(int i=(distance-10); i>0; i-=10){
			price += plusPrice;
		}

		System.out.println("<<고속도로 통행료 계산>>");
		System.out.println("거리 : " + distance + "km");
		System.out.println("차종 : " + carName);
		System.out.println("요금 : " + price);
		
	}

}
