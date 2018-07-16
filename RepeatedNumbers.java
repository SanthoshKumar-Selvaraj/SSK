package problems;

import java.util.*;

public class RepeatedNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i = 0 ; i < n ; i++){
			int num = sc.nextInt();
			a.add(num);
		}
		Collections.sort(a);
		Set<Integer>b = new LinkedHashSet<Integer>(a);
		System.out.println(b);
		}
}
