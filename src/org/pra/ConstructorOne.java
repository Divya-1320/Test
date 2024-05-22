package org.pra;

public class ConstructorOne {
	
	public ConstructorOne() {
		this.ConstructorOne(20);
		System.out.println("One");
	}
	public void ConstructorOne(int age) {
	System.out.println("2");
	}
	
	public static void main(String[] args) {
		ConstructorOne c = new ConstructorOne();
	}

}
