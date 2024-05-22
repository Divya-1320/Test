package org.pra;

public class ExceptionUserDefined{
	public static void main(String[] args){
		int a =100;
		if (a<100) {
			System.out.println("true");
		} else {
			try {
				throw new WrongNumberException();
			} catch (WrongNumberException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				System.out.println("finally");
			}
			
	}

	

}
}
