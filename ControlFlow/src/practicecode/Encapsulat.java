package practicecode;

public class Encapsulat {

public static void main(String[] args) {
	Enc en=new Enc();
	en.setI(4);
	en.setS("hello");
	System.out.println(en.getI()+"  "+en.getS());
}

}
class Enc{
	private int i;
	private String s;
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
}