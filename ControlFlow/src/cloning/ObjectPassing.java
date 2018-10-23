package cloning;

public class ObjectPassing {
	public static void main(String[] args) {
	Paper p=new Paper();
	p.setS("Hello World");
	System.out.println(p.getS());
	Printer hp=new Printer();
	hp.show(p);
	}
}
class Paper{
	String s;

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
}
class Printer{
	public void show(Paper p){
		System.out.println("get lost");
	}
}