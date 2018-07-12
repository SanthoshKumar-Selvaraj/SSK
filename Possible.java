package problems;

import java.util.Scanner;

public class Possible {

	public static void main(String[] args) {
	
		String a;
		String b;
		int c=0;
		int diff =0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		a = sc.next();
		b = sc.next();
		diff = b.length() - a.length();
		for(int i=0;i<diff;i++){
			a = a + "0";
		}
		char c1[] = a.toCharArray();
		char c2[] = b.toCharArray();
		for(int i=0;i<a.length();i++){
			if(c1[i] == c2[i])
				count++;
			else
				break;
		}
		c = b.length() - count;
		System.out.println(c);
	}
}
