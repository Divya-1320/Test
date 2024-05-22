package org.pra;

public class ReturnExample {

	private int add() {
int a =1; int b=1;
int c = a+b;
return c;
	}
	
	public static void main(String[] args) {
		ReturnExample r = new ReturnExample();
		int v = r.add();
		System.out.println("result:" +v + 2);
	} 

}
