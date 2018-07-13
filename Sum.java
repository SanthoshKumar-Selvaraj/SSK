package problems;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int num;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int a[] = new int [n];
		for(int i = 0 ; i < n ; i++){
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i < n ; i++){
			num = a[i];
			while(num != 0){
				num = num - 1;
				sum = sum + num;
			}
		}
		System.out.println(sum);
	}
}
