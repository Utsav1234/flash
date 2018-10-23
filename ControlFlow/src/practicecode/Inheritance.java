package practicecode;

public class Inheritance {
public static void main(String[] args) {
A a=new A();
A a1=new B();
B b=new B();
a.m1();
b.m2();

}
}
class A{
	protected int i;
	void m1(){
		System.out.println("hi m1");
	}
}
class B extends A{
	void m2(){
		System.out.println("hi m2");
	}
}
