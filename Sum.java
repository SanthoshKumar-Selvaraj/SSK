package guvi1;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		int b[] = new int[a];
		for(int i = 0 ; i < a ; i++){
			b[i] = sc.nextInt();
		}
		for(int i = 0 ; i < a ; i++){
			sum = sum + b[i];
		}
		System.out.println(sum);
	}
}
