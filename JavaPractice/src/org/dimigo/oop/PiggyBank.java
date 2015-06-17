package org.dimigo.oop;

public class PiggyBank {
	
	private static int balance;
	
	public static void putMoney(FamilyMember member, int amount) {
		balance += amount;
		System.out.println(member.getMemberName() + " " + amount + "원 넣음");
	}
	
	public static void stealMoney(FamilyMember member, int amount) {
		if(amount > balance){
			System.out.println("돼지저금통 총 금액보다 더 많을 수 없습니다.");
			printBalance();
			
			return;
		}
		
		else{
			balance -= amount;
			System.out.println(member.getMemberName() + " " + amount + "원 훔침");
		}
	}
	
	public static void printBalance() {
		System.out.println("돼지저금통 총 금액 : " + balance + "원");
	}
	
}
