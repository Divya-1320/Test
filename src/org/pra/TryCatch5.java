package org.pra;

public class TryCatch5 {
	public static void main(String[] args) {
		try {
		System.out.println(1);
		System.out.println(2/0);
		try {
			System.out.println(3);
			System.out.println(4);
		} catch (Exception e) {
			System.out.println("Inner catch");
		}
		finally {
			System.out.println("Inner finally");
		}
	} 
	catch (Exception e) {
		System.out.println("Outer catch");
	}
	finally {
		System.out.println("Outer finally");
	}
	System.out.println(10);
}

}
