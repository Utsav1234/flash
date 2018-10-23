package exception;

public class Throws {
public static void main(String[] args) throws InterruptedException {
	//Thread.sleep(1000);
	//BY TRY CATCH
	m1();
	
}

private static void m1() throws InterruptedException {
	m2();
	
}

private static void m2() throws InterruptedException {
	Thread.sleep(1000);
	
}
}
