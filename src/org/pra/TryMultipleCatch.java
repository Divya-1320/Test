package org.pra;

public class TryMultipleCatch {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
			System.out.println(5/0);
		} 
		catch (NullPointerException e) {
			System.out.println("H");
		}catch (IndexOutOfBoundsException e) {
			System.out.println("Handled");
		}
		finally {
			System.out.println("Finally");
		}
		System.out.println("Outside try");
	}

}
