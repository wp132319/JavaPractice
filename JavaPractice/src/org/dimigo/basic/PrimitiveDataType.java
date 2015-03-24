package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		// Profile
		String name    = "아이유";
		boolean male   = false;
		int age        = 23;
		double height  = 161.8;
		float weight   = 44.3f;
		char blood     = 'A';
		
		String gender  = (male == true) ? "남자" : "여자";
		
		
		// Print
		System.out.println("<< " + name + " 프로필 >>");
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age + "세" );
		System.out.println("키 : " + height + "cm");
		System.out.println("몸무게 : " + weight + "kg");
		System.out.println("혈액형 : " + blood + "형");
	}

}
