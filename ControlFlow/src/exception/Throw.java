package exception;

public class Throw extends RuntimeException {
static	ArithmeticException a;//=new ArithmeticException();
public static void main(String[] args) {
	//throw new ArithmeticException("/ by");
	throw new Throw();
}
}
