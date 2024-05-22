package org.pra;

public class WrongNumberException extends Exception{
@Override
public String getMessage() {
	String m = "Right";
	return m;
}
}
