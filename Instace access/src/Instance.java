

public class Instance {
	int a;
	float b;
  public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public float getB() {
		return b;
	}
	public void setB(float b) {
		this.b = b;
	}
public static void main(String[] args) {
	  Instance i=new Instance();
	  i.setA(19);
	  System.out.println(i.getA());

}
}

