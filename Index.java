package problems;

import java.util.Scanner;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int m = -1;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0 ; i < n ; i++){
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i < n ; i++){
			if(i == a[i]){
				System.out.print(a[i]+" ");
				cnt++;
			}
		}
		if(cnt == 0)
			System.out.println(m);
	}
}
