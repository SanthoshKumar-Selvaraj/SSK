package problems;

import java.util.*;

public class RepeatedNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int m = 0;
		int count = 0;
		int cnt = 0;
		String out = "";
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int a[] = new int[num];
		int b[] = new int[num];
		for(int i = 0 ; i < num ; i++){
			 a[i] = sc.nextInt();
		}
		for(int i = 0 ; i < num ; i++){
			count = 0;
			for(int j = i ; j < num ; j++){
				if(a[i] == a[j])
					count++;
			}
			if(count > 1){
				b[m] = a[i];
				m++;
			}
		}
		if(m == 0)
			System.out.println("No duplicate");
		else{
		int c = 0;
		for(int i = 0 ; i < m ; i++){
			cnt = 0;
			for(int j = 0 ; j <= i ; j++){
				if(b[i] == b[j])
					cnt++;
			}
			if(cnt == 1){
				if(c != 0)
					out = out + " ";
				out = out + b[i];
				c++;
			}
		}
		System.out.println(Integer.parseInt(out));
	 }
	}
}
