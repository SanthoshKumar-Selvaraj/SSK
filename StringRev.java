package guvi1;

import java.util.Scanner;

public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		String s1 = "";
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		String words[] = s.split("\\s");
		for(int i = 0 ; i < words.length ; i++){
		StringBuffer sb = new StringBuffer(words[i]);
		sb.reverse();
		s1 = s1 + sb;
			if(i < words.length - 1)
				s1 = s1 + " ";
		}
		System.out.println(s1);
	}
}
