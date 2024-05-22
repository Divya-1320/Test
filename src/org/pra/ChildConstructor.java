package org.pra;

public class ChildConstructor extends ParentConstructor{
	
	public ChildConstructor() {
System.out.println("Child constructor");	
}
	public ChildConstructor(String name) {
   super(20);
System.out.println(name);
	}
	
	public static void main(String[] args) {
		ChildConstructor c = new ChildConstructor("dd ");
	}
}
