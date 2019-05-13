package set2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 = n;
		int r = 0;
		int a = 0;
		while(n != 0){
			r = a + (n % 10);
			a = r * 10;
			n = n / 10;
		}
		if(n1 == r)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
