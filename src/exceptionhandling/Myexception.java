package exceptionhandling;

public class Myexception extends Exception {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private int ex;
Myexception(int a){
ex=a;	
}
public String toString(){
	//System.out.println("One parameter is less than zero");
	return "One parameter is less than zero";
}
}
