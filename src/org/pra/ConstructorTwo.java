package org.pra;

public class ConstructorTwo {
	public ConstructorTwo() {
		System.out.println("Non parameter");
	}
	
	public ConstructorTwo(int age) {
		this();
		this.ConstructorTwo();
		System.out.println("Parametrized ");
	}
		
		public void ConstructorTwo() {
			System.out.println("method");
}
	
	public static void main(String[] args) {
		ConstructorTwo c = new ConstructorTwo(2);
	}
	
}
