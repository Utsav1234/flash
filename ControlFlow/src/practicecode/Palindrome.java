package practicecode;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		// 123=321not a palin 121=121 is palin
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int r, s = 0;
		int t = n;
		while (n > 0) {
			r = n % 10;// 3
			n = n / 10;// 12
			s = s * 10 + r;
		}
		if (t == s)
			System.out.println("palindrome");
		else {
			System.out.println("not a palindrome");
		}
	}
}
