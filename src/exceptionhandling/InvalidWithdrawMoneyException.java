package exceptionhandling;

public class InvalidWithdrawMoneyException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
public String toString() {
	return "You dont have enough Money in your Bank";
}
}
