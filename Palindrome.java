package guvi1;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		String str_rev = "";
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		Stack s = new Stack();
		for(int i = 0 ; i < str.length() ; i++){
			s.push(str.charAt(i));
		}
		while(!s.isEmpty()){
			str_rev = str_rev + s.pop();
		}
		if(str.equals(str_rev))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
