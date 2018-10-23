package abstractdemo;

public class AbstractDemo {

	public static void main(String[] args) {
     Suresh s=new Suresh();
     s.call();
     s.dance();
     s.microwave();
     s.move();
     
	}

}
abstract class Mahesh{
	public void call(){
		System.out.println("calling....");
	}
	public abstract void move();
	public abstract void dance();
	public abstract void microwave();
}
abstract class Ramesh extends Mahesh{
	public void move(){
		System.out.println("moving...");
	}
}
class Suresh extends Ramesh
{
	public void dance() {
	System.out.println("dancing...");
	}
	public void microwave() {
	System.out.println("cooking...");
	}
	} 
