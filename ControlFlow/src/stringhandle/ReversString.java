package stringhandle;

import java.util.Scanner;

public class ReversString {
public static void main(String[] args) {
	String orignal;
	String rev="";
	Scanner sc=new Scanner(System.in);
	orignal=sc.nextLine();
/*	int len=orignal.length();
	for (int i =len-1; i>=0; --i) {
		rev=rev+orignal.charAt(i);
	}*/
	StringBuffer sb=new StringBuffer(orignal);
	rev=sb.reverse().toString();
	
	System.out.println(orignal);
	System.out.println(rev);
}
}
