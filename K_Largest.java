package guvi1;

import java.util.Arrays;
import java.util.Scanner;

public class K_Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		int K;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		int a[] = new int[N];
		for(int i = 0 ; i < N ; i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[N-K]);
	}
}
