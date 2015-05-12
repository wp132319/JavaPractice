package org.dimigo.oop;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {

		String  ans1    = "오스피나";
		String  ans2    = "산체스";
		String  ans3    = "코클랭";
		String  input   = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("2015년 5월 현재 아스날 주전 골키퍼는?");
		input = scanner.nextLine();
		if(ans1.equals(input)){
			System.out.println("정답입니다!! ^^");
		}
		else{
			System.out.println("틀렸습니다!! ㅜㅜ");
		}
		
		System.out.println("2015년 5월 현재 아스날 등번호 17번은?");
		input = scanner.nextLine();
		if(ans2.equals(input)){
			System.out.println("정답입니다!! ^^");
		}
		else{
			System.out.println("틀렸습니다!! ㅜㅜ");
		}
		
		System.out.println("2015년 5월 현재 아스날 등번호 34번은?");
		input = scanner.nextLine();
		if(ans3.equals(input)){
			System.out.println("정답입니다!! ^^");
		}
		else{
			System.out.println("틀렸습니다!! ㅜㅜ");
		}
		
		scanner.close();
		
		
	}

}
