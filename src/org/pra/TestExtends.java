package org.pra;


public class TestExtends extends TestExtends2 {
	
	private void example1() {
		System.out.println(1);

	}
	public static void main(String[] args) {
		TestExtends t = new TestExtends();
		t.example1();
		t.example2();
}
}
