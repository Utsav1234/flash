package practicecode;

import java.util.Scanner;

public class Fibonacci {
public static void main(String[] args) {
	// output: 1 1 2 3 5 8 13 21
	
	int a=1,b=1,k;
	k=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any value to find fibonacci number");
	int n=sc.nextInt();
	System.out.print(a+" "+b+" ");
	while(k<=n){
		k=a+b;
		System.out.print(k+" ");
		a=b;
		b=k;
	}
		
}
}
