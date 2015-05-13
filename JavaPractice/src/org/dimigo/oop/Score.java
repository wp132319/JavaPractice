package org.dimigo.oop;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int     kor;
		int     math;
		int     eng;
		int     sum;
		double  average;

		System.out.print("국어 점수 입력 => ");
		kor = scanner.nextInt();
		
		System.out.print("수학 점수 입력 => ");
		math = scanner.nextInt();
		
		System.out.print("영어 점수 입력 => ");
		eng = scanner.nextInt();
		
		sum     = kor + math + eng;
		average = sum / 3.0;

		
		StringBuilder sb = new StringBuilder();
		
		sb.append("<< 점수 출력 >>\n")
		  .append("국어 점수 : ")
		  .append(kor)
		  .append(" 점\n")
		  .append("수학 점수 : ")
		  .append(math)
		  .append(" 점\n")
		  .append("영어 점수 : ")
		  .append(eng)
		  .append(" 점\n")
		  .append("총점 : ")
		  .append(sum)
		  .append(" 점\n")
		  .append("평균 : ")
		  .append(String.format("%.1f",average))
		  .append(" 점\n")
		  .toString();
		
		System.out.println(sb);
		  
		  
		  
		
		
	}

}
