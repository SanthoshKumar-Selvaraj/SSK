package problems;

import java.util.Arrays;
import java.util.Scanner;

public class ClosestZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		int b[] = new int[a];
		for(int i = 0 ; i < a ; i++){
			b[i] = sc.nextInt();
		}
		int m = 0,x = 0,y = 0;
		int min = 18;
		int c[] = new int[100];
		for(int i = 0 ; i < a ; i++){
			for(int j = i+1 ; j < a ; j++){
				c[m] = b[i] + b[j];
				if(c[m] < 0)
					c[m] = c[m] * -1;
				if(min > c[m]){
					min = c[m];
					x = b[i];
					y = b[j];
				}
			}
		}
		System.out.println(x+" "+y);
	}
}
