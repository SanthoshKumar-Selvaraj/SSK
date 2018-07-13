package problems;

import java.util.Scanner;

public class Triplets {

	public static void main(String[] args) {
		
		int n;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int a[] = new int [n];
		for(int i = 0 ; i < n ; i++){
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i < n - 2 ; i++){
			for(int j = i + 1 ; j < n - 1 ; j++){
				if(a[i] > a[j]){
					continue;
				}
				for(int k = j + 1 ; k < n ; k++){
					if(a[i] < a[j] && a[j] < a[k]){
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
