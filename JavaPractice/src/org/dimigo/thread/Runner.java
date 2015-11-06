package org.dimigo.thread;

public class Runner extends Thread {
	
	private String name;
	
	public Runner() {
		
	}
	
	public Runner(String name) {
		this.name = name;
	}
	
	public void run() {
		System.out.println(this.name + " 출발");

		try {
			for(int i=11; i-->0;) {
				System.out.println(this.name + " " + (i*10) + " 미터");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(this.name + " 골인");
	}
	
}
