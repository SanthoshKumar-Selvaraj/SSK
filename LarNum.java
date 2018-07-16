package problems;

import java.util.*;

public class LarNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		            int num;
		            int n;
		            Scanner s = new Scanner(System.in);
		            num = s.nextInt();
		            Set<Integer> s1 = new LinkedHashSet<Integer>();
		            for(int i = 0; i < num ; i++){
		                n = s.nextInt();
		                s1.add(n);
		            }
		            ArrayList<Integer> a1 = new ArrayList<Integer> (s1);
		            Collections.sort(a1,Collections.reverseOrder());
		            for(int i : a1){
		                System.out.print(i);
		            }		
	}

}
