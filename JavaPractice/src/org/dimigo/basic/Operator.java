package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {

		// 사다리꼴 정보
		int s_a    = 9;
		int s_b    = 10;
		double s_h = 5.8;
		double s_r = (s_a + s_b) * s_h / 2;
		
		// 평행사변형 정보
		int p_a    = 9;
		double p_h = 5.4;
		double p_r = p_a * p_h;
		
		
		// 정보 출력
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : " + s_r);
		System.out.println("평행사변형 넓이 : " + p_r);
		System.out.println("");
		System.out.println("");
		
		
		// 결과
		String result = (s_r > p_r) ? "사다리꼴이 평행사변형보다 " + (s_r-p_r) + "더 큽니다." :
									  "평행사변형이 사다리꼴보다 " + (p_r-s_r) + "더 큽니다." ;
		
		System.out.println(result);
		
	}

}
