package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		
		int   price = 1700000;
		byte  labor = 3;
		short count = 1500;
		long result = (long)price * 12 * (long)labor * (long)count;
		
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여 : "  + String.format("%,d", price) + "원");
		System.out.println("점포 내 직원 수 : " + labor + "명");
		System.out.println("점포 수 : " + String.format("%,d",count) + "개");
		
		System.out.println("");
		System.out.println("연간 인건비 : " + String.format("%,d",result));
		
		// 점포 내 직원 수가 1000명을 넘어가는 경우는 없을 것이라 추정하여,
		// 천 단위 콤마 찍기를 하지 않았습니다.
		
	}

}
