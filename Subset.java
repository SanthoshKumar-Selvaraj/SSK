package problems;

import java.util.*;

public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int num;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		ArrayList<Integer>a1 = new ArrayList<Integer>();
		ArrayList<Integer>b1 = new ArrayList<Integer>();
		for(int i = 0 ; i < a ; i++){
			num = sc.nextInt();
			a1.add(num);
		}
		for(int i = 0 ; i < b ; i++){
			num = sc.nextInt();
			b1.add(num);
		}
		if(a1.containsAll(b1))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
