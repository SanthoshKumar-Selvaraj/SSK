package problems;

import java.util.Scanner;

public class EvenOddPos {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int a[] = new int[num];
		for(int i = 0 ; i < num ; i++){
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i < num ; i++){
			if(((i & 1) == 0 && (a[i] & 1) != 0) || ((i & 1) != 0 && (a[i] & 1) == 0))
				System.out.print(a[i]+" ");
		}
	}
}
