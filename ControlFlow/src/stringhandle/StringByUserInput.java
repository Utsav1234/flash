package stringhandle;

import java.util.Scanner;

public class StringByUserInput {
public static void main(String[] args) {
	String s1;
	String s2;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter name");
	s1=sc.nextLine();
	s2=sc.nextLine();
	System.out.println("1st String  :"+s1+"   2nd String  "+s2);
	String s3=s1.concat(s2);
	System.out.println(s3);
	int length=s1.length();
	int len=s2.length();
	System.out.println(len+"   "+length);
}
}
