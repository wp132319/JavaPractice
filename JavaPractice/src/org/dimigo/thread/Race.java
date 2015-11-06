package org.dimigo.thread;

public class Race {

	public static void main(String[] args) {
		
		Thread t1 = new Runner("홍길동");
		Thread t2 = new Runner("홍길순");
		
		t1.start();
		t2.start();
		
	}

}
