package org.pra;

public class ChilConstructorFour extends ConstructorFour {
	public ChilConstructorFour() {
		super(100);
		System.out.println("Child non parameter");
	}
	
public ChilConstructorFour(int num) {
		System.out.println("Child paramter");
	}

public static void main(String[] args) {
	ChilConstructorFour c = new ChilConstructorFour();
	ChilConstructorFour cc = new ChilConstructorFour(1);
}

}
