package abstractdemo;

public class PhoneDemo {
	public static void main(String[] args) {
		Iphone obj=new Iphone();
		Samsung obj1=new Samsung();
		show(obj);
		
	}
	public static void show(phone obj){
		obj.showConfig();
	}
/*	public static void show(Iphone obj){
		obj.showConfig();
	}
	public static void show(Samsung obj1){
		obj1.showConfig();
	*/}

abstract class phone{
	public abstract void showConfig();
}
class Iphone extends phone{
	public void showConfig(){
		System.out.println("2gb,ios");
	}
}
class Samsung extends phone{
	public void showConfig(){
		System.out.println("1gb ram,lollipop");
	}
}