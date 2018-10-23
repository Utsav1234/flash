package exception;

public class SimpleTryCatch  {
public static void main(String[] args) {
	System.out.println("hello");
	
	try{
		//int a=10/0;
		System.out.println("hellotry");
		System.out.println(10/0);
		return;
	}

	catch(	ArithmeticException e){
		System.out.println("helloca");
		//e.printStackTrace();
		//System.out.println(e);
		//System.out.println(e.getMessage());
		//System.out.println(10/0);
	}
	
	finally{
	System.out.println("hellofinal");
	String s=null;
	System.out.println(s.length());
	}
}
}
