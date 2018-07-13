package problems;

import java.util.Scanner;

public class SumOfDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		String b;
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		Scanner sc = new Scanner(System.in);
		a = sc.next();
		b = sc.next();
		int diff = a.length() - b.length();
		if(diff < 0)
			diff = -diff;
		for(int i=0;i<a.length();i++){
			int n = a.charAt(i);
			sum1 = sum1 + n;
		}
		for(int i=0;i<b.length();i++){
			int n = b.charAt(i);
			sum2 = sum2 + n;
		}
		sum = sum2 - sum1;
		if(sum < 0)
			sum = -sum;
		sum = sum - (diff * 96);
		System.out.println(sum);
	}
}
