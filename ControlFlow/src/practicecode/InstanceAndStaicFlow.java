package practicecode;

public class InstanceAndStaicFlow {
int a;
int b=2;
String s,name="abash";
static double d;
public InstanceAndStaicFlow() {
System.out.println("inside cnstr");
}
{
System.out.println("inside instance block");
}
static{
	System.out.println("inside static block");
}
	public static void main(String[] args) {
		InstanceAndStaicFlow ins=new InstanceAndStaicFlow();
		System.out.println(ins.a+"    "+ins.b+"    "+ins.name+"    "+ins.s);
		System.out.println(d);
		System.out.println(ins.d);
		System.out.println(InstanceAndStaicFlow.d);
	}
}

