package problems;

import java.util.Scanner;

public class Singletimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0 ; i < n ; i++){
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i < n ; i++){
			cnt = 0;
			for(int j = 0 ; j < n ; j++){
				if(a[i] == a[j])
					cnt++;
			}
			if(cnt == 1)
				System.out.print(a[i]+" ");
		}
	}
}
