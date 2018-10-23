package bitwiseoperator;

public class BitwiseOP {
public static void main(String[] args) {
	int a=25;//1 1 0 0 1
	int b=15;//0 1 1 1 1 //1 1
	         // 0100 1=9
	         //11111
	int c=a|b;
	System.out.println(c);
	byte b1=10;
	b1=(byte) (b1+10); 
	System.out.println(b1);
}
}
